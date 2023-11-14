/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author andrea
 */
public class obraSocial {
    private int id_obra;
    private String nombre;

        public obraSocial() {
        this.setId_obra(0) ;
        this.setNombre("");
    }
    
    public obraSocial(int id_obra, String nombre) {
        this.setId_obra(id_obra) ;
        this.setNombre(nombre);
    }

    public int getId_obra() {
        return id_obra;
    }

    public void setId_obra(int id_obra) {
        this.id_obra = id_obra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
