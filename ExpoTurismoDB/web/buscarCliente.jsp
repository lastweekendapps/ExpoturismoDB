<%-- 
    Document   : buscarCliente
    Created on : 11/03/2017, 08:01:07 PM
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
                background-image: url(London.jpg);
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
            }
            
            .logo{
                text-align: right;
            }
            
            .title{
                text-align: center;
                color: #ffffff;
            }
            
            .subtitle{
                color: #000000;
                margin-left: 370px;
            }
            
            .form{
                text-align: center;
                margin-left: 340px;
                color: #ffffff;
            }
            
            .borrar{
                text-align: center;
            }
            
            .fForm{
                text-align: center;
                margin-left: 370px;
                color: #ffffff;
            }
            
            .btn {
                background: #3498db;
                background-image: -webkit-linear-gradient(top, #3498db, #2980b9);
                background-image: -moz-linear-gradient(top, #3498db, #2980b9);
                background-image: -ms-linear-gradient(top, #3498db, #2980b9);
                background-image: -o-linear-gradient(top, #3498db, #2980b9);
                background-image: linear-gradient(to bottom, #3498db, #2980b9);
                -webkit-border-radius: 28;
                -moz-border-radius: 28;
                border-radius: 28px;
                text-shadow: 1px 1px 3px #666666;
                font-family: Arial;
                color: #ffffff;
                font-size: 12px;
                padding: 10px 20px 10px 20px;
                text-decoration: none;
            }

            .btn:hover {
                background: #3cb0fd;
                background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
                background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
                background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
                background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
                background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
                text-decoration: none;
            }
            
            .enjoy-input {
                display: inline-block;
                -webkit-box-sizing: content-box;
                -moz-box-sizing: content-box;
                box-sizing: content-box;
                padding: 5px 20px;
                border: 1px solid #b7b7b7;
                -webkit-border-radius: 3px;
                border-radius: 3px;
                font: normal medium/normal Arial, Helvetica, sans-serif;
                color: rgba(0,142,198,1);
                -o-text-overflow: clip;
                text-overflow: clip;
                background: rgba(252,252,252,1);
                -webkit-box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) inset;
                box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) inset;
                text-shadow: 1px 1px 0 rgba(255,255,255,0.66) ;
                -webkit-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
                -moz-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
                -o-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
                transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
            }

            .enjoy-input:hover {
                border: 1px solid #a3a3a3;
                background: rgba(255,255,255,1);
                -webkit-transition: all 100ms cubic-bezier(0.42, 0, 0.58, 1);
                -moz-transition: all 100ms cubic-bezier(0.42, 0, 0.58, 1);
                -o-transition: all 100ms cubic-bezier(0.42, 0, 0.58, 1);
                transition: all 100ms cubic-bezier(0.42, 0, 0.58, 1);
            }

            .enjoy-input:focus {
                border: 1px solid #018dc4;
                -webkit-box-shadow: 4px 4px 4px 0 rgba(0,0,0,0.2) inset;
                box-shadow: 4px 4px 4px 0 rgba(0,0,0,0.2) inset;
                -webkit-transition: all 50ms cubic-bezier(0.42, 0, 0.58, 1);
                -moz-transition: all 50ms cubic-bezier(0.42, 0, 0.58, 1);
                -o-transition: all 50ms cubic-bezier(0.42, 0, 0.58, 1);
                transition: all 50ms cubic-bezier(0.42, 0, 0.58, 1);
            }
        </style>    
    </head>
    <body>
        <div class="logo"><image src="logo_pagina.png"/></div>
        <div class="title"><h2>BUSCAR CLIENTE</h2></div><br>
        <div class="subtitle"><h3>Ingrese la cedula del cliente:</h3></div><br>
        <div class="fForm">
            <table >
                <tr>
                    <form action="ServletBB" method="GET" id="searchndestroy">
                        <td>
                            <input class="enjoy-input" type="text" name="busqueda">
                        </td>
                        <td>
                            <input class="btn" type="submit" value="Buscar" form="searchndestroy" class="formulario">
                            <%
                                String cc = (String)request.getAttribute("cedula");
                                String name = (String)request.getAttribute("nombre");
                                String correo = (String)request.getAttribute("email");
                                String tel = (String)request.getAttribute("telefono");
                              %>
                            
                        </td>
                    </form>
                    <td style="padding-left: 150px">
                        <form action="listarClientes.jsp" method="GET">
                            <input class="btn" type="submit" value="Listar a todos los clientes">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
        <br><br>
        <div class="form">
            <table text-align="center">
                <tr>
                    <td>
                        NOMBRE: <input class="enjoy-input" type="text" name="nombre" form="searchndestroy" <%if(name != null){%>value="<%=name%>"<%}%>><br><br>
                        CEDULA: <input class="enjoy-input" type="text" name="cedula" form="searchndestroy"<%if(cc != null){%>value="<%=cc%>"<%}%>><br><br>
                    </td>
                    <td style="padding-left: 50px">
                            EMAIL: <input class="enjoy-input" type="text" name="email" form="searchndestroy"<%if(correo != null){%>value="<%=correo%>"<%}%>><br><br>
                            TELÉFONO: <input class="enjoy-input" type="text" name="telefono" form="searchndestroy"<%if(tel != null){%>value="<%=tel%>"<%}%>><br><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="borrar">
                            <form action ="ServletBorrarCliente" method="get" name="borrar">
                                <input style="margin-left: 300px" class="btn" type="submit" value="Borrar" class="formulario">
                            </form>
                        </div>
                    </td>
                </tr>
                
            </table>
        </div>
    </body>
</html>
