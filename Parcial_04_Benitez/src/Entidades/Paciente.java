package Entidades;

/**
 *
 * @author andrea
 */
public class Paciente extends Persona {
    private int id_paciente;
    private String dni;
    private String telefono;
    private String domicilio;
    private String provincia;
    private String localidad;
    
    /*
        private obraSocial ob_soc;
        public obraSocial getOb_soc() {
        return ob_soc;
    }

    public void setOb_soc(obraSocial ob_soc) {
        this.ob_soc = ob_soc;
    }

    */


    public Paciente() {
        this.setId_paciente(0);
        this.setDni("");
        this.setTelefono("");
        this.setDomicilio("");
        this.setProvincia("");
        this.setLocalidad("");
    }

    public Paciente(int id_paciente, String apellido, String nombre, String dni, String provincia, String localidad,
            String domicilio, String celular, String telefono,
            String email) {
        
        super(nombre, apellido, celular, email);
        this.setId_paciente(id_paciente);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
        this.setProvincia(provincia);
        this.setLocalidad(localidad);
    }


    
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    public Object[] toObject(){
        Object[] info = new Object[]{
            getId_paciente(), getApellido(), getNombre(), getDni(),
            getProvincia(), getLocalidad(),getDomicilio(), getCelular(), getTelefono(),
            getEmail()
        };
        return info;
    }
    
}
