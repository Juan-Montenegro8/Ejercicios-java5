package Taller;

import java.util.Scanner;

public class DecimoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("ingrese numero");
        int num=t.nextInt();
        
        System.out.println("multiplicacion: "+mul(n,num));
    }
    public static int mul(int n, int num){
        if (n==0 || num==0) {
            return 0;
        }else{
            return n + mul(n,num - 1); 
        }
    }
}
