package Taller;

import java.util.Scanner;

public class CuartoTrabajo {

    public static void main(String[] args) {
         
        try (Scanner textoScanner = new Scanner(System.in)){
            System.out.println("ingrese numero");
            int numero=textoScanner.nextInt();
        
            System.out.println("EL invertido es: "+invertido(numero));  
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static String invertido(int number){
        if (10>number) {
            return ""+number;
        }else{
            return ""+number%10+""+invertido(number/10);
        }
    }
    
}
