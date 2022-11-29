package org.example.service.impl;

import org.example.entity.Account;
import org.example.repository.AccountRepsitory;
import org.example.util.Utils;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService{
    private final AccountRepsitory accountRepsitory;

    public AccountServiceImpl(AccountRepsitory accountRepsitory) {
        this.accountRepsitory = accountRepsitory;
    }

    @Override
    public List<Account> getListAccount() throws SQLException {
        return accountRepsitory.getListAccount();
    }

    @Override
    public void creteAccount(Account request) throws SQLException {
        int result = accountRepsitory.creteAccount(request);
        if (result > 0) {
            System.out.println("Thêm mới dữ liệu thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    @Override
    public void updateAccount(Account request) throws SQLException {
        boolean resultValidate = Utils.validateAccount("update", request);
        if (resultValidate) {
            int result = accountRepsitory.updateAccount(request);
            if (result > 0) {
                System.out.println("Chỉnh sửa dữ liệu thành công");
            } else {
                throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
            }
        } else {
            throw new RuntimeException("Dữ liệu nhập vào không đúng vui lòng kiểm tra lại");
        }
    }

    @Override
    public void deleteAccount(Account request) throws SQLException {
        boolean resultValidate = Utils.validateAccount("delete", request);
        if (resultValidate) {
            int result = accountRepsitory.deleteAccount(request);
            if (result > 0) {
                System.out.println("Xoá dữ liệu thành công");
            } else {
                throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
            }
        } else {
            throw new RuntimeException("Dữ liệu nhập vào không đúng vui lòng kiểm tra lại");
        }
    }
}
