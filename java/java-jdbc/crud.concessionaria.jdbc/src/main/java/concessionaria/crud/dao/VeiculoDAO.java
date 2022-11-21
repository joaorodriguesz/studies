package concessionaria.crud.dao;

import concessionaria.crud.dto.VeiculoDTO;
import concessionaria.crud.infra.ConnectionFactory;
import concessionaria.crud.model.Veiculo;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class VeiculoDAO implements ICrudOperators<Veiculo, VeiculoDTO> {

    private static final VeiculoDAO INSTANCE = new VeiculoDAO();

    private VeiculoDAO(){}

    public static VeiculoDAO getInstance(){
        return INSTANCE;
    }

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
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "UPDATE veiculo SET qtd_rodas = ?, consumo_litro = ?, qtd_marcha = ?, modelo_id_modelo = ?, configuracao_veiculo_id_configuracao = ?, condicao_id_condicao = ?, tipo_veiculo_id_tipo = ?, valor = ? WHERE id_veiculo = ?";

            PreparedStatement preparedStatement = conection.prepareStatement(sql);

            preparedStatement.setInt(1, veiculo.getQtdRodas());
            preparedStatement.setInt(2, veiculo.getConsumoLitro());
            preparedStatement.setInt(3, veiculo.getQtdMarcha());
            preparedStatement.setLong(4, veiculo.getFkModelo());
            preparedStatement.setLong(5, veiculo.getFkConfiguracao());
            preparedStatement.setLong(6, veiculo.getFkCondicao());
            preparedStatement.setLong(7, veiculo.getFkTipo());
            preparedStatement.setBigDecimal(8, veiculo.getValor());
            preparedStatement.setLong(9, veiculo.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return veiculo;
    }

    @Override
    public void delete(Long id) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM veiculo WHERE id_veiculo = ?";

            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

    }

    @Override
    public List<VeiculoDTO> findAll() {
        String sql = "SELECT * FROM vw_veiculo";

        List<VeiculoDTO> veiculoDtoList = new ArrayList<VeiculoDTO>();

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long id = resultSet.getLong("id");
                Integer qtdRodas = resultSet.getInt("qtd_rodas");
                Integer consumoLitro = resultSet.getInt("consumo_litro");
                Integer qtdMarcha = resultSet.getInt("qtd_marcha");
                String modelo = resultSet.getString("modelo");
                String configuracao = resultSet.getString("configuracao");
                String condicao = resultSet.getString("condicao");
                String tipo = resultSet.getString("tipo");
                BigDecimal valor = resultSet.getBigDecimal("valor");

                veiculoDtoList.add(new VeiculoDTO(id, qtdRodas, consumoLitro, qtdMarcha, modelo, configuracao, condicao, tipo, valor));
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return veiculoDtoList;
    }

    @Override
    public Optional<VeiculoDTO> findById(Long id) {

        String sql = "SELECT * FROM vw_veiculo WHERE id = ?";

        VeiculoDTO veiculoDTO = null;

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long idFk = resultSet.getLong("id");
                Integer qtdRodas = resultSet.getInt("qtd_rodas");
                Integer consumoLitro = resultSet.getInt("consumo_litro");
                Integer qtdMarcha = resultSet.getInt("qtd_marcha");
                String modelo = resultSet.getString("modelo");
                String configuracao = resultSet.getString("configuracao");
                String condicao = resultSet.getString("condicao");
                String tipo = resultSet.getString("tipo");
                BigDecimal valor = resultSet.getBigDecimal("valor");

                veiculoDTO = new VeiculoDTO(id, qtdRodas, consumoLitro, qtdMarcha, modelo, configuracao, condicao, tipo, valor);
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return Optional.ofNullable(veiculoDTO);
    }
}
