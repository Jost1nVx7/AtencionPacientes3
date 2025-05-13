/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.orellana.gob.ec.atencionpacientes3;

/**
 *
 * @author Global Technology Ec
 */
abstract class Paciente {

    private static int contadorId = 1;

    protected int id;
    protected String nombre;
    protected int edad;
    protected String cedula;
    protected String tipoAtencion;

    public Paciente(String nombre, int edad, String cedula, String tipoAtencion) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.tipoAtencion = tipoAtencion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad
                + ", Cedula: " + cedula + ", Tipo Atencion: " + tipoAtencion;
    }

    public abstract String getTipoPaciente();
}
