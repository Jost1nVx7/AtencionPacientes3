/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.orellana.gob.ec.atencionpacientes3;

/**
 *
 * @author Global Technology Ec
 */
class PacienteHospitalizado extends Paciente {

    private int numeroCama;
    private String dieta;

    public PacienteHospitalizado(String nombre, int edad, String cedula, int numeroCama, String dieta) {
        super(nombre, edad, cedula, "Consulta general");
        this.numeroCama = numeroCama;
        this.dieta = dieta;
    }

    @Override
    public String getTipoPaciente() {
        return "Paciente Hospitalizado";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cama: " + numeroCama + ", Dieta: " + dieta;
    }
}
