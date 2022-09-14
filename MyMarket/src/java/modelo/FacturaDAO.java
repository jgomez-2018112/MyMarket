
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FacturaDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int Fac;
    int resp;
    
    public List listar(){
        //insertar el objeto a devolver
        List<Factura> facturas=new ArrayList<>();
        String sql = "Select * from clientes";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setDpiCliente(rs.getInt(1));
                cl.setNombresCliente(rs.getString(2));
                cl.setApellidosCliente(rs.getString(3));
                cl.setNitCliente(rs.getString(4));
                cl.setTelefonoCliente(rs.getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return facturas; 
    }
    
    public List listarP(){
        //insertar el objeto a devolver
        List<Factura> facturasP=new ArrayList<>();
        String sql = "Select * from productos";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto pd = new Producto();
                pd.setCodigoProducto(rs.getInt(1));
                pd.setNombreProducto(rs.getString(2));
                pd.setPrecioProducto(rs.getDouble(3));
                pd.setStock(rs.getInt(4));
                pd.setDescripcionProducto(rs.getString(5));
                pd.setCodigoCategoria(rs.getInt(6));                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return facturasP; 
    }
    
    public Cliente listarCodigoCliente(int id){
        //insertar el objeto a devolver
        Cliente cl = new Cliente();
        String sql = "Select * from clientes where dpiCliente = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cl.setDpiCliente(rs.getInt(1));
                cl.setNombresCliente(rs.getString(2));
                cl.setApellidosCliente(rs.getString(3));
                cl.setNitCliente(rs.getString(4));
                cl.setTelefonoCliente(rs.getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return cl; 
    }
    
    public Producto listarCodigoProducto(int id){
        //insertar el objeto a devolver
        Producto pd = new Producto();
        String sql = "Select * from productos where codigoProducto = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pd.setCodigoProducto(rs.getInt(1));
                pd.setNombreProducto(rs.getString(2));
                pd.setPrecioProducto(rs.getDouble(3));
                pd.setStock(rs.getInt(4));
                pd.setDescripcionProducto(rs.getString(5));
                pd.setCodigoCategoria(rs.getInt(6));         
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pd; 
    }             
    
}
