package teste.java.io;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 4871139191131378300L;
    String nome;
    Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
