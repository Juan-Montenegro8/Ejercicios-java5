package Taller;

import java.util.Scanner;

public class QuintoTrabajp {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=textoScanner.nextInt();
        
        System.out.println("EL invertido es: "+invertido(numero));        
        System.out.println("Original: "+invertido(Integer.parseInt(invertido(numero))));
    }
    public static String invertido(int number){
        if (10>number) {
            return ""+number;
        }else{
            return ""+number%10+""+invertido(number/10);
        }
    }
    
}
