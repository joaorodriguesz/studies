package concessionaria.crud;

import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.model.Veiculo;
import concessionaria.crud.service.VeiculoService;

import java.math.BigDecimal;
import java.util.List;

public class CrudVeiculo {
    public static void main(String[] args) {

        //CREAT

        VeiculoService veiculoService = VeiculoService.getInstance();
        Veiculo veiculo = new Veiculo(3,2,3,1L,1L,1L,1L,BigDecimal.valueOf(13232));

        // veiculoService.save(veiculo);

        //READ ALL

        List<VeiculoDTO> veiculoDTOList = veiculoService.findAll();

       // System.out.println(veiculoDTOList.get(0).getModelo());

        //READ ONE

        //System.out.println(veiculoService.findById(4L).get().getModelo());


        //UPDATE
        veiculo.setValor(BigDecimal.valueOf(3000000));
        veiculo.setId(1L);
        //veiculoService.update(veiculo);

        //DELETE

       // veiculoService.delete(8L);





    }
}