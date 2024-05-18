package Taller;

import java.util.Scanner;

public class TercerTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        double numero=textoScanner.nextDouble();
        System.out.println("la suma es: "+suma(numero));
    }
    static double suma(double number){
        
        double contenedor;
        if (number==0) {
            return 0;
        }else{
            contenedor =(double)1/number + suma(number-1);
        }
        return contenedor;
    }
    
}