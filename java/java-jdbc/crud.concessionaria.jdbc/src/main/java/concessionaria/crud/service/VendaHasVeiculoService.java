package concessionaria.crud.service;

import concessionaria.crud.dao.VendaHasVeiculoDAO;
import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;
import concessionaria.crud.model.VendaHasVeiculo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class VendaHasVeiculoService {
    private static final VendaHasVeiculoService INSTANCE = new VendaHasVeiculoService();

    private VendaHasVeiculoDAO vendaHasVeiculoDAO = VendaHasVeiculoDAO.getInstance();

    private VendaHasVeiculoService(){}

    public static VendaHasVeiculoService getInstance(){
        return INSTANCE;

    }

    public VendaHasVeiculo save(VendaHasVeiculo veiculo) {
        if(Objects.isNull(veiculo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaHasVeiculoDAO.save(veiculo);
    }

    public VendaHasVeiculo update(VendaHasVeiculo veiculo) {
        if(Objects.isNull(veiculo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaHasVeiculoDAO.update(veiculo);
    }

    public void delete(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        vendaHasVeiculoDAO.delete(id);
    }


    public Optional<VendaHasVeiculo> findById(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaHasVeiculoDAO.findById(id);
    }
}
