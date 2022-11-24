package concessionaria.crud.view;

import java.math.BigDecimal;

public class VeiculoView {

    public VeiculoView(Long id, Integer qtdRodas, Integer consumoLitro, Integer qtdMarcha, String modelo, String configuracao, String condicao, String tipo, BigDecimal valor) {
        this.id = id;
        this.qtdRodas = qtdRodas;
        this.consumoLitro = consumoLitro;
        this.qtdMarcha = qtdMarcha;
        this.modelo = modelo;
        this.configuracao = configuracao;
        this.condicao = condicao;
        this.tipo = tipo;
        this.valor = valor;
    }

    private Long id;
    private Integer qtdRodas;
    private Integer consumoLitro;
    private Integer qtdMarcha;
    private String modelo;
    private String configuracao;
    private String condicao;
    private String tipo;
    private BigDecimal valor;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
