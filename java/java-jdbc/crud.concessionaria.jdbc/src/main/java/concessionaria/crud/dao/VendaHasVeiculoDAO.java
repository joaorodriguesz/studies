package concessionaria.crud.dao;

import concessionaria.crud.infra.ConnectionFactory;
import concessionaria.crud.model.VendaHasVeiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class VendaHasVeiculoDAO implements ICrudOperators<VendaHasVeiculo, VendaHasVeiculo> {
    private static final VendaHasVeiculoDAO INSTANCE = new VendaHasVeiculoDAO();

    private VendaHasVeiculoDAO(){}

    public static VendaHasVeiculoDAO getInstance(){
        return INSTANCE;
    }

    @Override
    public VendaHasVeiculo save(VendaHasVeiculo vendaHasVeiculo) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO venda_has_veiculo(id_venda_has_veiculo, venda_id_venda, veiculo_id_veiculo\n) VALUES(?, ?, ?)";

            PreparedStatement preparedStatement = conection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setLong(1, vendaHasVeiculo.getId());
            preparedStatement.setLong(2, vendaHasVeiculo.getFkVenda());
            preparedStatement.setLong(3, vendaHasVeiculo.getFkVeiculo());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long generetedId = resultSet.getLong(1);
            vendaHasVeiculo.setId(generetedId);

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return vendaHasVeiculo;
    }

    @Override
    public VendaHasVeiculo update(VendaHasVeiculo object) {
        return null;
    }

    @Override
    public void delete(Long id) {
        try(Connection conection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM venda_has_veiculo WHERE id_venda_has_veiculo = ?";

            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<VendaHasVeiculo> findAll() {
        return null;
    }

    @Override
    public Optional<VendaHasVeiculo> findById(Long id) {
        String sql = "SELECT * FROM venda_has_veiculo WHERE id = ?";

        VendaHasVeiculo vendaHasVeiculo = null;

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long idFk = resultSet.getLong("id_venda_has_veiculo");
                Long fkVeiculo = resultSet.getLong("veiculo_id_veiculo");
                Long fkVenda = resultSet.getLong("venda_id_venda");

                vendaHasVeiculo = new VendaHasVeiculo(idFk, fkVeiculo, fkVenda);
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return Optional.ofNullable(vendaHasVeiculo);
    }

    public List<VendaHasVeiculo> findAllByVendaId(Long id) {
        String sql = "SELECT * FROM venda_has_veiculo WHERE venda_id_venda = ?";

        List<VendaHasVeiculo> vendaHasVeiculo = new ArrayList<VendaHasVeiculo>();

        try(Connection conection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Long idFk = resultSet.getLong("id_venda_has_veiculo");
                Long fkVeiculo = resultSet.getLong("veiculo_id_veiculo");
                Long fkVenda = resultSet.getLong("venda_id_venda");

                vendaHasVeiculo.add(new VendaHasVeiculo(idFk, fkVeiculo, fkVenda));
            }

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }

        return vendaHasVeiculo;
    }



}
