package concessionaria.crud;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;

import java.math.BigDecimal;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
       VeiculoDAO dao = new VeiculoDAO();

        Veiculo veiculo = new Veiculo();

        Optional<Veiculo> veiculo2 = dao.findById(1L);

        System.out.println(veiculo2.get().getFkModelo());

        Veiculo veiculo3 = veiculo2.get();


//         dao.findAll().forEach(a -> {
//             System.out.println(a.getId());
//         });
//
//        veiculo.setConsumoLitro(23);
//        veiculo.setQtdMarcha(23);
//        veiculo.setQtdRodas(23);
//        veiculo.setValor(BigDecimal.valueOf(230000));
//        veiculo.setFkCondicao(1L);
//        veiculo.setFkConfiguracao(1L);
//        veiculo.setFkTipo(1L);
//        veiculo.setFkModelo(1L);
//
//        Veiculo veiculo1 = dao.save(veiculo);
//
//        System.out.println(" Adicionado registro de id: " + veiculo1.getId());

    }
}