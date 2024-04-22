package cuarto.trabajo;

import java.util.Scanner;

public class CuartoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        desen(n);
        System.out.println("regreso main");
    }
    static void desen(int n){
        if(n>0){
            System.out.println(n+" ");
            desen(n-1);
        }
    }
}
