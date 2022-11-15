package concessionaria.crud.dao;

import concessionaria.crud.infra.ConnectionFactory;
import concessionaria.crud.model.Veiculo;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class VeiculoDAO implements IVeiculoDAO {

    @Override
    public Veiculo save(Veiculo veiculo) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO veiculo(qtd_rodas, consumo_litro, qtd_marcha, modelo_id_modelo, configuracao_veiculo_id_configuracao, condicao_id_condicao, tipo_veiculo_id_tipo, valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1, veiculo.getQtdRodas());
            preparedStatement.setInt(2, veiculo.getConsumoLitro());
            preparedStatement.setInt(3, veiculo.getQtdMarcha());
            preparedStatement.setLong(4, veiculo.getFkModelo());
            preparedStatement.setLong(5, veiculo.getFkConfiguracao());
            preparedStatement.setLong(6, veiculo.getFkCondicao());
            preparedStatement.setLong(7, veiculo.getFkTipo());
            preparedStatement.setBigDecimal(8, veiculo.getValor());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long generetedId = resultSet.getLong(1);
            veiculo.setId(generetedId);

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return veiculo;
    }

    @Override
    public Veiculo update(Veiculo veiculo) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Veiculo> findAll() {
        return null;
    }

    @Override
    public Optional<Veiculo> findById(Long id) {
        return Optional.empty();
    }
}
