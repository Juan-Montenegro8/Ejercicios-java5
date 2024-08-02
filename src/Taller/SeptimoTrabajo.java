package Taller;

import java.util.Scanner;

public class SeptimoTrabajo {

    public static void main(String[] args) {
        
        try (Scanner TextoScanner = new Scanner(System.in)) {
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("exponencial");
            int exponencial=TextoScanner.nextInt();
        
            System.out.println("resultado es: "+Exponencial(numero,exponencial));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static int Exponencial(int number, int exponen){
        if (exponen==0) {
            return 1;
        }else{
            return number * Exponencial(number, exponen-1);
        }
    }
}
