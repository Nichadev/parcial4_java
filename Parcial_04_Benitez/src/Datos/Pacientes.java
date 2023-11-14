/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.Paciente;
import Vista.Vista_pac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrea
 */
public class Pacientes {
    // Instancias la clase que hemos creado anteriormente
    private ConexionBD SQL = new ConexionBD();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.abrirConexion();
    // Query que usarás para hacer lo que necesites
    private String query =   "";
    private PreparedStatement ps = null;
    private Vista_pac vp = new Vista_pac();
    
    public void cerrarCon() throws SQLException{
        Connection connCerrar = SQL.cerrarConexion();
        System.out.println("Conexion cerrada");
    }
    
    
    public void ingresarDatosBD() throws SQLException {
        
        // sentencia preparada
        query =  "INSERT INTO pacientes (apellido, nombre, dni_paciente, "
                + "provincia, localidad, domicilio, celular, telefono, email) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            //ingresar los datos a la bd

            ps = conn.prepareStatement(query);
            
            //reemplaza los "?" de la sentencia
            
            ps.setString(1, vp.campo_ape.getText());
            ps.setString(2, vp.campo_nom.getText());
            ps.setString(3, vp.campo_dni.getText());
            ps.setString(4, vp.campo_prov.getText());
            ps.setString(5,vp.campo_local.getText());
            ps.setString(6,vp.campo_dom.getText());
            ps.setString(7,vp.campo_cel.getText());
            ps.setString(8,vp.campo_telef.getText());
            ps.setString(9,vp.campo_mail.getText());
            
            //ejecuta la consulta
            ps.execute();
            System.out.println("Datos ingresados correctamente a la bd");
           
        } catch(SQLException e){
            System.out.println("Error al ingresar los datos" + e.getMessage());
        }
    }
    
    public void ingresarDatosTABLA(Paciente paci, DefaultTableModel mod) throws SQLException {
        
        query= "SELECT id FROM pacientes";
        ps = conn.prepareStatement(query);
        
        try (ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                // Obtén los datos de la fila
                int columna1 = rs.getInt("id");
                
                //creo un objeto paciente y modifico sus datos con los campos obtenidos del form
                paci.setId_paciente(columna1);
                paci.setApellido(vp.campo_ape.getText());
                paci.setNombre(vp.campo_nom.getText());
                paci.setDni(vp.campo_dni.getText());
                paci.setProvincia(vp.campo_prov.getText());
                paci.setLocalidad(vp.campo_local.getText());
                paci.setDomicilio(vp.campo_dom.getText());
                paci.setCelular(vp.campo_cel.getText());
                paci.setTelefono(vp.campo_telef.getText());
                paci.setEmail(vp.campo_mail.getText());
                
                mod.addRow(paci.toObject());
            }
            
            //el PreparedStatement
            rs.close();
            ps.close();
            vp.tabla_pac.setModel(mod);
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
        

    }
    //listar los datos guardados de la bd en la tabla
    public void listar(Paciente paci, DefaultTableModel mod) throws SQLException{
        
        query= "SELECT * FROM pacientes";
        ps = conn.prepareStatement(query);
        
        try (ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                // Obtén los datos de la fila
                int columna1 = rs.getInt("id");
                String columna2 = rs.getString("apellido");
                String columna3 = rs.getString("nombre");
                String columna4 = rs.getString("dni_paciente");
                String columna5 = rs.getString("provincia");
                String columna6 = rs.getString("localidad");
                String columna7 = rs.getString("domicilio");
                String columna8 = rs.getString("celular");
                String columna9 = rs.getString("telefono");
                String columna10 = rs.getString("email");
                
                //creo un objeto paciente y le almaceno los datos obtenidos de la bd
                paci.setId_paciente(columna1);
                paci.setApellido(columna2);
                paci.setNombre(columna3);
                paci.setDni(columna4);
                paci.setProvincia(columna5);
                paci.setLocalidad(columna6);
                paci.setDomicilio(columna7);
                paci.setCelular(columna8);
                paci.setTelefono(columna9);
                paci.setEmail(columna10);
                
                mod.addRow(paci.toObject());
            }
            // Cierra la conexión y el PreparedStatement
            rs.close();
            ps.close();

            vp.tabla_pac.setModel(mod);
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public void eliminarDatosBD(DefaultTableModel mod) throws SQLException{
        //obtengo el indice de la fila seleccionada
        int index = vp.tabla_pac.getSelectedRow();
        int index_model = vp.tabla_pac.convertColumnIndexToModel(index);
        
        int id = (int) mod.getValueAt(index_model, 0);
         if (index != -1){
           query = "DELETE * FROM pacientes WHERE id =" + id;
           ps = conn.prepareStatement(query);
           ps.execute();
           ps.close();
           
         // Elimina la fila de la tabla
        } else {
            System.out.println("No se ha seleccionado ninguna fila");
        }

    }
    
    public void eliminarDatosTABLA(){
        
    }
    
}
