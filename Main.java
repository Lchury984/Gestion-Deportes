
package futbol;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Participantes");

        GestionDeportes participante = new GestionDeportes("", "", false, false);
        participante.ingresarDatos();

        System.out.println("\t\tDatos del participante:");
        System.out.println("Nombre: " + participante.getNombre());
        System.out.println("Fecha de nacimiento: " + participante.getFechaNacimiento());
        System.out.println("Sanciones recientes: " + (participante.getSancionesRecientes() ? "Sí" : "No"));
        System.out.println("Examenes medicos en diciembre del 2023: " + (participante.getExamenesMedicosDiciembre2023() ? "Sí" : "No"));
        
        
    }

    
}


