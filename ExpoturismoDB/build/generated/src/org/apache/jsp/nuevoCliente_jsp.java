package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevoCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                background-image: url(Venecia.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .logo{\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .title{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-left: 370px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .button{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"logo\"><image src=\"logo_pagina.png\"/></div>\n");
      out.write("        <div class=\"title\"><h2>NUEVO CLIENTE:</h2></div>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <table text-align=\"center\">\n");
      out.write("                \n");
      out.write("                    <form action=\"ServletAnadirC\" method=\"GET\" id=\"anadir\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                            NOMBRE: <input type=\"text\" name=\"nombre\"><br><br>\n");
      out.write("                            CEDULA: <input type=\"text\" name=\"cedula\"><br><br>\n");
      out.write("                            DESTINO: <input type=\"text\" name=\"destino\"><br><br>\n");
      out.write("                            ACOMPAÑANTES: <input type=\"text\" name=\"acompanantes\">\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                            EMAIL: <input type=\"text\" name=\"email\" form=\"anadir\"><br><br>\n");
      out.write("                            TELÉFONO: <input type=\"text\" name=\"telefono\" form=\"anadir\"><br><br>\n");
      out.write("                            FECHA: <input type=\"text\" name=\"fecha\" form=\"anadir\"><br><br>\n");
      out.write("                            </td>   \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <div class=\"button\"><input type=\"submit\" value=\"AÑADIR CLIENTE\" form=\"anadir\"/></div>\n");
      out.write("                        </tr>\n");
      out.write("                    </form>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div><br><br>\n");
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
