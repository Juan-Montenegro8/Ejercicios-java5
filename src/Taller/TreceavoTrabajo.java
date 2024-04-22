package Taller;

import java.util.Scanner;

public class TreceavoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        fibo(n, 0, 0, 1);
    }
    public static void fibo(int n, int n1, int n2, int r){
        if (n2+r>n) {
           
        }else{
            n1 = n2;
            n2 = r;
            r = n1 + n2;
            System.out.println(r);
            fibo(n, n1, n2, r);
        }
    }
}
