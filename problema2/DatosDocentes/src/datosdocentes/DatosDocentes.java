/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosdocentes;

/**
 *
 * @author ronni
 */
public class DatosDocentes {

    private String nombreDocente;
    private String apellidoDocente;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public DatosDocentes() {
        nombreDocente = "Marjorie";
        apellidoDocente = "Valdivieso";
        sueldoBasico = 425;
        sueldoTotal = ((sueldoBasico) * 0.2) + sueldoBasico;
        cedula = "1104657283";
    }

    public DatosDocentes(String nombre,String apellido, String id, double a) {
        nombreDocente = nombre;
        apellidoDocente = apellido;
        sueldoBasico = a;
        sueldoTotal = ((sueldoBasico) * 0.2) + sueldoBasico;
        cedula = id;
    }

    public void establecerNombreDocente(String a) {
        nombreDocente = a;

    }

    public void establecerApellidoDocente(String a) {
        apellidoDocente = a;

    }

    public void establecerSueldoBasico(double a) {
        sueldoBasico = a;

    }

    public void establecerSueldoTotal() {
        sueldoTotal = ((sueldoBasico) * 0.2) + sueldoBasico;
    }

    public void establecerCedula(String a) {
        cedula = a;
    }
        public String obtenerNombreDocente() {
        return nombreDocente;

    }

    public String obtenerApellidoDocente() {
        return apellidoDocente;

    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;

    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }
    @Override
    public String toString(){
        String stringFinal;
        stringFinal = String.format("Datos obtenidos\n"
                                  + "Nombre Docente: %s\n"
                                  + "Apellido Docente: %s\n"
                                  + "Cedula Docente: %s\n"
                                  + "Sueldo Básico: %.2f\n"
                                  + "Sueldo Total: %.2f\n"
                                  + "---------------------------",
                obtenerNombreDocente(),
                obtenerApellidoDocente(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
    return stringFinal;
    }

}
