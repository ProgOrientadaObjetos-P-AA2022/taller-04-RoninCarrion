/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;

/**
 *
 * @author ronni
 */
public class NotasEstudiante {

    String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public NotasEstudiante(String nombre, double a, double b, double c) {
        nombreEstudiante = nombre;
        calificacion1 = a;
        calificacion2 = b;
        calificacion3 = c;
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }
        public NotasEstudiante() {
        nombreEstudiante = "Daniela Pitizaca";
        calificacion1 = 10;
        calificacion2 = 9.99;
        calificacion3 = 8.20;
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }

    public void establecerNombreEstudiante(String a) {
        nombreEstudiante = a;

    }

    public void establecerCalificacion1(double a) {
        calificacion1 = a;
    }

    public void establecerCalificacion2(double a) {
        calificacion2 = a;
    }

    public void establecerCalificacion3(double a) {
        calificacion3 = a;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }
        public String obtenerNombreEstudiante() {
        return nombreEstudiante;

    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
        
    }
    @Override
    public String toString(){
        String stringFinal;
        stringFinal = String.format("Nombre del estudiante: %s\n"
                                  + "Nota 1: %.2f\n"
                                  + "Nota 2: %.2f\n"
                                  + "Nota 3: %.2f\n"
                                  + "------------------------",
                                  obtenerNombreEstudiante(),
                                  obtenerCalificacion1(),
                                  obtenerCalificacion2(),
                                  obtenerCalificacion3());
    return stringFinal;
    }

}
