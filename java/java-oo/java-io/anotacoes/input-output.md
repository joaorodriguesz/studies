# Java.io - Leitura

----

![](https://raw.githubusercontent.com/joaorodriguesz/estudos/main/java/java-oo/java-io/imgs/java-io.jpeg)

---

> - InputStream => FileInputStream : *Input stream of bytes....*
> - Reader => InputStreamReader: *reading character streams....*
> - Reader => BufferedReader: *reading character streams....*

----

```java
       	//Fluxo de entrada com arquivos  em bytes
		FileInputStream fileInputStream = new FileInputStream("lorem.txt");
		//Tranforma int em caractes
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		//Guardar carecteres ou acumular de uma linha
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
```

---

# Java.io - Escrita

----

> - OutPutSrtream => FileOutPutStream : *output stream of bytes....*
> - Writer => OutputStreamWriter: *writing character streams....*
> - Writer => BufferedWriter: *writing character streams....*

----

```java
        //Fluxo de saida de arquivos em bytes
		OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
		//Tranforma caractes em int
        Writer writer = new OutputStreamWriter(fileOutputStream);
		//Escreve carecteres ou acumular de uma linha
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
```

