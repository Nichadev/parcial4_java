package Entidades;

/**
 *
 * @author andrea
 */
public class Especialidad {
    private int id_especialidad;
    private String nombre;
    /*
    private ArrayList<Turno> tur;
    
    public ArrayList<Turno> getTur() {
        return tur;
    }

    public void setTur(ArrayList<Turno> tur) {
        this.tur = tur;
    }
    
    */
    

    public Especialidad() {
        this.setId_especialidad(0);
        this.setNombre("");
    }
    public Especialidad(int id_especialidad, String nombre) {
        this.setId_especialidad(id_especialidad);
        this.setNombre(nombre);
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
}
