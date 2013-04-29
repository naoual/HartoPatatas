package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AltaUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Alta Usuario </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- TOP BAR -->\n");
      out.write("\t<div id=\"top-bar\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"page-full-width strong em\">\n");
      out.write("                    <a href=\"#\" id=\"company-branding\" class=\"fl\"><img src=\"images/logo_DIPUTACION.jpg\"/></a>\n");
      out.write("                    <div id=\"cabz\">\n");
      out.write("                    <h1>Diputación provincial de Málaga\n");
      out.write("                        <br>Área de modernización local\n");
      out.write("                        <br>Servicio de tecnologías de la información</h1>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\t\t</div> <!-- end full-width -->\t\n");
      out.write("\t\n");
      out.write("\t</div> <!-- end top-bar -->\n");
      out.write("        <br><br>\n");
      out.write("        <form method=\"get\" action=\"AltaUsuario\" name=\"datos\">\n");
      out.write("            <label for=\"nombre\">nombre</label>\n");
      out.write("            <input name=\"nombre\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"apellidos\">apellidos</label>\n");
      out.write("            <input name =\"apellidos\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"nif\">nif</label>\n");
      out.write("            <input name=\"nif\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("           \n");
      out.write("            <label for=\"email\">correo electr&oacute;nico</label>\n");
      out.write("            <input name=\"email\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"direccion\">direcci&oacute;n</label>\n");
      out.write("            <input name=\"direccion\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"telefono\">tel&eacute;fono</label>\n");
      out.write("            <input name=\"telefono\" type=\"text\">\n");
      out.write("            <br><br>\n");
      out.write("                \n");
      out.write("            <label for=\"publicable\">publicable</label>\n");
      out.write("            <input name=\"publicable\" value=\"si\" type=\"radio\"> S&iacute;\n");
      out.write("            <input name=\"publicable\" value=\"no\" type=\"radio\"> No\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"rol\">rol</label>\n");
      out.write("            <select name=\"rol\">\n");
      out.write("                <option> Administrador </option>\n");
      out.write("                <option> Controlador </option>\n");
      out.write("                <option> Controlador ayuntamiento </option>\n");
      out.write("                <option> Jefe de servicio </option>\n");
      out.write("                <option> Usuario </option>\n");
      out.write("            </select>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"ayuntamiento\">ayuntamiento</label>\n");
      out.write("            <select name=\"ayuntamiento\"><option>none</option></select>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("        <input type=\"submit\" class=\"button round blue\">\n");
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
