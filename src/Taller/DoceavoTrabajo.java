package Taller;

import java.util.Scanner;

public class DoceavoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("ingrese numero");
        int num=t.nextInt();
        
        int arr[][]=new int[n][num];
        
        System.out.println("llenar arreglo");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=t.nextInt();
            }
        }
        
        System.out.println("mostrar arreglo");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println(arr[i][j]+" ");
            }
        }
        
        System.out.println("multiplicacion: "+sum(arr,n-1,num-1));
    }
    public static int sum(int[][] arr, int n, int num){
        if ((n == 0) && (num == 0)) {
            return arr [n][num];
        }else{
            if (n>-1) {
                num--;
                if (num>=-1) {
                    return arr[n][num+1]+sum(arr, n, num);
                }else{
                    return sum(arr, n-1, 2);
                }
            }else{
                return 0;
            }
        }
    }
}
