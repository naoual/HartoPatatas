<%-- 
    Document   : GestionSolicitudes
    Created on : 28-abr-2013, 12:31:39
    Author     : Naoual Amasri
--%>




<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <!-- <base href="<%=basePath%>"> --> 
	
	<!-- Stylesheets -->
	<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'>
	<link rel="stylesheet" href="css/style.css">

	 
    <title> Solicitudes </title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  <body>
      <!-- TOP BAR -->
	<div id="top-bar">
		
		<div class="page-full-width strong em">
                    <a href="#" id="company-branding" class="fl"><img src="images/logo_DIPUTACION.jpg" alt="Blue Hosting" /></a>
                    <div id="cabz">
                    <h1>Diputación provincial de Málaga
                        <br>Área de modernización local
                        <br>Servicio de tecnologías de la información</h1>
                    </div>
                    
                    <%--<a href="#" class="round button dark ic-left-arrow image-left ">Return to website</a>--%>
                        

		</div> <!-- end full-width -->	
	
	</div> <!-- end top-bar -->
        
        <br><br> 
        

        <br><br><br> 
      <div>
          <label for="listado"><font color="#2069b4"> <B> SOLICITUDES </B> </font></label>
          <br>
  	<table border="1">
  		<tbody>
  		<tr>
                        <td>Fecha</td>
			<td>Asunto</td>
			<td>Estado</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
		</tr>
           
	
  		</tbody>
  	</table>
  	<br>
        <a href="CrearSolicitud.jsp">Enviar nueva solicitud</a>
        
        </div>
  </body>
</html>

