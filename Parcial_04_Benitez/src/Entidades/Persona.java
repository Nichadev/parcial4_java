package Entidades;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String celular;
    private String email;

    public Persona() {
        this.setNombre("");
        this.setApellido("");
        this.setCelular("");
        this.setEmail("");
    }

    public Persona(String nombre, String apellido, String celular, String email) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCelular(celular);
        this.setEmail(email);
    }
    
    

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
