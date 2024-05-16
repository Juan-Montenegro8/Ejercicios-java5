package cuarto.trabajo;

import java.io.IOException;

public class eje5 {

    
    public static void main(String[] args) throws IOException {
        
        System.out.println("ingrese una palbra con punto");
        recursivo();
        System.out.println("regreso a main");
    }
    static void recursivo() throws IOException{
        char character = (char)System.in.read();
        if(character!='.'){
            recursivo();
        }
        System.out.println(character);
    
    }
    
}
