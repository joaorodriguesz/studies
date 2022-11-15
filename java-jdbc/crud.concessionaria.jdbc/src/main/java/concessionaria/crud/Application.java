package concessionaria.crud;

import concessionaria.crud.dao.VeiculoDAO;
import concessionaria.crud.model.Veiculo;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
       VeiculoDAO dao = new VeiculoDAO();

        Veiculo veiculo = new Veiculo();

        veiculo.setConsumoLitro(23);
        veiculo.setQtdMarcha(23);
        veiculo.setQtdRodas(23);
        veiculo.setValor(BigDecimal.valueOf(230000));
        veiculo.setFkCondicao(1L);
        veiculo.setFkConfiguracao(1L);
        veiculo.setFkTipo(1L);
        veiculo.setFkModelo(1L);

        Veiculo veiculo1 = dao.save(veiculo);

        System.out.println(" Adicionado registro de id: " + veiculo1.getId());

    }
}