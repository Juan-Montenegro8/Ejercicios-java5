/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuarto.trabajo;

import java.util.Scanner;

/**
 *
 * @author Mi pc
 */
public class ejeejeje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        double numero=textoScanner.nextDouble();
        
        double conadort=1;
        for (double i=1;i<=numero;i++){

            conadort=(1/i)+conadort;
        }   

        System.out.println(conadort);
    }
    
}
