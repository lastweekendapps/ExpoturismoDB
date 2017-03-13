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
                background-image: url(Praga.jpg);
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
            
            .editar{
                text-align: center;
            }
            
            .fForm{
                text-align: center;
                margin-left: 370px;
                color: #ffffff;
            }
            
            .buscar{
                width: 490px;
            }
        </style>    
    </head>
    <body>
        <div class="logo"><image src="logo_pagina.png"/></div>
        <div class="title"><h2>EDITAR CLIENTE</h2></div><br>
        <div class="subtitle"><h3>Ingrese la cedula del cliente:</h3></div><br>
        <div class="fForm">
            <table >


                <form action="ServletEdit" method="GET" name="edit">
                    <tr>
                        <td>
                            <input type="text" name="busqueda" class="buscar">
                        </td>
                        <td>
                            <input type="submit" value="Buscar" form="edit">
                            <%
                                String cc = (String) request.getAttribute("cedula");
                                String name = (String) request.getAttribute("nombre");
                                String correo = (String) request.getAttribute("email");
                                String tel = (String) request.getAttribute("telefono");
                            %>
                        </td>
                        <td>
                            <div class="editar">
                                <input type="submit" value="Editar" form="edit">
                            </div>
                        </td>
                    </tr>
            </table>
        </div>
        <br><br>
        <div class="form">
            <table text-align="center">
                <tr>
                    <td>
                        NOMBRE: <input type="text" name="nombre" form="edit"<%if (name != null) {%>value="<%=name%>"<%}%>><br><br>
                        CEDULA: <input type="text" name="cedula" form="edit"<%if (cc != null) {%>value="<%=cc%>"<%}%>><br><br>
                    </td>
                    <td style="padding-left: 50px">
                        EMAIL: <input type="text" name="email" form="edit"<%if (correo != null) {%>value="<%=correo%>"<%}%>><br><br>
                        TELÉFONO: <input type="text" name="telefono" form="edit"<%if (tel != null) {%>value="<%=tel%>"<%}%>><br><br>
                    </td>
                </tr>
            </table>
        </form>


    </div><br><br>


</body>
</html>
