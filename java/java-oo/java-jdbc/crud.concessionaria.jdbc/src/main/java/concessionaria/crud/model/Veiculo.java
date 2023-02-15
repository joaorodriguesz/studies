package concessionaria.crud.model;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Objects;

public class Veiculo {


    public Veiculo (){};

    public Veiculo(Integer qtdRodas){
        this.qtdRodas = qtdRodas;
    }

    public Veiculo(Long id, Integer qtdRodas, Integer consumoLitro, Integer qtdMarcha, Long fkModelo, Long fkConfiguracao, Long fkCondicao, Long fkTipo, BigDecimal valor) {
        this.id = id;
        this.qtdRodas = qtdRodas;
        this.consumoLitro = consumoLitro;
        this.qtdMarcha = qtdMarcha;
        this.fkModelo = fkModelo;
        this.fkConfiguracao = fkConfiguracao;
        this.fkCondicao = fkCondicao;
        this.fkTipo = fkTipo;
        this.valor = valor;
    }

    public Veiculo(Integer qtdRodas, Integer consumoLitro, Integer qtdMarcha, Long fkModelo, Long fkConfiguracao, Long fkCondicao, Long fkTipo, BigDecimal valor) {
        this.qtdRodas = qtdRodas;
        this.consumoLitro = consumoLitro;
        this.qtdMarcha = qtdMarcha;
        this.fkModelo = fkModelo;
        this.fkConfiguracao = fkConfiguracao;
        this.fkCondicao = fkCondicao;
        this.fkTipo = fkTipo;
        this.valor = valor;
    }

    private Long id;
    private Integer qtdRodas;
    private Integer consumoLitro;
    private Integer qtdMarcha;
    private BigDecimal valor;
    private Long fkModelo;
    private Long fkConfiguracao;
    private Long fkCondicao;
    private Long fkTipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.id = id;
    }

    public Integer getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(Integer qtdRodas) {
        if(Objects.isNull(qtdRodas)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.qtdRodas = qtdRodas;
    }

    public Integer getConsumoLitro() {
        return consumoLitro;
    }

    public void setConsumoLitro(Integer consumoLitro) {
        if(Objects.isNull(consumoLitro)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.consumoLitro = consumoLitro;
    }

    public Integer getQtdMarcha() {
        return qtdMarcha;
    }

    public void setQtdMarcha(Integer qtdMarcha) {
        if(Objects.isNull(qtdMarcha)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.qtdMarcha = qtdMarcha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        if(Objects.isNull(valor)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.valor = valor;
    }

    public Long getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(Long fkModelo) {
        if(Objects.isNull(fkModelo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.fkModelo = fkModelo;
    }

    public Long getFkConfiguracao() {
        return fkConfiguracao;
    }

    public void setFkConfiguracao(Long fkConfiguracao) {
        if(Objects.isNull(fkConfiguracao)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.fkConfiguracao = fkConfiguracao;
    }

    public Long getFkCondicao() {
        return fkCondicao;
    }

    public void setFkCondicao(Long fkCondicao) {
        if(Objects.isNull(fkCondicao)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.fkCondicao = fkCondicao;
    }

    public Long getFkTipo() {
        return fkTipo;
    }

    public void setFkTipo(Long fkTipo) {
        if(Objects.isNull(fkTipo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        this.fkTipo = fkTipo;
    }
}
