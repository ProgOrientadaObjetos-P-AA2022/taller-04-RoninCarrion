/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informacionfinanciera;

/**
 *
 * @author ronni
 */
public class InformacionFinanciera {


    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public InformacionFinanciera() {
        nombreCliente = "Marjorie Vargas";
        nombreBanco = "Banco de Loja";
        valorCheque = 425;
        comisionBanco = valorCheque * 0.003;
    }

    public InformacionFinanciera(String cliente,String banco, double cheque) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = cheque;
        comisionBanco = valorCheque * 0.003;
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;

    }

    public void establecerNombreBanco(String a) {
        nombreBanco = a;

    }

    public void establecerValorCheque(double a) {
        valorCheque = a;

    }

    public void establecerComisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }
        public String obtenerNombreCliente() {
        return nombreCliente;

    }

    public String obtenerNombreBanco() {
        return nombreBanco;

    }

    public double obtenerValorCheque() {
        return valorCheque;

    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString(){
        String stringFinal;
        stringFinal = String.format("Datos obtenidos\n"
                                  + "Nombre Cliente: %s\n"
                                  + "Nombre Banco: %s\n"
                                  + "Valor del Cheque: %.2f\n"
                                  + "Comisión del Banco: %.2f\n"
                                  + "---------------------------",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
    return stringFinal;
    }  
}
