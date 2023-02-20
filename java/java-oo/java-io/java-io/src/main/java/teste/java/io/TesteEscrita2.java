package teste.java.io;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
//        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);+

        FileWriter fileWriter = new FileWriter("lorem2.txt");


        fileWriter.write("HELLO WORLD");
        fileWriter.write(System.lineSeparator() );
        fileWriter.write("Welcome to my code");

        fileWriter.close();
    }
}
