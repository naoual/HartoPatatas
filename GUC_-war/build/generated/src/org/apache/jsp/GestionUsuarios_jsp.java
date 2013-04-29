package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.entity.Usuario;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;

public final class GestionUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Optimize for mobile devices -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>  \n");
      out.write("    <title> Lista de usuarios </title>\n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("    <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("    \n");
      out.write("    <!--\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("    -->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <!-- TOP BAR -->\n");
      out.write("\t<div id=\"top-bar\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"page-full-width strong em\">\n");
      out.write("                    <a href=\"#\" id=\"company-branding\" class=\"fl\"><img src=\"images/logo_DIPUTACION.jpg\" alt=\"Blue Hosting\" /></a>\n");
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
      out.write("        \n");
      out.write("        <br><br> \n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <label for=\"buscar\" > <font color=\"#2069b4\"><B> BUSCAR USUARIO </B></font> </label>\n");
      out.write("            <br><br>\n");
      out.write("            <fieldset>\n");
      out.write("                <label> Criterio de b&uacute;squeda </label>\n");
      out.write("                <select name=\"busqueda\" class=\"round\"> <option>DNI</option> \n");
      out.write("                <option>Nombre</option> <option>Apellidos</option> <option>Rol</option>\n");
      out.write("            </select>\n");
      out.write("            <input name=\"campo\" type=\"text\" class=\"round\" >\n");
      out.write("            <button>Buscar</button>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("      </div>\n");
      out.write("        <br><br><br> \n");
      out.write("      <div>\n");
      out.write("          <label for=\"listado\"><font color=\"#2069b4\"> <B> LISTADO DE USUARIOS </B> </font></label>\n");
      out.write("          <br>\n");
      out.write("  \t<table border=\"1\">\n");
      out.write("  \t\t<tbody>\n");
      out.write("  \t\t<tr>\n");
      out.write("                        <td>DNI</td>\n");
      out.write("\t\t\t<td>Nombre</td>\n");
      out.write("\t\t\t<td>Apellidos</td>\n");
      out.write("                        <td>Rol</td>\n");
      out.write("                        <td>Correo electr&oacute;nico</td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("\t\t</tr>\n");
      out.write("                \n");
      out.write("                ");
 Collection lista = (Collection)request.getAttribute("usuarios");
                    for (Iterator iter = lista.iterator(); iter.hasNext();) {
	  		Usuario user = (Usuario) iter.next();
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(user.getNif() );
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
      out.print( user.getNombre() );
      out.write(" </td>\n");
      out.write("\t\t\t<td> ");
      out.print( user.getApellidos() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( user.getRol() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( user.getCorreoE() );
      out.write(" </td>\n");
      out.write("                        <td> <a href=\"ConsultarUsuario.jsp\">Consultar</a> </td>\n");
      out.write("                        <td> <a href=\"EditarUsuarioJsp.jsp\">Editar</a> </td>\n");
      out.write("                        <td> <a href=\"EditarUsuarioJsp.jsp\">Eliminar</a> </td>\n");
      out.write("\t\t</tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\t\n");
      out.write("  \t\t</tbody>\n");
      out.write("  \t</table>\n");
      out.write("  \t<br>\n");
      out.write("        <a href=\"AltaUsuario.jsp\">A&ntilde;adir nuevo usuario</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("  </body>\n");
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
