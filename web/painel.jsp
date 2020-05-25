<%-- 
    Document   : painel
    Created on : May 21, 2020, 4:10:46 PM
    Author     : mlour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!doctype html>
<html>
  <head>
  	<title>Sidebar 09</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	        </button>
        </div>
	  		<div class="img bg-wrap text-center py-4" style="background-image: url(images/bg_1.jpg);">
	  			<div class="user-logo">
	  				<div class="img" style="background-image: url(images/logo.png);"></div>
	  				<h3>Bravo Logistica</h3>
	  			</div>
	  		</div>
        <ul class="list-unstyled components mb-5">
          <li class="active">
          
            <a href="#"><span class="fa fa-home mr-3"></span> Inicio</a>
          </li>
          <li>
            <a href="#check"> Check List</a>
          </li>
          <li>
            <a href="#fornecedor"> Fornecedor</a>
          </li>
          <li>
            <a href="#caminhao"> Caminhão</a>
          </li>
          <li>
            <a href="#motorista"> Motorista</a>
          </li>
        </ul>

    	</nav>

        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5 pt-5">
          <section id= 'fornecedor'>
                <iframe src="CadastroFornecedor.xhtml" style="width: 100%;height:100%;" ></iframe>
          </section>
          <section id= 'check'>
                <iframe src="CadastroFornecedor.xhtml" style="width: 100%;height:100%;" ></iframe>
          </section>
          <section id= 'caminhao'>
                <iframe src="CadastroFornecedor.xhtml" style="width: 100%;height:100%;" ></iframe>
          </section>
          <section id= 'motorista'>
                <iframe src="CadastroFornecedor.xhtml" style="width: 100%;height:100%;" ></iframe>
          </section>
      </div>
                </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>

    <script src="js/main.js"></script>
  </body>
</html>