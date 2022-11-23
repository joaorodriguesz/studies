package concessionaria.crud.view;

import concessionaria.crud.model.Veiculo;
import concessionaria.crud.service.VeiculoService;
import concessionaria.crud.service.VendaService;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Objects;

public class CrudConcessionaria {

    private VendaService vendaService = VendaService.getInstance();

    private VeiculoService veiculoService = VeiculoService.getInstance();

    private StringBuilder menu = new StringBuilder();

    public CrudConcessionaria(){
        menu.append("=== Sistema de vendas === \n");
        menu.append("---------------------------------------- \n");
        menu.append("=== Veiculos === \n");
        menu.append("1- Cadastrar um veiculo\n");
        menu.append("2- Exibir veiculos Cadastrados\n");
        menu.append("2- Alterar um veiculo Cadastrado\n");
        menu.append("3- Remover um veiculo Cadastrado\n");
        menu.append("---------------------------------------- \n");
        menu.append("=== Vendas === \n");
        menu.append("6- Cadastrar uma venda\n");
        menu.append("7- Exibir vendas cadastradas\n");
        menu.append("8- Alterar uma venda cadastrada\n");
        menu.append("9- Remover uma venda cadastrada\n\n");

        String opcaoSelecionada = JOptionPane.showInputDialog(menu);

        if(Objects.isNull(opcaoSelecionada)){
            JOptionPane.showMessageDialog(null,"Sessão encerrada!");
            return;
        }

        opcoes(Integer.parseInt(opcaoSelecionada));
    }

    private void opcoes (Integer opcaoSelecionada){

        if(Objects.isNull(opcaoSelecionada)){
            JOptionPane.showMessageDialog(null,"Sessão encerrada!");
            return;
        }

        switch (opcaoSelecionada){
            case 1:
                creatVeiculo();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção não encontra");
        }

        this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
    }

    private void creatVeiculo (){
        Veiculo veiculo = new Veiculo();

        try {
            veiculo.setQtdRodas(Integer.parseInt(JOptionPane.showInputDialog("quantidade de rodas ?")));
            veiculo.setConsumoLitro(Integer.parseInt(JOptionPane.showInputDialog("consumo por litro ?")));
            veiculo.setQtdMarcha(Integer.parseInt(JOptionPane.showInputDialog("quantidade de marcha ?")));
            veiculo.setFkModelo( Long.parseLong(JOptionPane.showInputDialog("Modelo ?")));
            veiculo.setFkConfiguracao( Long.parseLong(JOptionPane.showInputDialog("configuração ?")));
            veiculo.setFkCondicao(Long.parseLong(JOptionPane.showInputDialog("condição ?")));
            veiculo.setFkTipo(Long.parseLong(JOptionPane.showInputDialog("Tipo ?")));
            veiculo.setValor(new BigDecimal(JOptionPane.showInputDialog("valor ?")));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Houve um erro ao inserir seu dado. Tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        veiculoService.save(veiculo);

        JOptionPane.showMessageDialog(null,"Veiculo cadastrado");
    }
}
