<%-- 
    Document   : opciones
    Created on : 11/03/2017, 06:03:54 PM
    Author     : PC USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador de Base de Datos</title>
        <style>
            body {
                background-image: url(Hawaii.jpg);
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
            }
            
            .logo{
                text-align: center;
            }
            
            input{
                margin-right: 50px;
            }
            input[type=submit] {
                background:#ccc; 
                border:0 none;
                cursor:pointer;
                -webkit-border-radius: 5px;
                border-radius: 5px; 
            }
            
            .h4{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <br><br><br><br>
        <div class="logo"><image src="logo_pagina.png"/></div><br>
        <div class="h4"><h3>Escoge una de las siguientes opciones:</h3></div><br><br>
        <div>
            <table>
                <tr>
                    <td>
                        <form action="nuevoCliente.jsp">
                            <input type="submit" value="Nuevo Cliente" style="margin-left: 200px">
                        </form>
                    </td>
                
                    <td>
                        <form action="buscarCliente.jsp">
                                           <input type="submit" value="Buscar Cliente">
                        </form>
                    </td>
                    
                    <td>
                        <form action="editarCliente.jsp">
                            <input type="submit" value="Editar Cliente">
                        </form>
                    </td>
                    
                    <td>
                        <form action="nuevoUsuario.jsp">
                            <input type="submit" value="Nuevo Usuario">
                        </form>
                    </td>
                    
                    <td>
                        <form action="nuevoRecordatorio.jsp">
                            <input type="submit" value="Nuevo Recordatorio">
                        </form>
                    </td>
                    
                    <td>
                        <form action="programas.jsp">
                            <input type="submit" value="Programas">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
