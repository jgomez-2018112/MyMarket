<%--
    Document   : HomeScreen
    Created on : Sep 12, 2022, 6:41:08 PM
    Author     : latenightt2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>


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
        <li class="list"><a href="Controlador?menu=Cliente&accion=Listar" target="myFrame" class="button-67"><img
                src="./img/customer.png" alt="" width="20px">Clientes</a></li>
        <li class="list"><a class="button-67" href="Controlador?menu=Empleado&accion=Listar" target="myFrame"><img
                src="./img/employee.png" alt="" width="20px">Empleados</a></li>
        <li class="list"><a class="button-67" href="Controlador?menu=Producto&accion=Listar" target="myFrame"><img
                src="./img/product.png" alt="" width="20px">Productos</a></li>
        <li class="list"><a class="button-67" href="Controlador?menu=Facura&accion=Listar" target="myFrame"><img
                src="./img/bill.png" alt="" width="20px">Factura</a></li>
        <li class="list"><a class="button-67" href="Controlador?menu=Pedido&accion=Listar" target="myFrame"><img
                src="./img/pedidos.png" alt="" width="20px">Pedidos</a></li>

        <span>Accesos Directos</span>
    </div>
    <div class="quote blue-box-emp">
        <li class="list">
            <div class="quote calendar"> * Recolección de Contenido</div>
        </li>
        <li class="list">
            <div class="quote calendar"> * Reunión de Proyecto</div>
        </li>
        <li class="list">
            <div class="quote calendar"> * Entrega de Proyecto</div>
        </li>
        <span class="task-span">Tasks</span>
    </div>
    <div class="quote clock">
        <div id="clockHeader">

        </div>
        <div id="clockMain">
            <span id="horaBlock" class="hora">00</span>
            <span id="minutosBlock" class="minutos">00</span></div>
        <div id="dia"></div>
        <li class="list block-clock">
            <div class="quote calendar"> * No hay eventos proximos</div>
        </li>
    </div>

    <div class="quote blue-box">
        <img src="./img/logoWhite.png" alt=""><br>
        <span id="nombreUser" class="user-span">My Market</span>
    </div>
</div>

<div class="container-center">
    <div class="block-center">

    </div>
</div>
<script src="js/HomeScreen.js"></script>
</body>

</html>

