package cuarto.trabajo;
import java.util.Scanner;

public class eje3 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        asen(n);
        System.out.println("regreso main");
    }
    static void asen(int n){
        if(1<n)
            asen(n-1);
        System.out.println(n+" ");
        
    }
    
}
