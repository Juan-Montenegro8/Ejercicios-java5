package Taller;

import java.util.Scanner;

public class SextoTrabajo {

    public static void main(String[] args) {
        try (Scanner textoScanner = new Scanner(System.in)) {
            System.out.println("ingrese numero");
            int numero=textoScanner.nextInt();
        
            System.out.println("Sumatoria: "+Sumatoria(numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
    public static int Sumatoria(int number){
        if (10>number) {
            return number;
        }else{
            return Sumatoria(number/10)+ (number%10);
        }
    }
    
}
