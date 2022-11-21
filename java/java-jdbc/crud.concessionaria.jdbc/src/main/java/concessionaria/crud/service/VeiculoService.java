package concessionaria.crud.service;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class VeiculoService {

    private static final VeiculoService INSTANCE = new VeiculoService();

    private VeiculoService(){}

    public static VeiculoService getInstance(){
        return INSTANCE;

    }

    private VeiculoDAO veiculoDAO = VeiculoDAO.getInstance();

    public Veiculo save(Veiculo veiculo) {
        if(Objects.isNull(veiculo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return veiculoDAO.save(veiculo);
    }

    public Veiculo update(Veiculo veiculo) {
        if(Objects.isNull(veiculo)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return veiculoDAO.update(veiculo);
    }

    public void delete(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        veiculoDAO.delete(id);
    }

    public List<VeiculoDTO> findAll() {
        return veiculoDAO.findAll();
    }

    public Optional<VeiculoDTO> findById(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return veiculoDAO.findById(id);
    }
}
