package sumptus.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import sumptus.dao.AreaDAO;
import sumptus.dao.PayFormDAO;
import sumptus.dao.UserDAO;
import sumptus.model.Outlay;
/**
 *
 * @author Jessica Dagostini
 */
public class OutlayDAO {
    Connection con;
    AreaDAO areaDAO;
    PayFormDAO pformDAO;
    UserDAO userDAO;
    
    public OutlayDAO(Connection con){
        this.con = con;
        areaDAO = new AreaDAO(con);
        pformDAO = new PayFormDAO(con);
        userDAO = new UserDAO(con);
    }
    
    public Integer create(Outlay outlay) throws SQLException{
        String sql = "INSERT INTO outlays (user_id, area_id, payform_id, description, cost, purchase_date, payment_day) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stm.setInt(1, outlay.getUser().getId());
            stm.setInt(2, outlay.getArea().getId());
            stm.setInt(3, outlay.getPform().getId());
            stm.setString(4, outlay.getDescription());
            stm.setBigDecimal(5, outlay.getCost());
            stm.setTimestamp(6, outlay.getPurchase_date());
            stm.setTimestamp(7, outlay.getPayment_day());
            stm.execute();

            try (ResultSet resultSet = stm.getGeneratedKeys()) {
                while (resultSet.next()) {
                    idCriado = resultSet.getInt(1);
                }
            }
            con.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar executar insercao: " + ex.getMessage());
            con.rollback();
        }

        return idCriado;
    }
    
    public Outlay findById(Integer id) throws SQLException {
        String sql = "SELECT * FROM outlays WHERE id = ?";
        Outlay outlay = null;
        try(PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.execute();

            try(ResultSet resultSet = stm.getResultSet()) {
                while(resultSet.next()) {
                    outlay = new Outlay();
                    outlay.setId(resultSet.getInt("id"));
                    outlay.setArea(areaDAO.findById(resultSet.getInt("area_id")));
                    outlay.setPform(pformDAO.findById(resultSet.getInt("payform_id")));
                    outlay.setUser(userDAO.findById(resultSet.getInt("user_id")));
                    outlay.setDescription(resultSet.getString("description"));
                    outlay.setPurchase_date(resultSet.getTimestamp("purchase_date"));
                    outlay.setPayment_day(resultSet.getTimestamp("payment_day"));
                }
            }
        } catch (Exception ex){
            System.out.println("Não encontrou por ID " + ex.getMessage());
        }

        return outlay;
    }
    
    public List<Outlay> findAll() throws SQLException {
        String sql = "SELECT * FROM outlays";
        List<Outlay> outlays = new ArrayList<>();
        Outlay outlay = null;
        
        try(PreparedStatement stm = con.prepareStatement(sql)) {
            stm.execute();

            try(ResultSet resultSet = stm.getResultSet()) {
                while(resultSet.next()) {
                    outlay = new Outlay();
                    outlay.setId(resultSet.getInt("id"));
                    outlay.setArea(areaDAO.findById(resultSet.getInt("area_id")));
                    outlay.setPform(pformDAO.findById(resultSet.getInt("payform_id")));
                    outlay.setUser(userDAO.findById(resultSet.getInt("user_id")));
                    outlay.setDescription(resultSet.getString("description"));
                    outlay.setPurchase_date(resultSet.getTimestamp("purchase_date"));
                    outlay.setPayment_day(resultSet.getTimestamp("payment_day"));
                    outlays.add(outlay);
                }
            }
        } catch (Exception ex){
            System.out.println("Não encontrou por ID " + ex.getMessage());
        }

        return outlays;
    }
    
    public boolean update(Outlay outlay) throws SQLException{
        String sql = "UPDATE outlays SET area_id = ?, payform_id = ?, description = ?, payment_day = ?, purchase_date = ? WHERE id = ?";
        try(PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, outlay.getArea().getId());
            stm.setInt(2, outlay.getPform().getId());
            stm.setString(3, outlay.getDescription());
            stm.setTimestamp(4, outlay.getPayment_day());
            stm.setTimestamp(5, outlay.getPurchase_date());
            stm.setInt(6, outlay.getId());
            stm.execute();
            
            con.commit();
            return true;
        } catch (Exception ex){
            System.out.println("Erro ao atualizar = " + ex.getMessage());
            
            con.rollback();
            return false;
        }
    }
    
    public boolean delete(Integer id) throws SQLException{
        String sql = "DELETE FROM outlays WHERE id = ?";
        try(PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, id);
            stm.execute();
            
            con.commit();
            return true;
        } catch (Exception ex){
            System.out.println("Deu ruim pra exclui " + ex.getMessage());
            con.rollback();
            
            return false;
        }        
    }
}
