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
                margin-left: 370px;
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
                            <input type="text" name="busqueda">
                        </td>
                        <td>
                            <input type="submit" value="Buscar" form="searchndestroy" class="formulario">
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
                            <input type="submit" value="Listar a todos los clientes">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
        <br><br>
        <div class="formulario">
            <table text-align="center">
                <tr>
                    <td>
                        NOMBRE: <input type="text" name="nombre" form="searchndestroy" <%if(name != null){%>value="<%=name%>"<%}%>><br><br>
                        CEDULA: <input type="text" name="cedula" form="searchndestroy"<%if(cc != null){%>value="<%=cc%>"<%}%>><br><br>
                    </td>
                    <td style="padding-left: 50px">
                            EMAIL: <input type="text" name="email" form="searchndestroy"<%if(correo != null){%>value="<%=correo%>"<%}%>><br><br>
                            TELÉFONO: <input type="text" name="telefono" form="searchndestroy"<%if(tel != null){%>value="<%=tel%>"<%}%>><br><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="borrar">
                            <form action ="ServletBorrarCliente" method="get" name="borrar">
                                <input type="submit" value="Borrar" class="formulario">
                            </form>
                        </div>
                    </td>
                </tr>
                
            </table>
        </div>
        
    </body>
</html>
