/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.orellana.gob.ec.atencionpacientes3;

/**
 *
 * @author Global Technology Ec
 */
class PacienteEmergencia extends Paciente {

    private String signosVitales;

    public PacienteEmergencia(String nombre, int edad, String cedula, String signosVitales) {
        super(nombre, edad, cedula, "Emergencia");
        this.signosVitales = signosVitales;
    }

    @Override
    public String getTipoPaciente() {
        return "Paciente en Emergencia";
    }

    @Override
    public String toString() {
        return super.toString() + ", Signos vitales: " + signosVitales;
    }
}
