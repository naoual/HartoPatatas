package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarAyuntamiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Agregar Ayuntamiento </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- TOP BAR -->\n");
      out.write("\t<div id=\"top-bar\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"page-full-width strong em\">\n");
      out.write("                        <a href=\"#\" id=\"company-branding\" class=\"fl\"><img src=\"images/logo_DIPUTACION.jpg\" alt=\"Blue Hosting\" /></a>\n");
      out.write("                        <ul id=\"nav\" class=\"fr\">\n");
      out.write("\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li class=\"v-sep\"><a href=\"#\" class=\"round button dark menu-user image-left\">Logged in as <strong>admin</strong></a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">My Profile</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Ver Factura</a></li>\n");
      out.write("\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("                                <li><a href=\"#\" class=\"round button dark menu-email-special image-left\">3 new messages</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\" class=\"round button dark menu-logoff image-left\">Log out</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul> <!-- end nav -->\n");
      out.write("                        <div id=\"cabz\">\n");
      out.write("                            <h1>Diputación provincial de Málaga\n");
      out.write("                                <br>Área de modernización local\n");
      out.write("                                <br>Servicio de tecnologías de la información\n");
      out.write("                            </h1>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\t\t</div> <!-- end full-width -->\t\n");
      out.write("\t\n");
      out.write("\t</div> <!-- end top-bar -->\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("\t<!-- MAIN CONTENT -->\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"side-menu fl\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<h3>Funcionalidades</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"JefeServicioPrincipal.jsp\">Side menu link</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Another link</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">A third link</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Fourth link</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div> <!-- end side-menu -->\n");
      out.write("                        &nbsp;\n");
      out.write("\t\t\t<div class=\"page-limited\">\n");
      out.write("        <form method=\"get\" action=\"AgregarAyuntamiento\" name=\"datos\">\n");
      out.write("            <label for=\"localidad\">localidad</label>\n");
      out.write("            <input name=\"localidad\" type=\"text\" autofocus=\"\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"direccion\">direcci&oacute;n</label>\n");
      out.write("            <input name=\"direccion\" type=\"text\" autofocus=\"\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"telefono\">tel&eacute;fono</label>\n");
      out.write("            <input name=\"telefono\" type=\"text\" autofocus=\"\">\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" class=\"button round blue\">\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div> <!-- end full-width -->\n");
      out.write("\t\n");
      out.write("\t</div> <!-- end content -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- FOOTER -->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\n");
      out.write("\t\t<p><strong>Admin Principal</strong> theme by Omar Dardak </p>\n");
      out.write("\t\n");
      out.write("\t</div> <!-- end footer -->\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
