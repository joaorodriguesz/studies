# Notas 

---

## Ponteiro This

> - O compilador fornece um ponteiro implícito com os nomes das funções este ponteiro é o '***This***'.
> - O ponteiro '***This***' é passado como argumento oculto para todas as chamadas de função de membros não estático e está disponível como uma variável local dentro do corpo de todas as funções não estáticas.
> - Assim o ponteiro '***This***' é um parâmetro implícito para todas as funções de membro. Portando, dentro de uma função membro, isso pode ser usado para se referir ao objeto de chamada. O ponteiro '***This***' mantém o endereço do objeto atual, em palavras simples, você pode dizer que esta ponteiro aponta para o objeto atual da classe.
> - Contudo existe uma situação em que é necessário, quando o nome de atributos e parâmetros são os mesmos. Para ajudar o compilador a distinguir o membro da classe(atributo) e quem é variável local use '***This***' .