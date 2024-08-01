package Taller;

import java.util.Scanner;

public class SextoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=textoScanner.nextInt();
        
        System.out.println("Sumatoria: "+Sumatoria(numero));
    }
    
    public static int Sumatoria(int number){
        if (10>number) {
            return number;
        }else{
            return Sumatoria(number/10)+ (number%10);
        }
    }
    
}
