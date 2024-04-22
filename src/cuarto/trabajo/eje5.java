package cuarto.trabajo;

import java.io.IOException;

public class eje5 {

    
    public static void main(String[] args) throws IOException {
        
        System.out.println("ingrese una palbra con punto");
        ca();
        System.out.println("regreso a main");
    }
    static void ca() throws IOException{
        char ch = (char)System.in.read();
        if(ch!='.'){
            ca();
        }
        System.out.println(ch);
    
    }
    
}
