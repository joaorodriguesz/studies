package concessionaria.crud.service;

import concessionaria.crud.dao.VendaDAO;
import concessionaria.crud.dto.VendaDTO;
import concessionaria.crud.model.Venda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class VendaService {

    private static final VendaService INSTANCE = new VendaService();
    private VendaService(){}

    private VendaDAO vendaDAO = VendaDAO.getInstance();

    VendaHasVeiculoService vendaHasVeiculoService = VendaHasVeiculoService.getInstance();

    public static VendaService getInstance(){
        return INSTANCE;
    }

    public Venda save(Venda venda) {
        if(Objects.isNull(venda)){
            throw new NullPointerException("O argumento passado não pode ser null");
        }
        return vendaDAO.save(venda);
    }

    public Venda update(Venda venda) {
        if(Objects.isNull(venda)){
            throw new NullPointerException("O argumento passado não pode ser null");
        }
        return vendaDAO.update(venda);
    }

    public void delete(Long id) {
        if(Objects.isNull(id)){
            throw new NullPointerException("O argumento passado não pode ser null");
        }

        vendaHasVeiculoService.findAllById(id).forEach(vendaHasVeiculo -> vendaHasVeiculoService.delete(vendaHasVeiculo.getId()));
        vendaDAO.delete(id);
    }

    public List<VendaDTO> findAll() {
        return vendaDAO.findAll();
    }

    public Optional<VendaDTO> findById(Long id) {
        if(Objects.isNull(id)){
            throw new NullPointerException("O argumento passado não pode ser null");
        }
        return vendaDAO.findById(id);
    }

    public List<Venda> findAllById(Long id) {
        if(Objects.isNull(id)){
            throw new NullPointerException("O argumento passado não pode ser null");
        }
        return vendaDAO.findAllById(id);
    }

}
