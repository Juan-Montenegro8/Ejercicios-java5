package Taller;

import java.util.Scanner;

public class NovenoTrabajo {

    public static void main(String[] args) {
        Scanner TextoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=TextoScanner.nextInt();
        System.out.println("ingrese numero");
        int Numero=TextoScanner.nextInt();
        
        System.out.println("Coociente: "+Coociente(numero,Numero));
    }
    public static int Coociente(int number, int Number) {
        if (number > Number)
            return 0;
        else
            return 1 + Coociente(number - Number, Number);
    }
}
