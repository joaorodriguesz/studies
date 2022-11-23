package concessionaria.crud.dao;

import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.dto.VendaDTO;
import concessionaria.crud.infra.ConnectionFactory;
import concessionaria.crud.model.Venda;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class VendaDAO implements ICrudOperators<Venda, VendaDTO> {

    private static final VendaDAO INSTANCE = new VendaDAO();

    private VendaDAO(){}

    public static VendaDAO getInstance(){
        return INSTANCE;
    }

    @Override
    public Venda save(Venda venda) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO venda(observacao_venda, valor_total_venda, cliente_id_cliente, funcionario_id_funcionario, cond_pagamento_id_condicao, data_venda) VALUES(?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, venda.getObservacao());
            preparedStatement.setBigDecimal(2, venda.getValorTotal());
            preparedStatement.setLong(3, venda.getFkCliente());
            preparedStatement.setLong(4, venda.getFkFuncionario());
            preparedStatement.setLong(5, venda.getFkCondicaoPagamento());
            preparedStatement.setString(6, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long generetedId = resultSet.getLong(1);
            venda.setId(generetedId);

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return venda;
    }

    @Override
    public Venda update(Venda venda) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "UPDATE venda SET observacao_venda = ?, valor_total_venda = ?, cliente_id_cliente = ?, funcionario_id_funcionario = ?, cond_pagamento_id_condicao = ?, data_venda = ? WHERE id_venda = ?";

            PreparedStatement preparedStatement = conection.prepareStatement(sql);

            preparedStatement.setString(1, venda.getObservacao());
            preparedStatement.setBigDecimal(2, venda.getValorTotal());
            preparedStatement.setLong(3, venda.getFkCliente());
            preparedStatement.setLong(4, venda.getFkFuncionario());
            preparedStatement.setLong(5, venda.getFkCondicaoPagamento());
            preparedStatement.setString(6, venda.getDataVenda());
            preparedStatement.setLong(7, venda.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return venda;
    }

    @Override
    public void delete(Long id) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM venda WHERE id_venda = ?";

            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<VendaDTO> findAll() {
        String sql = "SELECT * FROM vw_venda";

        List<VendaDTO> vendaDTOList = new ArrayList<VendaDTO>();

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long id = resultSet.getLong("id");
                BigDecimal valorVenda = resultSet.getBigDecimal("valor_venda");
                String codicaoPagamento = resultSet.getString("condicao_pagamento");
                String cliente = resultSet.getString("cliente");
                String funcionario = resultSet.getString("funcionario");
                String dataVenda = resultSet.getString("data_venda");
                String observacao = resultSet.getString("observacao");

                vendaDTOList.add(new VendaDTO(id, valorVenda, codicaoPagamento, cliente, funcionario, dataVenda, observacao));
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return vendaDTOList;
    }

    @Override
    public Optional<VendaDTO> findById(Long id) {
        String sql = "SELECT * FROM vw_venda WHERE id = ?";

        VendaDTO vendaDTOList = null;

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long idFk = resultSet.getLong("id");
                BigDecimal valorVenda = resultSet.getBigDecimal("valor_venda");
                String codicaoPagamento = resultSet.getString("condicao_pagamento");
                String cliente = resultSet.getString("cliente");
                String funcionario = resultSet.getString("funcionario");
                String dataVenda = resultSet.getString("data_venda");
                String observacao = resultSet.getString("observacao");

                vendaDTOList = new VendaDTO(id, valorVenda, codicaoPagamento, cliente, funcionario, dataVenda, observacao);
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return Optional.ofNullable(vendaDTOList);
    }

    public List<Venda> findAllById(Long id) {
        String sql = "SELECT * FROM venda WHERE id_venda = ?";

        List<Venda> vendaList = new ArrayList<Venda>();

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long idFk = resultSet.getLong("id_venda");
                BigDecimal valorVenda = resultSet.getBigDecimal("valor_total_venda");
                Long codicaoPagamento = resultSet.getLong("cond_pagamento_id_condicao");
                Long cliente = resultSet.getLong("cliente_id_cliente");
                Long funcionario = resultSet.getLong("funcionario_id_funcionario");
                String dataVenda = resultSet.getString("data_venda");
                String observacao = resultSet.getString("observacao_venda");

                vendaList.add(new Venda (idFk, observacao, valorVenda, cliente, funcionario, codicaoPagamento, dataVenda));
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return vendaList;
    }
}
