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
    
    int codEmpleado;
    
    



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
                    break;
                /*case "Agregar":
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
                    //*empleado.setFechaNacimiento();
                    empleado.setSexo(sex);
                    empleado.setUsuario(user);
                    empleado.setDireccionEmpleado(direccion);
                    empleado.setTelefonoEmpleado(tel);
                    empleado.setCodigoCargo(codCodigo);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;*/
                case "Editar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    Empleado e = empleadoDAO.listarCodigoEmpleado(codEmpleado);
                    request.setAttribute("empleados", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                /*case "Actualizar":
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
                    //empleado.setFechaNacimiento(fNacimientoEmp);
                    empleado.setSexo(sexEmp);
                    empleado.setUsuario(userEmp);
                    empleado.setDireccionEmpleado(direccionEmp);
                    empleado.setTelefonoEmpleado(telEmp);
                    empleado.setCodigoCargo(codCodigoEmp);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;*/
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
//                case "Editar":
//                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
//                    Empleado e = empleadoDAO.listarCodigoEmpleado(codEmpleado);
//                    request.setAttribute("empleados", e);
//                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
//                case "Actualizar":
//                    String DPIEmp = request.getParameter("txtDPIEmpleado");
//                    String nombresEmp = request.getParameter("txtNombresEmpleado");
//                    String telefonoEmp = request.getParameter("txtTelefonoEmpleado");
//                    String estEmp = request.getParameter("txtEstado");
//                    String userEmp = request.getParameter("txtUsuario");
//                    empleado.setDPIEmpleado(DPIEmp);
//                    empleado.setNombresEmpleado(nombresEmp);
//                    empleado.setTelefonoEmpleado(telefonoEmp);
//                    empleado.setEstado(estEmp);
//                    empleado.setUsuario(userEmp);
//                    empleado.setCodigoEmpleado(codEmpleado);
//                    empleadoDAO.actualizar(empleado);
//                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
//                case "Eliminar":
//                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
//                    empleadoDAO.eliminar(codEmpleado);
//                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
//            }
//            
            }
            
            request.getRequestDispatcher("Categoria.jsp").forward(request, response);
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
