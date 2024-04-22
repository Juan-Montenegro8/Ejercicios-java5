package Taller;

import java.util.Scanner;

public class CatorceaboTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("ingrese numero");
        int n1=t.nextInt();
        
        ake(n, n1);
    }
    public static int ake (int n, int n1){
        if (n==0) {
            return n1+1;
        }
        if (n1==0){
            return ake(n-1, 1);
        }
        return ake(n-1, ake(n, n1-1));
    }
}
