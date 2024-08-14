package cuarto.trabajo;

import java.util.Scanner;

public class CuartoTrabajo {

    public static void main(String[] args) {
        try (Scanner textoScanner = new Scanner(System.in)){

            System.out.println("ingrese numero");
            int numero=textoScanner.nextInt();
        
            recursivo(numero);
            System.out.println("regreso main");
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    static void recursivo(int number){
        if(number>0){
            System.out.println(number+" ");
            recursivo(number-1);
        }
    }
}
