package Taller;

import java.util.Scanner;

public class OctavoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("ingrese numero");
        int num=t.nextInt();
        
        System.out.println("MCD: "+max(n,num));
    }
    public static int max(int n, int num){
        if(num==0){
            return n;
        }else{
            return max(num, n%num);
        }
    }
}
