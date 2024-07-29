package Taller;

import java.util.Scanner;

public class SegundoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese limite");
        long numero=textoScanner.nextLong();
        System.out.println("el sumatoria de "+numero+" es: "+sumatoria(numero));

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    static long sumatoria(long number){
        if(number==0){
            return 0;
        }else{
            return sumatoria(number-1)+number;
        }
    }
        
}
