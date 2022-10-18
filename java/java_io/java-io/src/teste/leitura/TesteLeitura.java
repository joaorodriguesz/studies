package teste.leitura;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //FileNotFoundExption - > ioExption
        //Fluxo de entrada com arquivo

        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }



        bufferedReader.close();



    }

}
