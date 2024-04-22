package Taller;

import java.util.Scanner;

public class TercerTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        double n=t.nextDouble();
        System.out.println("la suma es: "+suma(n));
    }
    static double suma(double n){
        
        double sum;
        if (n==0) {
            return 0;
        }else{
            sum =(double)1/n + suma(n-1);
        }
        return sum;
    }
    
}