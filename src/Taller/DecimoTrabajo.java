package Taller;

import java.util.Scanner;

public class DecimoTrabajo {

    public static void main(String[] args) {
        
        try (Scanner TextoScanner = new Scanner(System.in)){
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("ingrese numero");
            int Numero=TextoScanner.nextInt();
        
            System.out.println("multiplicacion: "+Multiplicacion(numero,Numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static int Multiplicacion(int number, int Number){
        if (number==0 || Number==0) {
            return 0;
        }else{
            return number + Multiplicacion(number,Number - 1); 
        }
    }
}
