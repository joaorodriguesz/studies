package teste.java.io;

import java.io.*;

public class TesteCopia {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("lorem.txt"); //System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt"); //System.out;
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }


}
