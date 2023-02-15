package concessionaria.crud.service;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.view.VeiculoView;
import concessionaria.crud.model.Veiculo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<VeiculoView> findAll() {
        List<Object> teste;
        teste.stream().map().collect(Collectors.toCollection())
    }

    public Optional<VeiculoView> findById(Long id) {

        return veiculoDAO.findById(id);
    }

    public Optional<Veiculo> findVeiculoById(Long id) {
        return veiculoDAO.findVeiculoById(id);
    }

}
