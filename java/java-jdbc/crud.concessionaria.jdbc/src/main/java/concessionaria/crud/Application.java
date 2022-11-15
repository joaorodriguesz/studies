package concessionaria.crud;

import concessionaria.crud.dao.VeiculoDAO;

public class Application {
    public static void main(String[] args) {
       VeiculoDAO dao = new VeiculoDAO();

       dao.delete(9L);

//        Veiculo veiculo = new Veiculo();
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