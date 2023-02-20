package teste.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
//        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);+

        //FileWriter fileWriter = new FileWriter("lorem2.txt");+
        PrintWriter printWriter = new PrintWriter("lorem2.txt");

        printWriter.println("HELLO WORLD 3");

        printWriter.close();
    }
}
