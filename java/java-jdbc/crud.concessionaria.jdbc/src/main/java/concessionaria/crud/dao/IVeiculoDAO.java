package concessionaria.crud.dao;

import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;

import java.util.List;
import java.util.Optional;

public interface IVeiculoDAO {

    Veiculo save(Veiculo veiculo);
    Veiculo update(Veiculo veiculo);
    void delete(Long id);
    List<VeiculoDTO> findAll();

    Optional<Veiculo> findById(Long id);
}
