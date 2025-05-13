/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package www.orellana.gob.ec.atencionpacientes3;

/**
 *
 * @author Global Technology Ec
 */
public class AtencionPacientes3 {

    public static void main(String[] args) {
        SistemaCentroSalud sistema = new SistemaCentroSalud();
        
        // Registrar algunos pacientes
        sistema.registrarPaciente(new PacienteGeneral("Jostin Torres", 21, "2250168859"));
        sistema.registrarPaciente(new PacienteEmergencia("Ribaldo Nantip", 23, "2234663438", "TA: 120/80, FC: 75"));
        sistema.registrarPaciente(new PacienteHospitalizado("Stalyn Campuzano", 23, "2227436478", 5, "Baja en sodio"));
        sistema.registrarPaciente(new PacienteGeneral("Veronica Saez", 20, "2272334788"));
        sistema.registrarPaciente(new PacienteEmergencia("Jhonier Cotaya", 20, "2258237938", "TA: 150/90, FC: 110"));
        
        // Atender pacientes
        System.out.println("\n=== ATENDIENDO PACIENTES ===");
        sistema.atenderPaciente(); // Debería atender la última emergencia (Pedro)
        sistema.atenderPaciente(); // Debería atender la otra emergencia (María)
        sistema.atenderPaciente(); // Debería atender el primer paciente general (Juan)
        
        // Mostrar listado completo
        sistema.mostrarPacientesRegistrados();
        
        // Generar reporte final
        sistema.generarReporteFinal();
    }
}