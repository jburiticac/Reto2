
package Modelo;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    Connection connection;
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion="jdbc:mysql://localhost:3306/reto1_g56_db";
    String usuario="root";
    String contraseña;

    public Conexion() {
        try {
            Class.forName(driver);
            connection=DriverManager.getConnection(cadenaConexion, usuario, contraseña);
            
            if(connection != null){
                System.out.println("Conexion exitosa con la base de datos");
                
            
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se pudo establecer conexion con la base de datos.");
        }
        
        
     
     }
    public Connection getCConnection(){
             return connection;
        
    }
    
    
    
}
