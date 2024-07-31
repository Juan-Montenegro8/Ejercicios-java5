package Taller;

import java.util.Scanner;

public class TercerTrabajo {

    public static void main(String[] args) {
        try (Scanner textoScanner = new Scanner(System.in)){
            System.out.println("ingrese limite");
            double numero=textoScanner.nextDouble();
            System.out.println("la suma es: "+suma(numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
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