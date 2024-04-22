package Taller;

import java.util.Scanner;

public class NovenoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        System.out.println("ingrese numero");
        int num=t.nextInt();
        
        System.out.println("Coociente: "+coc(n,num));
    }
    public static int coc(int n, int num) {
        if (n > num)
            return 0;
        else
            return 1 + coc(n - num, num);
    }
}
