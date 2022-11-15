package concessionaria.crud.model;

import java.math.BigDecimal;

public class Veiculo {


    public Veiculo (){};

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
        this.id = id;
    }

    public Integer getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(Integer qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Integer getConsumoLitro() {
        return consumoLitro;
    }

    public void setConsumoLitro(Integer consumoLitro) {
        this.consumoLitro = consumoLitro;
    }

    public Integer getQtdMarcha() {
        return qtdMarcha;
    }

    public void setQtdMarcha(Integer qtdMarcha) {
        this.qtdMarcha = qtdMarcha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(Long fkModelo) {
        this.fkModelo = fkModelo;
    }

    public Long getFkConfiguracao() {
        return fkConfiguracao;
    }

    public void setFkConfiguracao(Long fkConfiguracao) {
        this.fkConfiguracao = fkConfiguracao;
    }

    public Long getFkCondicao() {
        return fkCondicao;
    }

    public void setFkCondicao(Long fkCondicao) {
        this.fkCondicao = fkCondicao;
    }

    public Long getFkTipo() {
        return fkTipo;
    }

    public void setFkTipo(Long fkTipo) {
        this.fkTipo = fkTipo;
    }
}
