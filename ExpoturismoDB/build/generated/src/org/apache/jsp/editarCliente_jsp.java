package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(Praga.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .logo{\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .title{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .subtitle{\n");
      out.write("                color: #000000;\n");
      out.write("                margin-left: 370px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-left: 370px;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .editar{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .fForm{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-left: 370px;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .buscar{\n");
      out.write("                width: 490px;\n");
      out.write("            }\n");
      out.write("        </style>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"logo\"><image src=\"logo_pagina.png\"/></div>\n");
      out.write("        <div class=\"title\"><h2>EDITAR CLIENTE</h2></div><br>\n");
      out.write("        <div class=\"subtitle\"><h3>Ingrese la cedula del cliente:</h3></div><br>\n");
      out.write("        <div class=\"fForm\">\n");
      out.write("            <table >\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                        <form action=\"ServletEdit\" method=\"GET\" name=\"edit\">\n");
      out.write("                            <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"busqueda\" class=\"buscar\">\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"submit\" value=\"Buscar\" form=\"edit\">\n");
      out.write("                                ");

                                    String cc = (String)request.getAttribute("cedula");
                                    String name = (String)request.getAttribute("nombre");
                                    String correo = (String)request.getAttribute("email");
                                    String tel = (String)request.getAttribute("telefono");
                                
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"editar\">\n");
      out.write("                                    <input type=\"submit\" value=\"Editar\" form=\"edit\">\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                            </table>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <table text-align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                            NOMBRE: <input type=\"text\" name=\"nombre\" form=\"edit\"");
if(name != null){
      out.write("value=\"");
      out.print(name);
      out.write('"');
}
      out.write("><br><br>\n");
      out.write("                            CEDULA: <input type=\"text\" name=\"cedula\" form=\"edit\"");
if(cc != null){
      out.write("value=\"");
      out.print(cc);
      out.write('"');
}
      out.write("><br><br>\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"padding-left: 50px\">\n");
      out.write("                            EMAIL: <input type=\"text\" name=\"email\" form=\"edit\"");
if(correo != null){
      out.write("value=\"");
      out.print(correo);
      out.write('"');
}
      out.write("><br><br>\n");
      out.write("                            TELÉFONO: <input type=\"text\" name=\"telefono\" form=\"edit\"");
if(tel != null){
      out.write("value=\"");
      out.print(tel);
      out.write('"');
}
      out.write("><br><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                        </form>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div><br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
