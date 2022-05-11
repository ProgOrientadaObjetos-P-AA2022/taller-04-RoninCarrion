/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosdocentes;

/**
 *
 * @author ronni
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Variables
        String nombre;
        String apellido;
        String cedula;
        double sueldoBasico;
        // Primer Objeto
        DatosDocentes datos = new DatosDocentes();
        System.out.printf("%s\n", datos);
        nombre = "Carlos";
        apellido = "Donald";
        cedula = "1104572634";
        sueldoBasico = 630.26;
        
        // Segundo Objeto
        DatosDocentes datDocentes = new DatosDocentes(nombre, apellido, cedula, sueldoBasico);
        System.out.printf("%s\n",datDocentes);
    }
}
