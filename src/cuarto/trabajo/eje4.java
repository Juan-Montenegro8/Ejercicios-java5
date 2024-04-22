package cuarto.trabajo;

import java.io.IOException;

public class eje4 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("ingrese una palbra con punto");
        ca();
        System.out.println("regreso a main");
    }
    static void ca() throws IOException{
        char ch = (char)System.in.read();
        if(ch!='.'){
            System.out.println(ch);
            ca();
        }
    }
}
