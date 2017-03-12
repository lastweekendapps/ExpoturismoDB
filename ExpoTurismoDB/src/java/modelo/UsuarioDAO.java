package modelo;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UsuarioDAO {
    
    private RandomAccessFile raf;
    private RandomAccessFile rafTree;
    private long ref;
    private long finalTreeLenght;

    public UsuarioDAO() throws FileNotFoundException, IOException, EOFException {

        this.raf = new RandomAccessFile("/Volumes/NICOLAS/usuarios.txt", "rw");
        this.rafTree = new RandomAccessFile("/Volumes/NICOLAS/usuarios.txt", "rw");//Maneja el árbol en el archivo usuarios.txt

        this.raf.seek(0);

        try {
            ref = this.raf.readLong();
            finalTreeLenght = ref;
        } catch (EOFException e) {
            finalTreeLenght = 8;
            this.raf.seek(0);

            for (int i = 0; i < 2808; i = i + 2) {
                this.raf.writeChar('\u0000');
            }
        }

    }
   

    public void crearArchivo(UsuarioVO user) throws IOException {

        raf.seek(raf.length());//Salta en el archivo hasta la última posición
        long posición = raf.getFilePointer();

        raf.writeInt(user.getId());//Mete el ID en el archivo

        
        //Mete el nombre en el archivo con los espacios adicionales para completar el tamaño
        for (int i = 0; i < user.getUser().length; i++) {
            raf.writeChar(user.getUser()[i]);
        }
        for (int i = user.getUser().length; i < 20; i++) {
            raf.writeChar('\u0000');
        }

        //Mete el correo en el archivo con los espacios adicionales para completar el tamaño
        for (int i = 0; i < user.getPassword().length; i++) {
            raf.writeChar(user.getPassword()[i]);
        }
        for (int i = user.getPassword().length; i < 20; i++) {
            raf.writeChar('\u0000');
        }
        arbol(user.getId(), posición);

    }

    private void arbol(int id, long pos) throws FileNotFoundException, IOException {
        rafTree.seek(8);
        boolean flag = false;

        while (!flag) {
            long posicion = this.rafTree.getFilePointer();

            if (finalTreeLenght == 8) {
               

                this.rafTree.seek(finalTreeLenght);
                this.rafTree.writeInt(id);
                this.rafTree.writeLong(-1);
                this.rafTree.writeLong(-1);
                this.rafTree.writeLong(pos);


                finalTreeLenght = this.rafTree.getFilePointer();

                this.rafTree.seek(0);
                this.rafTree.writeLong(finalTreeLenght);

                flag = true;

            } else {
                int actual = this.rafTree.readInt();

                this.rafTree.seek(posicion);

                if (actual < id) {

                    this.rafTree.seek(posicion + 12);
                    long derPos = this.rafTree.readLong();
                    this.rafTree.seek(posicion + 12);

                    if (derPos == -1) {
                        this.rafTree.writeLong(finalTreeLenght);//???????????????????
                        this.rafTree.seek(finalTreeLenght);
                        this.rafTree.writeInt(id); //Revisar
                        this.rafTree.writeLong(-1);
                        this.rafTree.writeLong(-1);
                        this.rafTree.writeLong(pos);

                        flag = true;

                        finalTreeLenght = this.rafTree.getFilePointer();
                        this.rafTree.seek(0);
                        this.rafTree.writeLong(finalTreeLenght);

                    } else {
                        //arbol(derPos, id, pos, cont);
                        this.rafTree.seek(derPos);
                    }
                } else {

                    this.rafTree.seek(posicion + 4);
                    long izqPos = this.rafTree.readLong();
                    this.rafTree.seek(posicion + 4);
                    if (izqPos == -1) {
                        this.rafTree.writeLong(finalTreeLenght);
                        this.rafTree.seek(finalTreeLenght);
                        this.rafTree.writeInt(id); //Revisar
                        this.rafTree.writeLong(-1);
                        this.rafTree.writeLong(-1);
                        this.rafTree.writeLong(pos);

                        flag = true;

                        finalTreeLenght = this.rafTree.getFilePointer();
                        this.rafTree.seek(0);
                        this.rafTree.writeLong(finalTreeLenght);
                    } else {

                        this.rafTree.seek(izqPos);
                    }
                }
            }
        }

    }

    public long buscarUsuario(int id) throws IOException {

        int cont = 0;
        boolean flag = false;
        rafTree.seek(8);
        while (!flag) {
            int actual = this.rafTree.readInt();
            if (actual < id) {
                this.rafTree.skipBytes(8);
                long posDer = this.rafTree.readLong();
                if (posDer != -1) {
                    this.rafTree.seek(posDer);
                } else {
                    flag = true;
                }
            } else if (actual > id) {
                long posIzq = this.rafTree.readLong();
                if (posIzq != -1) {
                    this.rafTree.seek(posIzq);
                } else {
                    flag = true;
                }
            } else if (actual == id) {
                this.rafTree.skipBytes(16);
                return this.rafTree.readLong();
            }
        }
        return -1;
    }

    public boolean borrarUsuario(int id) throws IOException {

        long pos = buscarUsuario(id);

        if (pos == -1) {
            return false;
        } else {
            rafTree.seek(28 * ((pos - 2808) / 84) + 8);
            rafTree.skipBytes(20);
            rafTree.writeLong(-1);
            return true;
        }

    }

    public boolean cambiarContraseña(int id, String password, String newP) throws IOException {

        long pos = buscarUsuario(id);

        if (pos == -1) {

            return false;

        } else {

            rafTree.seek(pos);
            rafTree.skipBytes(44);
            String p = "";

            for (int i = 0; i < 40; i = i + 2) {

                p = p + rafTree.readChar();

            }
            String actual = "";
            for (int i = 0; i < p.length(); i++) {

                if (p.charAt(i) == '\u0000') {

                    break;

                } else {
                    actual = actual + p.charAt(i);

                }
            }

            if (password.equals(actual)) {

                rafTree.seek(pos + 44);

                for (int i = 0; i < newP.length(); i++) {
                    rafTree.writeChar(newP.charAt(i));
                }
                for (int i = newP.length(); i < 20; i++) {
                    rafTree.writeChar('\u0000');
                }
                return true;

            } else {
                return false;
            }

        }
    }

}
