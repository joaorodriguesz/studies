package concessionaria.crud.service;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;

import javax.swing.*;
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
        return veiculoDAO.save(veiculo);
    }

    public Veiculo update(Veiculo veiculo) {
        return veiculoDAO.update(veiculo);
    }

    public void delete(Long id) {
        veiculoDAO.delete(id);
    }

    public List<VeiculoDTO> findAll() {
        return veiculoDAO.findAll();
    }

    public Optional<VeiculoDTO> findById(Long id) {
        return veiculoDAO.findById(id);
    }

}
