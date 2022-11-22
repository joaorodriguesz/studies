package concessionaria.crud.service;

import concessionaria.crud.dao.VendaDAO;
import concessionaria.crud.dto.VendaDTO;
import concessionaria.crud.model.Venda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class VendaService {

    private static final VendaService INSTANCE = new VendaService();
    private VendaDAO vendaDAO = VendaDAO.getInstance();

    private VendaService(){}

    public static VendaService getInstance(){
        return INSTANCE;
    }

    public Venda save(Venda venda) {
        if(Objects.isNull(venda)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaDAO.save(venda);
    }

    public Venda update(Venda venda) {
        if(Objects.isNull(venda)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaDAO.update(venda);
    }

    public void delete(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        vendaDAO.delete(id);
    }

    public List<VendaDTO> findAll() {
        return vendaDAO.findAll();
    }

    public Optional<VendaDTO> findById(Long id) {
        if(Objects.isNull(id)){
            throw new IllegalArgumentException("O argumento passado não pode ser null");
        }
        return vendaDAO.findById(id);
    }

}
