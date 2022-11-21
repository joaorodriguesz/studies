package concessionaria.crud.dao;

import concessionaria.crud.dto.VendaDTO;
import concessionaria.crud.model.Venda;

import java.util.List;
import java.util.Optional;

public class VendaDAO implements ICrudOperators<Venda, VendaDTO> {

    private static final VendaDAO INSTANCE = new VendaDAO();

    private VendaDAO(){}

    public static VendaDAO getInstance(){
        return INSTANCE;
    }

    @Override
    public Venda save(Venda object) {
        return null;
    }

    @Override
    public Venda update(Venda object) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<VendaDTO> findAll() {
        return null;
    }

    @Override
    public Optional<VendaDTO> findById(Long id) {
        return Optional.empty();
    }
}
