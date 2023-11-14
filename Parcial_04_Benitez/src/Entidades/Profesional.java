package Entidades;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public class Profesional extends Persona {
    private int id_profesional;
    private int matricula;
    private String titulo;
    
    /*
    private ArrayList<Especialidad> esp;
    
    public ArrayList<Especialidad> getEsp() {
        return esp;
    }

    public void setEsp(ArrayList<Especialidad> esp) {
        this.esp = esp;
    }
    */


    public Profesional() {
        this.setId_profesional(0);
        this.setMatricula(0);
        this.setTitulo("");
    }

    public Profesional(int id_profesional, String nombre, String apellido, int matricula, String titulo, String celular, String email) {
        super(nombre, apellido, celular, email);
        this.setId_profesional(id_profesional);
        this.setMatricula(matricula);
        this.setTitulo(titulo);
    }

    
   
    public int getId_profesional() {
        return id_profesional;
    }

    public void setId_profesional(int id_profesional) {
        this.id_profesional = id_profesional;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
