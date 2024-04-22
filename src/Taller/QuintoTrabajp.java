package Taller;

import java.util.Scanner;

public class QuintoTrabajp {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        System.out.println("EL invertido es: "+in(n));        
        System.out.println("Original: "+in(Integer.parseInt(in(n))));
    }
    public static String in(int n){
        if (10>n) {
            return ""+n;
        }else{
            return ""+n%10+""+in(n/10);
        }
    }
    
}
