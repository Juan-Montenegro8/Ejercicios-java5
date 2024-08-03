package Taller;

import java.util.Scanner;

public class OctavoTrabajo {

    public static void main(String[] args) {
        try (Scanner TextoScanner = new Scanner(System.in)){
            
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("ingrese numero");
            int Numero=TextoScanner.nextInt();
        
            System.out.println("MCD: "+maximo(numero,Numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static int maximo(int contenedor, int numero){
        if(numero==0){
            return contenedor;
        }else{
            return maximo(numero, contenedor%numero);
        }
    }
}
