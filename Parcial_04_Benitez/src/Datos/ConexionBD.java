/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author andrea
 */


public class ConexionBD {
    // Librería de MySQL
    public static String driver = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    public static String database = "clinica";

    // Host
    public static String hostname = "localhost";

    // Puerto
    public static String port = "3306";

    // Ruta de la base de datos
    public static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public static String username = "root";

    // Clave de usuario
    public static String password = "";
    
    // Declara una variable de tipo Connection 
    public static Connection conn = null;
    
    
    ConexionBD(){}
    
    
    // metodo para abrir la conexion
    public static Connection abrirConexion() {
        
        if(conn == null){
            try {
            // Carga el controlador (driver) de la base de datos
                Class.forName(driver);
            
            //Establece la conexión utilizando el controlador cargado, la URL de la base de datos, el nombre de usuario y la contraseña
                conn = DriverManager.getConnection(url, username, password);
                
                System.out.println("Conexion exitosa.");
                
            } catch (ClassNotFoundException ex) {
                
            // Captura excepciones. En este caso, captura ClassNotFoundException (cuando no se encuentra la clase del controlador)
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            } catch (SQLException ex) {
                
            //SQLException (errores relacionados con la base de datos).
                JOptionPane.showMessageDialog(null, "Error al conectar con la BD" + ex.getMessage());
            }
        }
        
        //Devuelve la conexión
        return conn;
    }
        //metodo para cerrar la conexion
    public static Connection cerrarConexion() throws SQLException{
        
        if(conn!=null){
            conn.close();
            System.out.println("Se ha cerrado la conexion a la BD");
        }
        return null;
    }


}