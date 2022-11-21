package concessionaria.crud.model;

import java.math.BigDecimal;
import java.util.Date;

public class Venda {

    private Long id;
    private String observacao;
    private BigDecimal valorTotal;
    private Long fkCliente;
    private Long fkFuncionario;
    private Long fkCondicaoPagamento;
    private Date dataVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Long fkCliente) {
        this.fkCliente = fkCliente;
    }

    public Long getFkFuncionario() {
        return fkFuncionario;
    }

    public void setFkFuncionario(Long fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }

    public Long getFkCondicaoPagamento() {
        return fkCondicaoPagamento;
    }

    public void setFkCondicaoPagamento(Long fkCondicaoPagamento) {
        this.fkCondicaoPagamento = fkCondicaoPagamento;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
}
