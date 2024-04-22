package Taller;

import java.util.Scanner;

public class SegundoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        long n=t.nextLong();
        System.out.println("el sumatoria de "+n+" es: "+su(n));
    }
    static long su(long n){
        if(n==0){
            return 0;
        }else{
            return su(n-1)+n;
        }
    }
        
}
