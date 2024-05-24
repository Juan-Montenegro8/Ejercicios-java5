package Taller;

import java.util.Scanner;

public class OnceavoTrabajp {

    public static void main(String[] args) {
        Scanner Texto = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=Texto.nextInt();
        int array []= new int[numero];
        
        System.out.println("llenar arreglo");
        
        for (int i = 0; i < array.length; i++) {
            array[i] =Texto.nextInt();
        }
        
        System.out.println("suma: "+Suma(array,0));
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
