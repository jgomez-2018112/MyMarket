<%--
  Created by IntelliJ IDEA.
  User: informatica
  Date: 12/09/2022
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/Home.css">
  <title>Home</title>
</head>
<body>
  <div class="header" id="msjHi">

  </div>
  <div class="header-text"><h1>HOME</h1></div>
  <div class="container">
    <div class="quote">
      <li class="list"><a href="Controlador?menu=Cliente&accion=Listar" target="myFrame" class="button-67"><img src="./img/customer.png" alt="" width="20px">Clientes</a></li>
      <li class="list"><a class="button-67" href="Controlador?menu=Empleado&accion=Listar" target="myFrame"><img src="./img/employee.png" alt="" width="20px">Empleados</a></li>
      <li class="list"><a class="button-67" href="Controlador?menu=Producto&accion=Listar" target="myFrame"><img src="./img/product.png" alt="" width="20px">Productos</a></li>
      <li class="list"><a class="button-67" href="Controlador?menu=Factura&accion=Listar" target="myFrame"><img src="./img/bill.png" alt="" width="20px">Factura</a></li>
      <li class="list"><a class="button-67" href="Controlador?menu=Pedido&accion=Listar" target="myFrame"><img src="./img/pedidos.png" alt="" width="20px">Pedidos</a></li>

      <span>Accesos Directos</span>
    </div>
  <div class="quote blue-box-emp">
    <li class="list"><a href="Controlador?menu=Cliente&accion=Listar" target="myFrame" ><span class="EmpleadosBox"><img src="./img/egarcia.png" alt="" width="30px">egarcia</span></a></li>
    <li class="list"><a href="Controlador?menu=Empleado&accion=Listar" target="myFrame"><span class="EmpleadosBox"><img src="./img/ehernandez.png" alt="" width="30px">ehernandez </span></a></li>
    <li class="list"><a href="Controlador?menu=Producto&accion=Listar" target="myFrame"><span class="EmpleadosBox"><img src="./img/jhernandez.png" alt="" width="30px">jhernandez </span></a></li>
    <li class="list"><a href="Controlador?menu=Factura&accion=Listar" target="myFrame"><span class="EmpleadosBox"><img src="./img/jlopez.png" alt="" width="30px">jlopez </span></a></li>
    <li class="list"><a href="Controlador?menu=Pedido&accion=Listar" target="myFrame"><span class="EmpleadosBox"><img src="./img/cmendez.png" alt="" width="30px">cmendez </span></a></li>
    <span>Empleados</span>
  </div>
  <div class="quote clock">
    <div id="clockHeader">

    </div>
    <div id="clockMain">
      <span id="horaBlock" class="hora">00</span>
      <span id="minutosBlock" class="minutos">00</span></div>
      <div id="dia"></div>
    </div>

    <div class="quote blue-box">
      <img src="./img/jgomez.png" alt="" width="130px"><br>
      <center>
        <p>Nombre</p>
        <p>Fecha</p>
        <p>+502 XXX-XXX</p>
      </center>
      <span class="user-span">jgomez</span>
    </div>
</div>

<div class="container-center">
  <div class="block-center">

  </div>
</div>
  <script src="js/HomeScreen.js"></script>
</body>

</html>

