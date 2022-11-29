package org.example.repository;

import org.example.entity.Account;
import org.example.entity.Department;
import org.example.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepsitory {
    private final Connection con = DatabaseUtil.getInstance().getDatabaseConnection();

    public List<Account> getListAccount() throws SQLException {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM `account` ORDER BY `AccountID`";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        con.commit();
        while (rs.next()) {
            Account account = new Account();
            account.setId(rs.getInt(1));
            account.setFullName(rs.getString(3));
            account.setEmail(rs.getString(2));
            account.setUserName(rs.getString(4));
            account.setFullName(rs.getString(5));
            account.setDepartmentID(rs.getInt(6));
            account.setPotisionID(rs.getInt(7));
            account.setCreateDate(rs.getDate(8));
            accounts.add(account);
        }
        return accounts;
    }

    public int creteAccount(Account request) throws SQLException {
        String sql = "INSERT INTO `account`(Email,Username,FullName,DepartmentID,PotisionID,CreateDate) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getEmail());
        ps.setString(2, request.getUserName());
        ps.setString(3, request.getFullName());
        ps.setInt(4, request.getDepartmentID());
        ps.setInt(5, request.getPotisionID());
        ps.setDate(6, (Date) request.getCreateDate());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int updateAccount(Account request) throws SQLException {
        String sql = "UPDATE `account` SET `FullName` = ? WHERE `DepartmentId` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getFullName());
        ps.setInt(2, request.getId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int deleteAccount(Account request) throws SQLException {
        String sql = "DELETE FROM `account` WHERE `AccountID` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, request.getId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }
}
