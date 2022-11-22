package concessionaria.crud.model;

public class VendaHasVeiculo {
    private Long id;
    private Long fkVenda;
    private Long fkVeiculo;

    public VendaHasVeiculo(){};

    public VendaHasVeiculo(Long id, Long fkVenda, Long fkVeiculo) {
        this.id = id;
        this.fkVenda = fkVenda;
        this.fkVeiculo = fkVeiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkVenda() {
        return fkVenda;
    }

    public void setFkVenda(Long fkVenda) {
        this.fkVenda = fkVenda;
    }

    public Long getFkVeiculo() {
        return fkVeiculo;
    }

    public void setFkVeiculo(Long fkVeiculo) {
        this.fkVeiculo = fkVeiculo;
    }
}
