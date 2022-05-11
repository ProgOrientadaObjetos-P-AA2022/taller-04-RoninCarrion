/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacionfinanciera;

/**
 *
 * @author ronni
 */
public class Ejecutor {
    public static void main(String[] args) {
        InformacionFinanciera info = new InformacionFinanciera();
        String nombreCliente = "Ronin Carrión";
        String nombreBanco = "Banco de Guayaquil";
        double valorCheque = 24567.76;
        
        
        // Creación del Segundo objeto al que le voy a enviar argumentos
        InformacionFinanciera financiera = new InformacionFinanciera
        (nombreCliente, nombreBanco, valorCheque);
        
        // Presentar Valores de los objetos
        System.out.printf("%s", info);
        System.out.printf("\n%s", financiera);
    }
  
}
