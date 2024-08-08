package Taller;

import java.util.Scanner;

public class DoceavoTrabajo {

    public static void main(String[] args) {
        
        try (Scanner TextoScanner = new Scanner(System.in)){

            System.out.println("ingrese numero");
            int numero=TextoScanner.nextInt();
            System.out.println("ingrese numero");
            int Numero=TextoScanner.nextInt();
        
            int array[][]=new int[numero][Numero];
        
            System.out.println("llenar arreglo");
        
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j]=TextoScanner.nextInt();
                }
            }
        
            System.out.println("mostrar arreglo");
        
            for (int i = 0; i < numero; i++) {
                for (int j = 0; j < Numero; j++) {
                    System.out.println(array[i][j]+" ");
                }
            }
        
            System.out.println("multiplicacion: "+Multiplicacion(array,numero-1,Numero-1));    
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static int Multiplicacion(int[][] array, int number, int Number){
        if ((number == 0) && (Number == 0)) {
            return array [number][Number];
        }else{
            if (number>-1) {
                Number--;
                if (Number>=-1) {
                    return array[number][Number+1]+Multiplicacion(array, number, Number);
                }else{
                    return Multiplicacion(array, number-1, 2);
                }
            }else{
                return 0;
            }
        }
    }
}
