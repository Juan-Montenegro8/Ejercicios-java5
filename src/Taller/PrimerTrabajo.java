package Taller;

import java.util.Scanner;

public class PrimerTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        long n=t.nextLong();
        System.out.println("el factorial de "+n+" es: "+fa(n));
    }
    static long fa(long n){
        if(n==0){
            return 1;
        }else{
            return fa(n-1)*n;
        }
    }
}
