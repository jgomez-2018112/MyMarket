  package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
  
  
 
      public List listar(){
               String sql="Select * From Categorias";
                  List<Categoria>listaCategoria=new ArrayList<>();
                          try{
                             con=cn.Conexion();
                             ps=con.prepareStatement(sql);
                             rs=ps.executeQuery();
                       while(rs.next()){
                                 Categoria cat=new Categoria();
                                 cat.setCodigoCategoria(rs.getInt(1));
                                 cat.setNombreCategoria(rs.getString(2));
                                 listaCategoria.add(cat);
                       }
                   }catch(Exception e){
                           e.printStackTrace();
                           }
                   
                   return listaCategoria;
               }
}
  

