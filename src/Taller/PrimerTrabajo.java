package Taller;

import java.util.Scanner;

public class PrimerTrabajo {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in);) {
            System.out.println("ingrese limite");
            long numero=textoScanner.nextLong();
            System.out.println("el factorial de "+numero+" es: "+factorial(numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
    static long factorial(long number){
        if(number==0){
            return 1;
        }else{
            return factorial(number-1)*number;
        }
    }
}
