package Taller;

import java.util.Scanner;

public class DecimoTrabajo {

    public static void main(String[] args) {
        Scanner Texto = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=Texto.nextInt();
        System.out.println("ingrese numero");
        int Numero=Texto.nextInt();
        
        System.out.println("multiplicacion: "+Multiplicacion(numero,Numero));
    }
    public static int Multiplicacion(int number, int Number){
        if (number==0 || Number==0) {
            return 0;
        }else{
            return number + Multiplicacion(number,Number - 1); 
        }
    }
}
