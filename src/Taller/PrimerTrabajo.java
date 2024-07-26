package Taller;

import java.util.Scanner;

public class PrimerTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        try {
            System.out.println("ingrese limite");
            long numero=textoScanner.nextLong();
            System.out.println("el factorial de "+numero+" es: "+factorial(numero));
        } catch (Exception e) {
            textoScanner.close();
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
