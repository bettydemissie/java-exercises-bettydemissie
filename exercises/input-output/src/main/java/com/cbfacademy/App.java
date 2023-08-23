package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        String doclocation = "exercises/input-output/src/main/resources/exercise.txt";
        String docdestination = "exercises/input-output/src/main/resources/exerciseoutput.txt";
    
        ReadDoc read = new ReadDoc();

        // read.Read(doclocation);
        read.ReadWrite(docdestination, doclocation);

        
    
    }
}
