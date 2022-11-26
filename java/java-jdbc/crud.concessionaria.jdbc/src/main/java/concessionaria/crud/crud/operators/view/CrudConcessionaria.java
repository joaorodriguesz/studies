package concessionaria.crud.crud.operators.view;

import concessionaria.crud.model.Veiculo;
import concessionaria.crud.model.Venda;
import concessionaria.crud.model.VendaHasVeiculo;
import concessionaria.crud.service.VeiculoService;
import concessionaria.crud.service.VendaHasVeiculoService;
import concessionaria.crud.service.VendaService;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Objects;

public class CrudConcessionaria {

    private VendaService vendaService = VendaService.getInstance();

    private VeiculoService veiculoService = VeiculoService.getInstance();

    private VendaHasVeiculoService vendaHasVeiculoService = VendaHasVeiculoService.getInstance();

    private StringBuilder menu = new StringBuilder();
    private StringBuilder modelo = new StringBuilder();
    private StringBuilder config = new StringBuilder();
    private StringBuilder pagamento = new StringBuilder();
    private StringBuilder tipo = new StringBuilder();
    private StringBuilder condicao = new StringBuilder();
    private StringBuilder funcionario = new StringBuilder();

    private StringBuilder cliente = new StringBuilder();

    public CrudConcessionaria(){
        menu.append("=== Sistema de vendas === \n");
        menu.append("---------------------------------------- \n");
        menu.append("=== Veiculos === \n");
        menu.append("1- Cadastrar um veiculo\n");
        menu.append("2- Exibir veiculos Cadastrados\n");
        menu.append("3- Alterar um veiculo Cadastrado\n");
        menu.append("4- Remover um veiculo Cadastrado\n");
        menu.append("---------------------------------------- \n");
        menu.append("=== Vendas === \n");
        menu.append("5- Cadastrar uma venda\n");
        menu.append("6- Cadastrar veiculo na venda\n");
        menu.append("7- Exibir veiculos de uma venda\n");
        menu.append("8- Exibir vendas cadastradas\n");
        menu.append("9- Alterar uma venda cadastrada\n");
        menu.append("10- Remover uma venda cadastrada\n\n");

        modelo.append("\n\n[ID] => 1  [DESC] => GOLF \n");
        modelo.append("[ID] => 2  [DESC] => XJ6 \n");
        modelo.append("[ID] => 3  [DESC] => CORSA\n\n");

        config.append("\n\n[ID] => 1  [DESC] => Hatch \n");
        config.append("[ID] => 2  [DESC] => Esportiva \n");
        config.append("[ID] => 3  [DESC] => Sedan\n\n");

        pagamento.append("\n\n[ID] => 1  [DESC] => Cartão \n");
        pagamento.append("[ID] => 2  [DESC] => Cheque \n");
        pagamento.append("[ID] => 3  [DESC] => À vista\n\n");

        tipo.append("\n\n[ID] => 1  [DESC] => Carro \n");
        tipo.append("[ID] => 2  [DESC] => Moto \n\n");

        condicao.append("\n\n[ID] => 1  [DESC] => Novo \n");
        condicao.append("[ID] => 2  [DESC] => Usado \n\n");

        funcionario.append("\n\n[ID] => 1  [DESC] => Robson da Silva \n");
        funcionario.append("[ID] => 2  [DESC] => Emerson Olhos \n");
        funcionario.append("[ID] => 3  [DESC] => Marcel Inocente\n\n");

        cliente.append("\n\n[ID] => 1  [DESC] => Ezequeiel dos Anjos \n");
        cliente.append("[ID] => 2  [DESC] => João do Mal \n");
        cliente.append("[ID] => 3  [DESC] =>Emiliano da Silva\n\n");


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
                JOptionPane.showMessageDialog(null,readVeiculos());
                break;
            case 3:
                updateVeiculo();
                break;
            case 4:
                deleteVeiculo();
                break;
            case 5:
                creatVenda();
                break;
            case 6:
                creatVeiculoHasVenda();
                break;
            case 7:
                readVendaHasVeiculoByVenda();
                break;
            case 8:
                JOptionPane.showMessageDialog(null,readVenda());
                break;
            case 9:
                updateVenda();
                break;
            case 10:
                deleteVenda();
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
            veiculo.setFkModelo( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Modelo ?"+modelo)));
            veiculo.setFkConfiguracao( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da configuração ?"+config)));
            veiculo.setFkCondicao(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da condição do veiculo?"+condicao)));
            veiculo.setFkTipo(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Tipo de veiculo?"+tipo)));
            veiculo.setValor(new BigDecimal(JOptionPane.showInputDialog("valor ?")));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Houve um erro ao inserir seu dado. Tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        veiculoService.save(veiculo);

        JOptionPane.showMessageDialog(null,"Veiculo cadastrado");
    }

    private StringBuilder readVeiculos() {
        StringBuilder veiculosCadastrados = new StringBuilder();
        veiculosCadastrados.append("\n----------------------------------------------------------------------------------------------------");
        veiculosCadastrados.append("------------------------------------------------------------------------------------------------------");
        veiculosCadastrados.append("------------------------------------------------------------------------------------------------------\n");
        veiculoService.findAll().forEach(veiculos -> {
            veiculosCadastrados.append("[ID] => "+veiculos.getId()+"    ");
            veiculosCadastrados.append("[QTD_RODAS] => "+veiculos.getQtdRodas()+"    ");
            veiculosCadastrados.append("[CONSUMO] => "+veiculos.getConsumoLitro()+"    ");
            veiculosCadastrados.append("[QTD_MARCHA] => "+veiculos.getQtdMarcha() +"    ");
            veiculosCadastrados.append("[MODELO] => "+veiculos.getModelo()+"    ");
            veiculosCadastrados.append("[CONFIG] => "+veiculos.getConfiguracao()+"    ");
            veiculosCadastrados.append("[CONDICAO] => "+veiculos.getCondicao()+"    ");
            veiculosCadastrados.append("[TIPO] => "+veiculos.getTipo()+"    ");
            veiculosCadastrados.append("[VALOR] => "+veiculos.getValor()+"    ");
            veiculosCadastrados.append("\n----------------------------------------------------------------------------------------------------");
            veiculosCadastrados.append("------------------------------------------------------------------------------------------------------");
            veiculosCadastrados.append("------------------------------------------------------------------------------------------------------\n");
        });

        return veiculosCadastrados;
    }

    private void updateVeiculo(){
        Long id = null;
        Veiculo veiculo = null;
        try {
            id = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do veiculo a ser alterado ?"+readVeiculos()));
            veiculo = veiculoService.findVeiculoById(id).get();
            veiculo.setQtdRodas(Integer.parseInt(JOptionPane.showInputDialog("quantidade de rodas ?")));
            veiculo.setConsumoLitro(Integer.parseInt(JOptionPane.showInputDialog("consumo por litro ?")));
            veiculo.setQtdMarcha(Integer.parseInt(JOptionPane.showInputDialog("quantidade de marcha ?")));
            veiculo.setFkModelo( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Modelo ?"+modelo)));
            veiculo.setFkConfiguracao( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da configuração ?"+config)));
            veiculo.setFkCondicao(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da condição de pagamento?"+pagamento)));
            veiculo.setFkTipo(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Tipo de veiculo?"+tipo)));
            veiculo.setValor(new BigDecimal(JOptionPane.showInputDialog("valor ?")));



        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Houve um erro ao alterar seu registro tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        veiculoService.update(veiculo);
        JOptionPane.showMessageDialog(null,"Registro ["+veiculo.getId()+"] alterado com sucesso!'");
    }

    private void deleteVeiculo() {
        Long id = null;

        try {
            id = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do veiculo a ser deletado ?"+readVeiculos()));
        } catch (Exception exception){
            JOptionPane.showMessageDialog(null,"Houve um erro ao deletar seu registro tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        veiculoService.delete(id);

        JOptionPane.showMessageDialog(null,"Registro ["+id+"] deletado com sucesso!'");
    }

    private void creatVenda() {
        Venda venda = new Venda();

        try {
            venda.setObservacao(JOptionPane.showInputDialog("Observação ?"));
            venda.setValorTotal(new BigDecimal(JOptionPane.showInputDialog("valor total da venda ?")));
            venda.setFkCliente(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do cliente ?"+cliente)));
            venda.setFkFuncionario( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Funcionario ?"+funcionario)));
            venda.setFkCondicaoPagamento( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da condição de pagamento  ?"+pagamento)));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Houve um erro aocadastrar seu dado. Tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        Venda vendaSalva = vendaService.save(venda);
        JOptionPane.showMessageDialog(null,"Venda cadastrada");
    }

    private StringBuilder readVenda() {
        StringBuilder vendasCadastradas = new StringBuilder();
        vendasCadastradas.append("\n----------------------------------------------------------------------------------------------------");
        vendasCadastradas.append("------------------------------------------------------------------------------------------------------");
        vendasCadastradas.append("------------------------------------------------------------------------------------------------------\n");
        vendaService.findAll().forEach(venda -> {
            vendasCadastradas.append("[ID] => "+venda.getId()+"    ");
            vendasCadastradas.append("[OBS] => "+venda.getObservacao()+"    ");
            vendasCadastradas.append("[VALOR_TOTAL] => "+venda.getValorVenda()+"    ");
            vendasCadastradas.append("[CLIENTE] => "+venda.getCliente() +"    ");
            vendasCadastradas.append("[FUNCIONARIO] => "+venda.getFuncionario()+"    ");
            vendasCadastradas.append("[CONDICAO] => "+venda.getCondicaoPagemento()+"    ");
            vendasCadastradas.append("[DATA] => "+venda.getDataVenda()+"    ");
            vendasCadastradas.append("\n----------------------------------------------------------------------------------------------------");
            vendasCadastradas.append("------------------------------------------------------------------------------------------------------");
            vendasCadastradas.append("------------------------------------------------------------------------------------------------------\n");
        });

        return vendasCadastradas;
    }

    private void updateVenda() {
        Long id = null;
        Venda venda = null;
        try {
            id = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da venda a ser alterado ?"+readVenda()));
            venda = vendaService.findAllById(id).get(0);
            venda.setObservacao(JOptionPane.showInputDialog("Observação ?"));
            venda.setValorTotal(new BigDecimal(JOptionPane.showInputDialog("valor total da venda ?")));
            venda.setFkCliente(Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do cliente ?"+cliente)));
            venda.setFkFuncionario( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do Funcionario ?"+funcionario)));
            venda.setFkCondicaoPagamento( Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da condição de pagamento  ?"+pagamento)));

        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Houve um erro ao alterar seu registro tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        vendaService.update(venda);
        JOptionPane.showMessageDialog(null,"Registro ["+venda.getId()+"] alterado com sucesso!'");
    }

    private void deleteVenda() {
        Long id = null;

        try {
            id = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da venda a ser deletada (Todos os itens da venda seram removidos junto) ?"+readVenda()));
        } catch (Exception exception){
            JOptionPane.showMessageDialog(null,"Houve um erro ao deletar seu registro tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        vendaService.delete(id);

        JOptionPane.showMessageDialog(null,"Registro ["+id+"] deletado com sucesso!'");
    }

    private void creatVeiculoHasVenda() {
        VendaHasVeiculo vendaHasVeiculo = null;
        try {
            Long idVenda = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da venda a ser adicionada um venda ?"+readVenda()));
            Long idVeiculo = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] do veiculo a ser adicionado na veiculo ?"+readVeiculos()));
            vendaHasVeiculo = new VendaHasVeiculo();
            vendaHasVeiculo.setFkVenda(idVenda);
            vendaHasVeiculo.setFkVeiculo(idVeiculo);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Houve um erro ao cadastrar seu registro tente novamente!");
            this.opcoes(Integer.parseInt(JOptionPane.showInputDialog(menu)));
        }

        vendaHasVeiculoService.save(vendaHasVeiculo);

        JOptionPane.showMessageDialog(null,"Registro Cadastrado com sucesso!");

        Integer simNao = JOptionPane.showConfirmDialog(null, "Quer adicionar outro veiculo a venda?");

        if(simNao.equals(Integer.valueOf(0))){
            creatVeiculoHasVenda();
        }

    }

    private void readVendaHasVeiculoByVenda() {
        Long idVenda = Long.parseLong(JOptionPane.showInputDialog("Selecione o [ID] da venda a ser exibida os veiculos ?"+readVenda()));
        StringBuilder vendaHasVeiculos = new StringBuilder();
        vendaHasVeiculos.append("\n----------------------------------------------------------------------------------------------------");
        vendaHasVeiculos.append("------------------------------------------------------------------------------------------------------");
        vendaHasVeiculos.append("------------------------------------------------------------------------------------------------------\n");
        vendaHasVeiculoService.findAllById(idVenda).forEach(veiculos -> {
            vendaHasVeiculos.append("[ID] => "+veiculos.getId()+"    ");
            vendaHasVeiculos.append("[ID_VENDA] => "+veiculos.getFkVeiculo()+"    ");
            vendaHasVeiculos.append("[ID_VEICULO] => "+veiculos.getFkVenda()+"    ");
            vendaHasVeiculos.append("\n----------------------------------------------------------------------------------------------------");
            vendaHasVeiculos.append("------------------------------------------------------------------------------------------------------");
            vendaHasVeiculos.append("------------------------------------------------------------------------------------------------------\n");
        });

        JOptionPane.showInputDialog(vendaHasVeiculos);
    }


}
