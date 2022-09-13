<%--
  Created by IntelliJ IDEA.
  User: latenightt2
  Date: 9/12/22
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/factura.css">
    <title>Factura</title>
</head>
<body>
<div class="container">
    <div action="Controlador?menu=Factura" method="POST" class="form-box">
        <center>
            <div class="form">
                <input type="text" id="" class="form__input" autocomplete="off" placeholder=" ">
                <label class="form__label">Fecha</label>
            </div>

            <div class="form">
                <input type="text" id="" class="form__input" autocomplete="off" placeholder=" ">
                <label class="form__label">Dpi</label>
            </div>

            <div class="form">
                <input type="text" id="" class="form__input" autocomplete="off" placeholder="Buscar">
                <label class="form__label">Cliente</label>
            </div>


            <div class="form">
                <input type="text" id="" class="form__input" autocomplete="off" placeholder="Buscar">
                <label class="form__label">Producto</label>
            </div>

            <div class="form">
                <input type="text" id="" class="form__input" autocomplete="off" placeholder="Buscar">
                <label class="form__label">Cantidad</label>
            </div>

            <div class="btns-box">
                <button type="submit" class="button-6" role="button">Agregar</button>
                <button type="submit" class="button-6" role="button">Actualizar</button>
            </div>
        </center>

    </div>
</div>
</body>
</html>