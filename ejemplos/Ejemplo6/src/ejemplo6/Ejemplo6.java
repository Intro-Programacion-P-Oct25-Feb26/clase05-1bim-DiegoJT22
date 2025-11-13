/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        double descuento =0.5;
        double costoFijo = 25 ;
        double totalPagar;
        
        
        
        System.out.println("Ingrese su Nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su Usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese el dia de pago");
        diaPago = entrada.nextInt();

        if ((diaPago < 10) && (parroquia.equals("El Valle")
                || parroquia.equals("El Sagrario"))) {
            descuento = costoFijo * descuento;
            totalPagar = costoFijo - descuento;

            System.out.printf("Recibo\n"
                    + "---------------\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Usuario: %s\n"
                    + "Parroquia: %s\n"
                    + "Edad: %d\n"
                    + "Dia Pago: %d\n"
                    + "Descuento: %.2f\n"
                    + "Total a pagar: %.2f", nombre, apellido, usuario, 
                    parroquia, edad, diaPago, descuento, totalPagar);

        } else {
            totalPagar = costoFijo;
            System.out.printf("Recibo\n"
                    + "---------------\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Usuario: %s\n"
                    + "Parroquia: %s\n"
                    + "Edad: %d\n"
                    + "Dia Pago: %d\n"
                    + "Total a pagar: %.2f", nombre, apellido, usuario, 
                    parroquia, edad, diaPago, totalPagar);
        }

        
                
        
    }
    
}
