package Taller;

import java.util.Scanner;

public class CatorceaboTrabajo {

    public static void main(String[] args) {
        try (Scanner TextoScanner = new Scanner(System.in)){
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("ingrese numero");
            int Numero=TextoScanner.nextInt();
        
            ake(numero, Numero);    
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
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
