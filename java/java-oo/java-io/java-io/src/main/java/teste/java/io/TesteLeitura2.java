package teste.java.io;

import java.io.*;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("valores.csv"));

        while (scanner.hasNextLine()){
           // System.out.println(scanner.nextLine());

            Scanner lineScanner = new Scanner(scanner.nextLine());
            lineScanner.useDelimiter(",");

            String valor1 = lineScanner.next();

            System.out.println(valor1);
        }
    }


}
