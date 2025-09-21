package DAO;

import config.Database;
import Model.Costumer;
import java.sql.*;
import java.util.*;

public class CostumerRepo implements CostumerDao {
    private Connection connection;
    final String insert = "INSERT INTO customer (nama, alamat, no_hp) VALUES (?, ?, ?);";
    final String select = "SELECT * FROM customer;";
    final String delete = "DELETE FROM customer WHERE id=?;";
    final String update = "UPDATE customer SET nama=?, alamat=?, no_hp=? WHERE id=?;";

    public CostumerRepo() {
        connection = Database.koneksi();
    }

    @Override
    public void save(Costumer costumer) {
        try (PreparedStatement st = connection.prepareStatement(insert)) {
            st.setString(1, costumer.getNama());
            st.setString(2, costumer.getAlamat());
            st.setString(3, costumer.getNoHp());
            st.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    @Override
    public List<Costumer> show() {
        List<Costumer> list = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Costumer c = new Costumer();
                c.setId(rs.getString("id"));
                c.setNama(rs.getString("nama"));
                c.setAlamat(rs.getString("alamat"));
                c.setNoHp(rs.getString("no_hp"));
                list.add(c);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    @Override
    public void update(Costumer costumer) {
        try (PreparedStatement st = connection.prepareStatement(update)) {
            st.setString(1, costumer.getNama());
            st.setString(2, costumer.getAlamat());
            st.setString(3, costumer.getNoHp());
            st.setString(4, costumer.getId());
            st.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    @Override
    public void delete(String id) {
        try (PreparedStatement st = connection.prepareStatement(delete)) {
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }


}