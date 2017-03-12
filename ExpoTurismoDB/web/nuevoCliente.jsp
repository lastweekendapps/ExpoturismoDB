<%-- 
    Document   : nuevoCliente
    Created on : 11/03/2017, 06:40:23 PM
    Author     : PC USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background-image: url(Venecia.jpg);
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
            }
            
            .logo{
                text-align: left;
            }
            
            .title{
                text-align: center;
            }
            
            .form{
                text-align: center;
                margin-left: 370px;
            }
            
            .button{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="logo"><image src="logo_pagina.png"/></div>
        <div class="title"><h2>NUEVO CLIENTE:</h2></div>
        <div class="form">
            <table text-align="center">
                <tr>
                    <td>
                        <form action="ServletAnadirC" method="GET" id="anadir">
                            NOMBRE: <input type="text" name="nombre"><br><br>
                            CEDULA: <input type="text" name="cedula"><br><br>
                            DESTINO: <input type="text" name="destino"><br><br>
                            ACOMPAÑANTES: <input type="text" name="acompanantes">
                        </form>
                    </td>
                    <td>
                            EMAIL: <input type="text" name="email" form="anadir"><br><br>
                            TELÉFONO: <input type="text" name="telefono" form="anadir"><br><br>
                            FECHA: <input type="text" name="fecha" form="anadir"><br><br>
                    </td>
                </tr>
            </table>
        </div><br><br>
        <div class="button"><input type="submit" value="AÑADIR CLIENTE" form="anadir"/></div>
    </body>
</html>
