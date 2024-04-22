package Taller;

import java.util.Scanner;

public class SextoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        System.out.println("Sumatoria: "+su(n));
    }
    
    public static int su(int n){
        if (10>n) {
            return n;
        }else{
            return su(n/10)+ (n%10);
        }
    }
    
}
