package futbol;

public class Atleta extends GestionDeportes {
    private String especialidad;

   
    public Atleta(String especialidad, String nombre, String fechaNacimiento, boolean sancionesRecientes, boolean examenesMedicosDiciembre2023) {
        super(nombre, fechaNacimiento, sancionesRecientes, examenesMedicosDiciembre2023);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
