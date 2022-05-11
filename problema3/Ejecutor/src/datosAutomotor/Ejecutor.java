/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosAutomotor;

/**
 *
 * @author ronni
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Varables 
        String id;
        String marca;
        int anoFabricacion;
        double valorVehiculo;
        DatosAutomotor auto = new DatosAutomotor ();
        System.out.printf("%s\n", auto);
        
        id = "1104572087";
        marca = "Chevrolet";
        anoFabricacion = 2010;
        valorVehiculo = 40000.50;
        DatosAutomotor datos = new DatosAutomotor (id, marca, anoFabricacion, valorVehiculo);
        System.out.printf("%s\n", datos);
    }
    
}
