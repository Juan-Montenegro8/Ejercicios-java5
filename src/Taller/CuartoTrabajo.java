package Taller;

import java.util.Scanner;

public class CuartoTrabajo {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=texto.nextInt();
        
        System.out.println("EL invertido es: "+invertido(numero));        
    }
    public static String invertido(int number){
        if (10>number) {
            return ""+number;
        }else{
            return ""+number%10+""+invertido(number/10);
        }
    }
    
}
