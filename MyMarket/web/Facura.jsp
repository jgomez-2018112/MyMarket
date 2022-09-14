<%--
  Created by IntelliJ IDEA.
  Date: 9/12/22
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/factura.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Factura</title>
</head>
<body>
<div class="mainForm-cont d-flex">
    <div class="form-box col-sm-3">        
        <form var="cliente" class="buscar-form" action="Controlador?menu=Facura" method="POST">
            <div class="form-entradas buscar-entry">
                <input type="text" name="txtDpiCliente" id="" class="form__input" value="${cliente.getDpiCliente()}" autocomplete="off" placeholder=" ">
                <label class="form__label">DPI</label>
            </div>
            <div class="btn-form">
                <button type="submit" class="button-17" name="accion" value="Buscar" role="button"><img src="img/buscarWhite.png" width="22px">
                </button>
            </div>
            <div class="form-entradas  form-result">
                <input disabled type="text" name="Cliente" id="" value="${cliente.getNombresCliente()} ${cliente.getApellidosCliente()}" class="form__input" autocomplete="off" placeholder="Cliente">
            </div>
        </form>

        <form var="producto" class="buscar-form" action="Controlador?menu=Facura" method="POST">                  
            <div class="form-entradas  buscar-entry">
                <input type="text" name="txtCodigoProducto" id="" class="form__input" value="${producto.getCodigoProducto()}" autocomplete="off" placeholder=" ">
                <label class="form__label">ID</label>
            </div>
            <div class="btn-form">
                <button type="submit" class="button-17" name="accion" value="BuscarP" role="button"><img src="img/buscarWhite.png" width="22px">
                </button>
            </div>
            <div class="form-entradas  form-result">
                <input disabled type="text"  name="Producto" id="" value="${producto.getNombreProducto()}" class="form__input" autocomplete="off" placeholder="Producto">
            </div>            
        </form>
        <div class="form-entradas  form-result">
            <input disabled type="text" name="Producto" id="" value="${producto.getPrecioProducto()}" class="form__input" autocomplete="off" placeholder="Precio">
        </div>
        <div class="form-entradas  form-result">
            <input disabled type="text" name="Producto" id="" value="${producto.getStock()}" class="form__input" autocomplete="off" placeholder="Stock">
        </div>
            
        
        <div class="entradas-bottom">
            <div class="form-entradas cantidad">
                <input type="text" id="" value="${detalleFactura.getCantidad()}" name="txtCantidad" class="form__input" autocomplete="off" placeholder=" ">
                <label class="form__label">Cantidad</label>
            </div>

            <div class="form-entradas fechas">
                <input type="date" id="" value="${factura.getFechaFactura()}" name="txtFechaFactura" class="form__input" autocomplete="off" placeholder="">
                <label class="form__label">Fecha</label>
            </div>
        </div>

        <div class="btns-box center-btns">
            <button type="submit" name="accion" value="Agregar" class="button-6" role="button">Agregar</button>
            <button type="submit" name="accion" value="Actualizar" class="button-6" role="button">Actualizar</button>
        </div>
    </div>

    <div class="col-sm-8">
        <table class="table table-dark">
            <thead>
            <tr>
                <td>CODIGO</td>
                <td>FECHA</td>
                <td>CLIENTE</td>
                <td>PRODUCTO</td>
                <td>PRECIO</td>
                <td>CANTIDAD</td>
                <td>TOTAL</td>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="factura" items="${FacturaD}">
                    <tr>
                        <td>${factura.getCodigoFactura()}</td>
                        <td>${factura.getFechaFactura()}</td>
                        <td>${cliente.getNombresCliente()} ${cliente.getApellidosCliente()}</td>
                        <td>${producto.getNombreProducto()}</td>
                        <td>${producto.getPrecioProducto()}</td>
                        <td>${producto.getStock()}</td>
                        <td>${detalleFactura.getCantidad()}</td>
                        <td>total</td>
                        <td><a class="btn btn-warning"
                               href="">Editar</a>
                        </td>
                        <td><a class="btn btn-danger"
                               href="">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>                        

            </tbody>
        </table>
    </div>


</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>

</body>
</html>