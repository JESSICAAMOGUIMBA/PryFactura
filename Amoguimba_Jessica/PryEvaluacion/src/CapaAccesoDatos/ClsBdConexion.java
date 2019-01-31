
package CapaAccesoDatos;

import CapaDatos.*;
import CapaNegocio.ClsEstudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClsBdConexion {
    public String nombre;
    public int nota1;
    public int nfinal;
    public int supletorio;
    public String estado;

    private Connection con = null;
    private Statement consulta;
    private ResultSet resultado;
    private ClsRegEstudiante r;
    
    
      //CONSTRUCTOR
     public ClsBdConexion(String direccion){
        
        try{ 
        con = DriverManager.getConnection("jdbc:ucanaccess://"+direccion);// NO DEBE EXISTIR ESPACIOS: SALDRA ERROR
        consulta = con.createStatement();//importante para definir acciones sobre BD 
         
        System.out.println("Conexión realizada con Éxito");
        
        }catch(Exception e){
        System.out.println("Error Conexión:  "+ e);
             
        }
    }
      public ResultSet rs(){ return resultado;}
      
      
     public ResultSet cargar() throws SQLException{
        String comando = "SELECT * FROM BdCurso"; //  * TODOS LOS CAMPOS DE LAS TUPLAS
        consulta.execute(comando);
        resultado = consulta.getResultSet();
             
        return resultado;
    }
     
     public ClsRegEstudiante siguiente() {
       r= new ClsRegEstudiante();
        try  {
           if (resultado.next()) 
               mostrar(); 
       }catch(SQLException e){
           System.out.print("fin de tabla"+e);
       
       }
        
        return r;
    }
      public void mostrar () throws SQLException {
        r.nombre= resultado.getNString("nombre");
        r.nota1= resultado.getNString("nota1");
        r.nfinal= resultado.getNString("final");
        r.supletorio= resultado.getNString("supletorio");
        r.estado= resultado.getNString("estado");
       
    }
     
     
     
     
     
     
     
    
    
    
    
    
}
