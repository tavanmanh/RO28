package org.example.repository;

import org.example.entity.Department;
import org.example.entity.Potision;
import org.example.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PotisionRepository {
    private final Connection con = DatabaseUtil.getInstance().getDatabaseConnection();

    public List<Potision> getListPotision() throws SQLException {
        List<Potision> potisions = new ArrayList<>();
        String sql = "SELECT * FROM `Position` ORDER BY `PositionID`";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        con.commit();
        while (rs.next()) {
            Potision potision = new Potision();
            potision.setPotisionId(rs.getInt(1));
            potision.setPotisionName(rs.getString(2));
            potisions.add(potision);
        }
        return potisions;
    }

    public int cretePotision(Potision request) throws SQLException {
        String sql = "INSERT INTO `Position`(PositionName) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getPotisionName());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int updatePotision(Potision request) throws SQLException {
        String sql = "UPDATE `Position` SET `PositionName` = ? WHERE `PositionID` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getPotisionName());
        ps.setInt(2, request.getPotisionId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int deletePotision(Potision request) throws SQLException {
        String sql = "DELETE FROM `Position` WHERE `PositionID` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, request.getPotisionId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }
}
