/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.orellana.gob.ec.atencionpacientes3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Global Technology Ec
 */
public class SistemaCentroSalud {

    private Stack<Paciente> emergencias;
    private Queue<Paciente> consultaGeneral;
    private List<Paciente> pacientesRegistrados;

    public SistemaCentroSalud() {
        emergencias = new Stack<>();
        consultaGeneral = new LinkedList<>();
        pacientesRegistrados = new ArrayList<>();
    }

    // Registrar un nuevo paciente
    public void registrarPaciente(Paciente paciente) {
        pacientesRegistrados.add(paciente);

        if (paciente.getTipoAtencion().equals("Emergencia")) {
            emergencias.push(paciente);
        } else {
            consultaGeneral.add(paciente);
        }

        System.out.println("Paciente registrado exitosamente: " + paciente.getNombre());
    }

    // Atender paciente según su tipo
    public void atenderPaciente() {
        if (!emergencias.isEmpty()) {
            Paciente paciente = emergencias.pop();
            System.out.println("Atendiendo paciente de EMERGENCIA: " + paciente);
        } else if (!consultaGeneral.isEmpty()) {
            Paciente paciente = consultaGeneral.poll();
            System.out.println("Atendiendo paciente de CONSULTA GENERAL: " + paciente);
        } else {
            System.out.println("No hay pacientes en espera.");
        }
    }

    // Mostrar listado completo de pacientes registrados
    public void mostrarPacientesRegistrados() {
        System.out.println("\n=== LISTADO COMPLETO DE PACIENTES REGISTRADOS ===");
        for (Paciente p : pacientesRegistrados) {
            System.out.println(p);
        }
    }

    // Generar reporte final por tipo de paciente
    public void generarReporteFinal() {
        System.out.println("\n=== REPORTE FINAL POR TIPO DE PACIENTE ===");

        System.out.println("\n--- PACIENTES EN EMERGENCIA ---");
        pacientesRegistrados.stream()
                .filter(p -> p.getTipoAtencion().equals("Emergencia"))
                .forEach(System.out::println);

        System.out.println("\n--- PACIENTES EN CONSULTA GENERAL ---");
        pacientesRegistrados.stream()
                .filter(p -> p.getTipoAtencion().equals("Consulta general"))
                .forEach(System.out::println);

        System.out.println("\n--- PACIENTES HOSPITALIZADOS ---");
        pacientesRegistrados.stream()
                .filter(p -> p instanceof PacienteHospitalizado)
                .forEach(System.out::println);

    }

}
