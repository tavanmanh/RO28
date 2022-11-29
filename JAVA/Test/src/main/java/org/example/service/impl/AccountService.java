package org.example.service.impl;

import org.example.entity.Account;
import org.example.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    List<Account> getListAccount() throws SQLException;

    void creteAccount(Account request) throws SQLException;

    void updateAccount(Account request) throws SQLException;

    void deleteAccount(Account request) throws SQLException;
}
