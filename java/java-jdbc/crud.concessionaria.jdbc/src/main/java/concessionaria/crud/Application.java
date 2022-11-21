package concessionaria.crud;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;
import concessionaria.crud.service.VeiculoService;

import java.math.BigDecimal;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
       VeiculoDAO dao = VeiculoDAO.getInstance();
       VeiculoService veiculoService = VeiculoService.getInstance();

        Optional<VeiculoDTO> a = veiculoService.findById(1L);

        System.out.println(a.get().getId());

//       dao.delete(9L);

        Veiculo veiculo = new Veiculo();
//
//        Optional<Veiculo> veiculo2 = dao.findById(1L);
//
//        Veiculo veiculo3 = veiculo2.get();
//
//        System.out.println(veiculo3.getValor());
//
//        veiculo3.setValor(BigDecimal.valueOf(66666));
//
//        dao.update(veiculo3);


//         dao.findAll().forEach(a -> {
//             System.out.println(a.getId());
//         });
//
        veiculo.setConsumoLitro(45);
        veiculo.setQtdMarcha(3);
        veiculo.setQtdRodas(3);
        veiculo.setValor(BigDecimal.valueOf(66666));
        veiculo.setFkCondicao(1L);
        veiculo.setFkConfiguracao(1L);
        veiculo.setFkTipo(1L);
        veiculo.setFkModelo(1L);

        Veiculo veiculo1 = dao.save(veiculo);

        System.out.println(" Adicionado registro de id: " + veiculo1.getId());

    }
}