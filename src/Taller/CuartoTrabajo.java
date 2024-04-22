package Taller;

import java.util.Scanner;

public class CuartoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        System.out.println("EL invertido es: "+in(n));        
    }
    public static String in(int n){
        if (10>n) {
            return ""+n;
        }else{
            return ""+n%10+""+in(n/10);
        }
    }
    
}
