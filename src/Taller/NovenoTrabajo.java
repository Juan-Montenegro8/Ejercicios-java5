package Taller;

import java.util.Scanner;

public class NovenoTrabajo {

    public static void main(String[] args) {
        try (Scanner TextoScanner = new Scanner(System.in)){
            
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("ingrese numero");
            int Numero=TextoScanner.nextInt();
        
            System.out.println("Coociente: "+Coociente(numero,Numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static int Coociente(int number, int Number) {
        if (number > Number)
            return 0;
        else
            return 1 + Coociente(number - Number, Number);
    }
}
