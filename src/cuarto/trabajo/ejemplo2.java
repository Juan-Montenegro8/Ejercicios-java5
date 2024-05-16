package cuarto.trabajo;
import java.util.Scanner;

public class ejemplo2 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int numero=texto.nextInt();
        
        recursivo(numero,1);
        System.out.println("regreso main");
    }
    static void recursivo(int number,int i){
        if(i<=number){
            System.out.println(i+" ");
            recursivo(number,i+1);
            
        }
    }
            
}
