package cuarto.trabajo;
import java.util.Scanner;

public class eje3 {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=textoScanner.nextInt();
        
        recursivo(numero);
        System.out.println("regreso main");
    }
    static void recursivo(int number){
        if(1<number)
            recursivo(number-1);
        System.out.println(number+" ");
        
    }
    
}
