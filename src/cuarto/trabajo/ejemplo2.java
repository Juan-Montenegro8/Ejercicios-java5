package cuarto.trabajo;
import java.util.Scanner;

public class ejemplo2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        int n=t.nextInt();
        
        asen(n,1);
        System.out.println("regreso main");
    }
    static void asen(int n,int i){
        if(i<=n){
            System.out.println(i+" ");
            asen(n,i+1);
            
        }
    }
            
}
