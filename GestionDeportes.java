
package futbol;

import java.util.Scanner;

public class GestionDeportes {
    private String nombre;
    private String fechaNacimiento;
    private boolean sancionesRecientes;
    private boolean examenesMedicosDiciembre2023;

    public GestionDeportes(String nombre, String fechaNacimiento, boolean sancionesRecientes, boolean examenesMedicosDiciembre2023) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sancionesRecientes = sancionesRecientes;
        this.examenesMedicosDiciembre2023 = examenesMedicosDiciembre2023;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getSancionesRecientes() {
        return sancionesRecientes;
    }

    public void setSancionesRecientes(boolean sancionesRecientes) {
        this.sancionesRecientes = sancionesRecientes;
    }

    public boolean getExamenesMedicosDiciembre2023() {
        return examenesMedicosDiciembre2023;
    }

    public void setExamenesMedicosDiciembre2023(boolean examenesMedicosDiciembre2023) {
        this.examenesMedicosDiciembre2023 = examenesMedicosDiciembre2023;
    }
    
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el nombre del participante: ");
            this.nombre = scanner.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            this.fechaNacimiento = scanner.nextLine();

            System.out.print("- Tiene sanciones recientes? (si/no): ");
            String sancionesInput = scanner.nextLine().toLowerCase();
            if (!sancionesInput.equals("si") && !sancionesInput.equals("no")) {
                throw new IllegalArgumentException("Entrada invalida. Por favor, ingrese 'si' o 'no'.");
            }
            this.sancionesRecientes = sancionesInput.equals("si");

            System.out.print("- Se ha sometido a examenes medicos en diciembre del 2023? (si/no): ");
            String examenesMedicosInput = scanner.nextLine().toLowerCase();
            if (!examenesMedicosInput.equals("si") && !examenesMedicosInput.equals("no")) {
                throw new IllegalArgumentException("Entrada invalida. Por favor, ingrese 'si' o 'no'.");
            }
            this.examenesMedicosDiciembre2023 = examenesMedicosInput.equals("si");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
