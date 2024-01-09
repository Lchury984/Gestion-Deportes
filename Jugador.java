
package futbol;

public class Jugador extends GestionDeportes {
    private String posicion;

    public Jugador(String posicion, String nombre, String fechaNacimiento, boolean sancionesRecientes, boolean examenesMedicosDiciembre2023) {
        super(nombre, fechaNacimiento, sancionesRecientes, examenesMedicosDiciembre2023);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
