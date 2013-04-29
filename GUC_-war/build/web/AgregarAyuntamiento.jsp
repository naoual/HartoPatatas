<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title> Agregar Ayuntamiento </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta charset="utf-8">
	
	
	<!-- Stylesheets -->
	<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet'>
	<link rel="stylesheet" href="css/style.css">

 
    </head>
    <body>
        <!-- TOP BAR -->
	<div id="top-bar">
		
		<div class="page-full-width strong em">
                        <a href="#" id="company-branding" class="fl"><img src="images/logo_DIPUTACION.jpg" alt="Blue Hosting" /></a>
                        <ul id="nav" class="fr">
	
				
				<li class="v-sep"><a href="#" class="round button dark menu-user image-left">Logged in as <strong>admin</strong></a>
					<ul>
						<li><a href="#">My Profile</a></li>
						<li><a href="#">Ver Factura</a></li>
					</ul> 
				</li>
			
                                <li><a href="#" class="round button dark menu-email-special image-left">3 new messages</a></li>
				<li><a href="login.jsp" class="round button dark menu-logoff image-left">Log out</a></li>
				
			</ul> <!-- end nav -->
                        <div id="cabz">
                            <h1>Diputación provincial de Málaga
                                <br>Área de modernización local
                                <br>Servicio de tecnologías de la información
                            </h1>
                        

			
                        </div>

		</div> <!-- end full-width -->	
	
	</div> <!-- end top-bar -->
        
	
	<!-- MAIN CONTENT -->
	<div id="content">
		
		<div class="side-menu fl">
				
				<h3>Funcionalidades</h3>
				<ul>
					<li><a href="JefeServicioPrincipal.jsp">Side menu link</a></li>
					<li><a href="#">Another link</a></li>
					<li><a href="#">A third link</a></li>
					<li><a href="#">Fourth link</a></li>
				</ul>
				
			</div> <!-- end side-menu -->
                        &nbsp;
			<div class="page-limited">
        <form method="get" action="AgregarAyuntamiento" name="datos">
            <label for="localidad">localidad</label>
            <input name="localidad" type="text" autofocus="">
            <br><br>
            
            <label for="direccion">direcci&oacute;n</label>
            <input name="direccion" type="text" autofocus="">
            <br><br>
            
            <label for="telefono">tel&eacute;fono</label>
            <input name="telefono" type="text" autofocus="">
            <br><br>
            
            <input type="submit" class="button round blue">
        </form>
            </div>
		
		</div> <!-- end full-width -->
	
	</div> <!-- end content -->
	

	
	<!-- FOOTER -->
	<div id="footer">

		<p><strong>Admin Principal</strong> theme by Omar Dardak </p>
	
	</div> <!-- end footer -->
        <br><br>
        
    
        </body>
</html>

