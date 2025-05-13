/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.orellana.gob.ec.atencionpacientes3;

/**
 *
 * @author Global Technology Ec
 */
class PacienteGeneral extends Paciente {

    public PacienteGeneral(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula, "Consulta general");
    }

    @Override
    public String getTipoPaciente() {
        return "Paciente General";
    }
}
