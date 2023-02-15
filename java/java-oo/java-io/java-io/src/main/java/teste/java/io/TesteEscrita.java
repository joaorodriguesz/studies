package teste.java.io;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("HELLO WORLD");
        bufferedWriter.newLine();
        bufferedWriter.write("Welcome to my code");

        bufferedWriter.close();
    }
}
