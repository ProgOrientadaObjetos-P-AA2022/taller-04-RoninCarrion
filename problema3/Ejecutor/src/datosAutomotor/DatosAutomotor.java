/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosAutomotor;

/**
 *
 * @author ronni
 */
public class DatosAutomotor {
    private String cedula;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public DatosAutomotor() {
        cedula = "1104657283";
        marcaVehiculo = "Mercedes Benz";
        anoFabricacion = 2004;
        valorVehiculo = 20000.99;
        valorMatricula = (valorVehiculo * 0.002)*(2022-anoFabricacion);

    }

    public DatosAutomotor(String id,String marca, int año, double precioVehiculo) {
        cedula = id;
        marcaVehiculo = marca;
        anoFabricacion = año;
        valorVehiculo = precioVehiculo;
        valorMatricula = (valorVehiculo * 0.002)*(2022-anoFabricacion);
    }

    public void establecerCedula(String a) {
        cedula = a;

    }

    public void establecerMarcaVehiculo(String a) {
        marcaVehiculo = a;

    }

    public void establecerAnoFabricacion(int a) {
        anoFabricacion = a;

    }

    public void establecerValorVehiculo(double a) {
        valorVehiculo = a;
    }

    public void establecerValorMatricula() {
        valorMatricula = (valorVehiculo * 0.002)*(2022-anoFabricacion);
    }

    public String obtenerCedula() {
        return cedula;

    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;

    }

    public int obtenerAnoFabricacion() {
        return anoFabricacion;

    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    @Override
    public String toString(){
        String stringFinal;
        stringFinal = String.format("Datos obtenidos\n"
                                  + "Cedula del Dueño: %s\n"
                                  + "Marca del Vehículo: %s\n"
                                  + "Año de Fabricación: %d\n"
                                  + "Valor del Vehículo: %.2f\n"
                                  + "Precio de la Matrícula: %.2f\n"
                                  + "---------------------------",
                obtenerCedula(),
                obtenerMarcaVehiculo(),
                obtenerAnoFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
    return stringFinal;
    }
}
