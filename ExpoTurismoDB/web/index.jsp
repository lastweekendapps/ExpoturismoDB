<%-- 
    Document   : index
    Created on : 11/03/2017, 03:11:18 PM
    Author     : PC USUARIO
--%>
<%--@page import="Imagenes.*"--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Base de Datos - ExpoTurismo</title>
        <style>
            body {
                background-image: url(Egipto.jpg);
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
            }
            .wrapper{
                width: 1100px;
                margin: 0 auto;
            }
            
            .col3{
               float: left;
               width: 33.33%
            }
            .titulo{
                text-align: center;
            }
            .logo{
                text-align: right;
            }
            .usuario{
                text-align: center;
            }
            .clearfix:after {
                visibility: hidden;
                display: block;
                font-size: 0;
                content: " ";
                clear: both;
                height: 0;
            }
            .clearfix { display: inline-block; }
            /* start commented backslash hack \*/
            * html .clearfix { height: 1%; }
            .clearfix { display: block; }
            /* close commented backslash hack */
        </style>
    </head>
    <body>
        <div>
            <div class="col3">&nbsp;</div>
            <div class="col3 titulo"><h3>INICIAR SESIÓN</h3></div>
            <div class="col3 logo"><image src="logo_pagina.png"/></div>
            <div class="usuario">
                <form action="ServletIndex" method="GET">
                    USUARIO: <input type="text" name="usuario"/></br></br>
                    CONTRASEÑA: <input type="text" name="contrasena"/></br></br>
                    <input type="submit" value="ENTRAR"/>
                </form>
            </div>
            <div class="clearfix"></div>
        </div>
        
       
    </body>
</html>
