package Taller;

import java.util.Scanner;

public class PrimerTrabajo {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        long numero=texto.nextLong();
        System.out.println("el factorial de "+numero+" es: "+factorial(numero));
    }
    static long factorial(long number){
        if(number==0){
            return 1;
        }else{
            return factorial(number-1)*number;
        }
    }
}
