package Taller;

import java.util.Scanner;

public class OnceavoTrabajp {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        int arr []= new int[n];
        
        System.out.println("llenar arreglo");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] =t.nextInt();
        }
        
        System.out.println("suma: "+sum(arr,0));
    }
    public static int sum(int[] arr, int i){
        int suma=0;
        if (i>=arr.length) {
            return suma;
        }else{
            suma = arr[i];
            return suma + sum(arr, i+1);
        }
    }
}
