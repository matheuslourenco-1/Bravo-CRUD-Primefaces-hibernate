<%-- 
    Document   : painel
    Created on : May 21, 2020, 4:10:46 PM
    Author     : mlour
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
      <title>Painel Cadastro Fornecedor</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <!--Folhas de estilo-->
      <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      <link rel="stylesheet" href="css/style.css">
             <script src="https://kit.fontawesome.com/fe444528cd.js" crossorigin="anonymous"></script>
      <style type="text/css">
          .ui-widget-header {
              background: #333;
              color: white;
              font-weight: 500;
          }
          .ui-datalist ul {
              padding: 0px 10px 0 20px;
              margin: 5px 0;
          }
          .ui-datalist {
              margin-bottom: 10px
          }
          .ui-noborder tr.ui-widget-content {
              background: none;
          }
          .ui-state-default{
              box-shadow: inset 0 0px 0 #fff;
          }
          .ui-panel{
              padding: 0em;
          }
          .ui-layout{
              height:100%;
          }
      </style>
    </head>
    <body>
        <div class="wrapper d-flex align-items-stretch">
            <!--SideBar Menu-->
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
                <!--Menu-->
                <ul class="list-unstyled components mb-5">
                    <li><a href="painelInicio.jsp"><span class="fa fa-home mr-3"></span> Inicio</a></li>
                    <li><a href="painelGerenciador.jsp"><i class="fas fa-tasks mr-3"></i> Gerenciador</a></li>
                    <li class="active"><a href="painelFornecedor.jsp"><i class="fas fa-users mr-3"></i> Fornecedor</a></li>
                    <li><a href="painelCaminhao.jsp"><span class="fas fa-truck mr-3"></span>  Caminhão</a></li>
                    <li><a href="painelMotorista.jsp"><span class="fas fa-truck mr-3"></span> Motorista</a></li>
                </ul>
            </nav>
            <!-- Conteudo da pagina  -->
            <div id="content" class="p-4 p-md-5 pt-5">
                <h4 >Cadastro Fornecedor</h1>
                <div class="wrapper">    
                    <iframe src="Cadastros/CadastroFornecedor.xhtml" style="width: 100%;height:100%;" ></iframe>
                </div>
            </div>
        </div>
        <!--Scripts-->
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>