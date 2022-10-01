# Polimorfismo

---

**Polimorfismo** é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse.

---

## Assinatura do método

> Cada método possui uma assinatura, que é, trocando em miúdos, uma espécie de formato que deve ser obedecido ao ser chamado.(Quantidade e os tipos de parâmetro).
>
> ```php
> //Iguais pois ambos recebem 2 parametros e ambos são reais
> public function exemplo (n1:Real n2:Real) : Real
> public function exemplo (v1:Real v2:Real) : Inteiro
> ```
>
> 

---

## Sobreposição

>  Seria criar um novo método na classe filha contendo a mesma assinatura e mesmo tipo **de** retorno do método sobrescrito. (Override).Basicamente métodos com a mesma assinatura que fazem coisas diferentes. 

---

## Sobrecarga

Já a **sobrecarga**, Permite métodos **de** mesmo nome, mas com suas assinaturas diferentes. Basicamente métodos com o mesmo nome e funções diferentes, dependendo do parâmetro chama um método diferente.

**OBS: *PHP não tem suporte para Sobrecarga***  

---



## 