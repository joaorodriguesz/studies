package concessionaria.crud;

import concessionaria.crud.model.Veiculo;
import concessionaria.crud.model.Venda;
import concessionaria.crud.service.VeiculoService;
import concessionaria.crud.service.VendaService;

import java.math.BigDecimal;

public class CrudVenda {
    //CREAT
    public static void main (String[] args) {
        VendaService vendaService = VendaService.getInstance();
        Venda venda = new Venda("AHSUAHSUAH", java.math.BigDecimal.valueOf(20000),1L, 2L, 1L);

       // vendaService.save(venda);

        //READ

       // System.out.println(vendaService.findAll().get(0).getCliente());

        //System.out.println(vendaService.findById(1L).get());
//        venda.setId();
//        vendaService.update()
    }
}
