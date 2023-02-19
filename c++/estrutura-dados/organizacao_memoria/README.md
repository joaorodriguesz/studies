# Estrutura de dados

----

## Estrutura memória RAM para programas

> - **HEAP** (*restante da memória* )
>
> - ## ↑
>
> - **STACK** (*Variáveis locais/chamadas funções*)
>
> - ## ↑
>
> - **VARIÁVEIS ESTÁTICAS E GLOBAIS**
>
> - ## ↑
>
> - **CÓDIGO DO PROGRAMA**

-----

## Stack (PILHA)

> - É uma região da memória (IMB) do computador que armazena variáveis  temporárias criadas por cada função (incluindo a função main()) e também armazena as chamadas de cada função.
>
> - contém nelas :
>
> > 1.  Variáveis locais das funções;
> > 2. Argumentos;
> > 3. Endereços das áreas de código sendo executadas antes de outras chamadas de função;
> > 4. Retorno de funções.
>
> - Pilha : o último a entrar é o primeiro a sair, **LIFO **(***Last in, First Out***);
>
> Toda vez que uma função declara (cria) uma nova variável, ela é "empurrada" (PUSH) para a pilha. Quando o código sai de uma função, todas as variáveis colocadas na pilha por essa função, são liberadas (deletadas) e essa região de memória fica disponível.
>
> Quando uma função é chamada durante a execução de um programa, um bloco de memória (stackframe) é empilhado no topo da pilha de funções. Neste bloco (stackframe) existem referências para todas as variáveis criadas da função chamada. Ao término da execução da função, esse bloco é desempilhado/deslocado.
>
> Cada bloco empilhado é chamado de ***stack frame***. Dentro de cada frame/bloco temos variáveis para os parâmetros passados para a função, o endereço de retorno (para onde a instrução return aponta).
>
> ----
>
> - Ao instanciar uma objeto assim : ***Classe <Objeto.>***,  ele salva direto na stack (**NA LINGUAGEM C**).
> - Ao instanciar um objeto com ponteiro assim : **Classe *ponteiro = new Classe()***, ele salva na heap e manda o endereço aonde esse objeto foi instanciado para stack. Agora o objeto é criado na heap e terá seu tempo de vida longo pois ao contrário da stack neste caso da heap o objeto vai persistir, na memória até que o programador exclua o objeto via código com comando delete.
>

---

## Nota

> - Para deletar algo na heap é necessário utilizar o comando delete(); 