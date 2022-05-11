/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_01;

/**
 *
 * @author ronni
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Variables 
        String nombreEstudiante = "Daniel Montenegro";
        double nota1 = 9.2;
        double nota2 = 9.81;
        double nota3 = 8.91;
        NotasEstudiante notas = new NotasEstudiante(nombreEstudiante, nota1,
                nota2, nota3);
        
        System.out.printf("Datos obtenidos\n%s"
                        + "-------------------------\n", notas);
       
        NotasEstudiante calificaciones = new NotasEstudiante();
        
        System.out.printf("Datos obtenidos\n%s", calificaciones);
    }
}
