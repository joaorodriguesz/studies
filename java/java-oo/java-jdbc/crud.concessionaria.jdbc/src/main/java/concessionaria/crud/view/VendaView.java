package concessionaria.crud.view;

import java.math.BigDecimal;

public class VendaView {
    private Long id;
    private BigDecimal valorVenda;
    private String condicaoPagemento;
    private String cliente;
    private String funcionario;
    private String dataVenda;
    private String observacao;

    public VendaView(){};

    public VendaView(Long id, BigDecimal valorVenda, String condicaoPagemento, String cliente, String funcionario, String dataVenda, String observacao) {
        this.id = id;
        this.valorVenda = valorVenda;
        this.condicaoPagemento = condicaoPagemento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataVenda = dataVenda;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getCondicaoPagemento() {
        return condicaoPagemento;
    }

    public void setCondicaoPagemento(String condicaoPagemento) {
        this.condicaoPagemento = condicaoPagemento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
