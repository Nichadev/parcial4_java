/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.obraSocial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author andrea
 */
public class obraSocial_CRUD {
    // Instancias la clase que hemos creado anteriormente
    private ConexionBD SQL = new ConexionBD();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.abrirConexion();
    // Query que usarás para hacer lo que necesites
    private String query =   "";
    private PreparedStatement ps = null;
    
    public void ingresar(obraSocial obr) throws SQLException {
        // sentencia preparada
        query =  "INSERT INTO obras_sociales (id, descripcion) VALUES (?, ?)";
        
        try {
            
            //abrir la conexion
            SQL.abrirConexion();
            
            
            ps = conn.prepareStatement(query);
            
            //reemplaza los "?" de la sentencia
            ps.setInt(1, obr.getId_obra());
            ps.setString(2, obr.getNombre());
            
            //ejecuta la consulta
            ps.execute();
            
            System.out.println("Datos ingresados correctamente");
            
        } catch (SQLException ex) {
            
            System.err.println("Error" + ex);
            
        } finally {
            try {
                
                conn.close();
            } catch (SQLException e) {
                
                System.err.println(e);
            } 
        }
        
    }
    
    
}
