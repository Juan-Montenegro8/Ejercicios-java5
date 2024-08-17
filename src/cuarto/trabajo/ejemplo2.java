package cuarto.trabajo;
import java.util.Scanner;

public class ejemplo2 {

    public static void main(String[] args) {
        try (Scanner textoScanner = new Scanner(System.in)) {
            System.out.println("ingrese numero");
            int numero=textoScanner.nextInt();
        
            recursivo(numero,1);
            System.out.println("regreso main");
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    static void recursivo(int number,int i){
        if(i<=number){
            System.out.println(i+" ");
            recursivo(number,i+1);
            
        }
    }
            
}
