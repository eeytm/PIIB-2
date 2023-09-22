
package PARCIAL_1.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;     
import java.util.logging.Logger;


public class Conexion {
    
    Connection con;
    public Conexion (){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio", "root", "");
        } catch (Exception e){
            System.err.println("No se pudo establecer conexion con la Base de Datos. Error: "+e);
        }   
    }
    public Connection getConnection(){
        return con;
    }
}

