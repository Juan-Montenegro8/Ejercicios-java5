package cuarto.trabajo;

import java.io.IOException;

public class eje4 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("ingrese una palbra con punto");
        recursivo();
        System.out.println("regreso a main");
    }
    static void recursivo() throws IOException{
        char character = (char)System.in.read();
        if(character!='.'){
            System.out.println(character);
            recursivo();
        }
    }
}
