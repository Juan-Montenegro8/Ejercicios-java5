package Taller;

import java.util.Scanner;

public class OctavoTrabajo {

    public static void main(String[] args) {
        Scanner TextoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=TextoScanner.nextInt();
        System.out.println("ingrese numero");
        int Numero=TextoScanner.nextInt();
        
        System.out.println("MCD: "+maximo(numero,Numero));
    }
    public static int maximo(int contenedor, int numero){
        if(numero==0){
            return contenedor;
        }else{
            return maximo(numero, contenedor%numero);
        }
    }
}
