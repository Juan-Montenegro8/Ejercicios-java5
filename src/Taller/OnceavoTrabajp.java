package Taller;

import java.util.Scanner;

public class OnceavoTrabajp {

    public static void main(String[] args) {
        
        try (Scanner TextoScanner = new Scanner(System.in)){
            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            int array []= new int[numero];
        
            System.out.println("llenar arreglo");
        
            for (int i = 0; i < array.length; i++) {
                array[i] =TextoScanner.nextInt();
            }
        
            System.out.println("suma: "+Suma(array,0));
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        }
    }
    public static int Suma(int[] array, int i){
        int suma=0;
        if (i>=array.length) {
            return suma;
        }else{
            suma = array[i];
            return suma + Suma(array, i+1);
        }
    }
}
