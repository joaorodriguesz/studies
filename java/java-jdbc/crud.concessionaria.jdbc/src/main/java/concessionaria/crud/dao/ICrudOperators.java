package concessionaria.crud.dao;

import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;

import java.util.List;
import java.util.Optional;

public interface ICrudOperators<T,Y> {

    T save(T object);
    T update(T object);
    void delete(Long id);
    List<Y> findAll();

    Optional<Y> findById(Long id);
}
