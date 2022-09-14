/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;

/**
 *
 * @author Usuario
 */
public class Controlador extends HttpServlet {
    Empleado empleado = new  Empleado();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    Categoria categoria = new  Categoria();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    Proveedor proveedor = new Proveedor();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    Cargo cargo = new Cargo();
    CargoDAO cargoDAO = new CargoDAO();
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    
    int codCargo;
    int codEmpleado;
    int codCategoria;
    int codProveedor;
    int codCliente;
    int codProducto;
    
    



    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }else if (menu.equalsIgnoreCase("Empleado")) {
            switch (accion) {
                case "Listar":
                    List listaEmpleado = empleadoDAO.listar();
                    request.setAttribute("empleado", listaEmpleado);
                    List listaCargo = cargoDAO.listar();
                    request.setAttribute("cargos", listaCargo);
                    break;
                case "Agregar":
                    String nombres = request.getParameter("txtNombresEmpleado");
                    String apellidos = request.getParameter("txtApellidosEmpleado");
                    String DPI = request.getParameter("txtDpiEmpleado");
                    String fNacimiento = request.getParameter("txtFechaNacimiento");
                    String sex = request.getParameter("txtSexo");
                    String user = request.getParameter("txtUsuario");
                    String direccion = request.getParameter("txtDireccion");
                    String tel = request.getParameter("txtTelefono");
                    int codCodigo = Integer.parseInt(request.getParameter("txtCodigoCargo"));
                    empleado.setNombresEmpleado(nombres);
                    empleado.setApellidosEmpleado(apellidos);
                    empleado.setDpiEmpleado(DPI);
                    empleado.setFechaNacimiento(fNacimiento);
                    empleado.setSexo(sex);
                    empleado.setUsuario(user);
                    empleado.setDireccionEmpleado(direccion);
                    empleado.setTelefonoEmpleado(tel);
                    empleado.setCodigoCargo(codCodigo);
                    empleadoDAO.agregar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    Empleado e = empleadoDAO.listarCodigoEmpleado(codEmpleado);
                    request.setAttribute("empleados", e);
                    
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombresEmp = request.getParameter("txtNombresEmpleado");
                    String apellidosEmp = request.getParameter("txtApellidosEmpleado");
                    String DPIEmp = request.getParameter("txtDpiEmpleado");
                    String fNacimientoEmp = request.getParameter("txtFechaNacimiento");
                    String sexEmp = request.getParameter("txtSexo");
                    String userEmp = request.getParameter("txtUsuario");
                    String direccionEmp = request.getParameter("txtDireccion");
                    String telEmp = request.getParameter("txtTelefono");
                    int codCodigoEmp = Integer.parseInt(request.getParameter("txtCodigoCargo"));
                    empleado.setNombresEmpleado(nombresEmp);
                    empleado.setApellidosEmpleado(apellidosEmp);
                    empleado.setDpiEmpleado(DPIEmp);
                    empleado.setFechaNacimiento(fNacimientoEmp);
                    empleado.setSexo(sexEmp);
                    empleado.setUsuario(userEmp);
                    empleado.setDireccionEmpleado(direccionEmp);
                    empleado.setTelefonoEmpleado(telEmp);
                    empleado.setCodigoCargo(codCodigoEmp);
                    empleado.setCodigoEmpleado(codEmpleado);
                    empleadoDAO.actualizar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    empleadoDAO.eliminar(codEmpleado);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        } else if (menu.equals("Categoria")) {
            switch (accion) {
                case "Listar":
                    List listaCategoria = categoriaDAO.listar();
                    request.setAttribute("categoria", listaCategoria);
                    break;
                    case "Agregar":
                    String nombreCategoria = request.getParameter("txtNombreCategoria");                
                    categoria.setNombreCategoria(nombreCategoria);               
                    categoriaDAO.agregar(categoria);
                    request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    codCategoria = Integer.parseInt(request.getParameter("codigoCategoria"));
                    Categoria c = categoriaDAO.listarCodigoCategoria(codCategoria);
                    request.setAttribute("categorias", c);
                    request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombreCat=request.getParameter("txtNombreCategoria");     
                    categoria.setNombreCategoria(nombreCat);
                    categoria.setCodigoCategoria(codCategoria);
                    categoriaDAO.actualizar(categoria);
                    request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codCategoria = Integer.parseInt(request.getParameter("codigoCategoria"));
                    categoriaDAO.eliminar(codCategoria);
                    request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Categoria.jsp").forward(request, response);
        } else if (menu.equals("Proveedor")){
            switch(accion){
               case "Listar":
                    List listaProveedor = proveedorDAO.listar();
                    request.setAttribute("proveedores", listaProveedor);
                    break;
               case "Agregar":
                    String nombre = request.getParameter("txtNombreProveedor");             
                    proveedor.setNombreProveedor(nombre);
                    String direccion = request.getParameter("txtDireccion");
                    proveedor.setDireccionProveedor(direccion);
                    String telefono = request.getParameter("txtTelefono");
                    proveedor.setTelefonoProveedor(telefono);
                    proveedorDAO.agregar(proveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                   break;
                case "Editar":
                    codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                    Proveedor p = proveedorDAO.listarCodigoProveedor(codProveedor);
                    request.setAttribute("proveedor", p);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombreProv = request.getParameter("txtNombreProveedor");             
                    proveedor.setNombreProveedor(nombreProv);
                    String direccionProv = request.getParameter("txtDireccion");
                    proveedor.setDireccionProveedor(direccionProv);
                    String telefonoProv = request.getParameter("txtTelefono");
                    proveedor.setTelefonoProveedor(telefonoProv);
                    proveedor.setCodigoProveedor(codProveedor);
                    proveedorDAO.actualizar(proveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                    proveedorDAO.eliminar(codProveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break; 
            }
            request.getRequestDispatcher("Proveedor.jsp").forward(request, response);
        }   else if (menu.equals("Cliente")){
                switch(accion){
                    case "Listar":
                        List listaCliente = clienteDAO.listar();
                        request.setAttribute("clientes", listaCliente);
                        break;
                    case "Agregar":
                        String nombresCliente = request.getParameter("txtNombresCliente");
                        cliente.setNombresCliente(nombresCliente);
                        String apellidosCliente = request.getParameter("txtApellidosCliente");
                        cliente.setApellidosCliente(apellidosCliente);
                        String nitCliente = request.getParameter("txtNitCliente");
                        cliente.setNitCliente(nitCliente);
                        String telefonoCliente = request.getParameter("txtTelefonoCliente");
                        cliente.setTelefonoCliente(telefonoCliente);
                        clienteDAO.agregar(cliente);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codCliente = Integer.parseInt(request.getParameter("dpiCliente"));
                        Cliente c = clienteDAO.listarCodigoCliente(codCliente);
                        request.setAttribute("cliente", c);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String nombreClie = request.getParameter("txtNombresCliente");
                        cliente.setNombresCliente(nombreClie);
                        String apellidoClie = request.getParameter("txtApellidosCliente");
                        cliente.setApellidosCliente(apellidoClie);
                        String nitClie = request.getParameter("txtNitCliente");
                        cliente.setNitCliente(nitClie);
                        String telefonoClie = request.getParameter("txtTelefonoCliente");
                        cliente.setTelefonoCliente(telefonoClie);
                        cliente.setDpiCliente(codCliente);
                        clienteDAO.actualizar(cliente);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codCliente = Integer.parseInt(request.getParameter("dpiCliente"));
                        clienteDAO.eliminar(codCliente);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                }
                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }else if(menu.equalsIgnoreCase("Cargo")){
            switch(accion){
                case "Listar":
                    List listaCargo = cargoDAO.listar();
                    request.setAttribute("cargos", listaCargo);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("txtNombreCargo");
                    String descripcion = request.getParameter("txtDescripcion");
                    cargo.setNombreCargo(nombre);
                    cargo.setDescripcionCargo(descripcion);
                    cargoDAO.agregar(cargo);
                    request.getRequestDispatcher("Controlador?menu=Cargo&accion=Listar").forward(request, response);
                    break;
               
                case "Editar":
                    codCargo = Integer.parseInt(request.getParameter("codigoCargo"));
                    Cargo c = cargoDAO.listarCodigoCargo(codCargo);
                    request.setAttribute("cargo", c);
                    request.getRequestDispatcher("Controlador?menu=Cargo&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombreCa = request.getParameter("txtNombreCargo");
                    String descripcionCa = request.getParameter("txtDescripcion");
                    cargo.setNombreCargo(nombreCa);
                    cargo.setDescripcionCargo(descripcionCa);
                    cargo.setCodigoCargo(codCargo);
                    cargoDAO.actualizar(cargo);
                    request.getRequestDispatcher("Controlador?menu=Cargo&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codCargo = Integer.parseInt(request.getParameter("codigoCargo"));
                    cargoDAO.eliminar(codCargo);
                    request.getRequestDispatcher("Controlador?menu=Cargo&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Cargo.jsp").forward(request, response);
           
             }  else if (menu.equalsIgnoreCase("Producto")) {
                 switch (accion){
                case "Listar":
                    List listaProducto = productoDAO.listar();
                    request.setAttribute("productos", listaProducto);
                    List listaCategoria = categoriaDAO.listar();
                    request.setAttribute("categoria", listaCategoria);
                    break;
            
                case "Agregar":
                    String nombres = request.getParameter("txtNombreProducto");
                    Double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int stock = Integer.parseInt(request.getParameter("txtStock"));
                    String desc = request.getParameter("txtDescripcion");
                    int codCategoria = Integer.parseInt(request.getParameter("txtCodigoCategoria"));
                    producto.setNombreProducto(nombres);
                    producto.setPrecioProducto(precio);
                    producto.setStock(stock);
                    producto.setDescripcionProducto(desc);
                    producto.setCodigoCategoria(codCategoria);
                    productoDAO.agregar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                  case "Editar":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    Producto p = productoDAO.listarCodigoProducto(codProducto);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombrePro=request.getParameter("txtNombreProducto");
                    Double prc = Double.parseDouble(request.getParameter("txtPrecio"));
                    int st = Integer.parseInt(request.getParameter("txtStock"));
                    String descProd = request.getParameter("txtDescripcion");
                    producto.setNombreProducto(nombrePro);
                    producto.setPrecioProducto(prc);
                    producto.setStock(st);
                    producto.setDescripcionProducto(descProd);
                    
                    producto.setCodigoProducto(codProducto);
                    productoDAO.actualizar(producto);                    
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                 case "Eliminar":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    productoDAO.eliminar(codProducto);
                    
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                    
            }
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
