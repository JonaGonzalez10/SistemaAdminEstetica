/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author jonat
 */
public interface Conexion {
    
    public static Connection getConexion(){
        String conexionUrl ="jdbc:sqlserver://localhost:1433;"
                + "database=Master;"
                + "user=AdminEstetica;"
                + "password=America10;";
        Connection con = null;
        
        try{
            con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }finally{
            try{
                if(con != null){
                    con.close();
                }
                
                }catch(SQLException ex){
                        System.out.println("Error al cerrar la conexion de la base de datos");
                        
                        }
            
        }
        
        
    }
    
}
