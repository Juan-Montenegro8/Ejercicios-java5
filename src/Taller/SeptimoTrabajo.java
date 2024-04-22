package Taller;

import java.util.Scanner;

public class SeptimoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("exponencial");
        int e=t.nextInt();
        
        System.out.println("resultado es: "+ex(n,e));
    }
    public static int ex(int n, int e){
        if (e==0) {
            return 1;
        }else{
            return n * ex(n, e-1);
        }
    }
}
