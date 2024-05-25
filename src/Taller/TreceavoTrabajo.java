package Taller;

import java.util.Scanner;

public class TreceavoTrabajo {

    public static void main(String[] args) {
        Scanner TextScanner  = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=TextScanner.nextInt();
        
        fibonacci(numero, 0, 0, 1);
    }
    public static void fibonacci(int Number, int Number1, int Number2, int r){
        if (Number2+r>Number) {
           
        }else{
            Number1 = Number2;
            Number2 = r;
            r = Number1 + Number2;
            System.out.println(r);
            fibonacci(Number, Number1, Number2, r);
        }
    }
}
