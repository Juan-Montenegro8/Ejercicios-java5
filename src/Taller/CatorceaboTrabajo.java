package Taller;

import java.util.Scanner;

public class CatorceaboTrabajo {

    public static void main(String[] args) {
        Scanner Texto = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=Texto.nextInt();
        System.out.println("ingrese numero");
        int Numero=Texto.nextInt();
        
        ake(numero, Numero);
    }
    public static int ake (int number, int Number){
        if (number==0) {
            return Number+1;
        }
        if (Number==0){
            return ake(number-1, 1);
        }
        return ake(number-1, ake(number, Number-1));
    }
}
