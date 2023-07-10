# Java-IO Serialização

---

> *Transformar um Objeto em uma fluxo de bits e bytes e ou transformar um fluxo de bits e bytes em um Objeto.*
>
> **HD**
>
> ![](https://raw.githubusercontent.com/joaorodriguesz/estudos/main/java/java-oo/java-io/imgs/serializacao.PNG)
>
> ---
>
> **Rede (*Socket*)**
>
> ![](https://raw.githubusercontent.com/joaorodriguesz/estudos/main/java/java-oo/java-io/imgs/serializacao2.PNG)

----

> Se a classe pai é serializavel todos o filhos serão também.
>
> Se as classes acopladas da classe serializavel não forem serializaveis também, irá gerar uma exceção, mas pode ser corrigida dessa forma:
>
> ```java
> public class Serializavel implements Serializable {
>     private transient ClasseNaoSerializavel;
> }
> ```
>
> porem o atributo não será serializado.

---

## Principais classes

> ```java
> java.io.ObjectOutPutStream
> java.io.ObjectInputStream
> ```