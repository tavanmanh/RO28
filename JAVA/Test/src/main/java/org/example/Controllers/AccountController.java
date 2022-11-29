package org.example.Controllers;

import org.example.entity.Account;
import org.example.entity.Department;
import org.example.service.impl.AccountService;
import org.example.service.impl.IDepartmentService;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getListAccount() {
        List<Account> accounts = new ArrayList<>();
        try {
            accounts = accountService.getListAccount();
        } catch (Exception e) {
            System.out.println("Lấy danh sách account không thành công " + e.getMessage());
        }
        return accounts;
    }

    public void creteAccount(Account request) {
        try {
            accountService.creteAccount(request);
        } catch (Exception e) {
            System.out.println("Tạo mới account ban không thành công! " + e.getMessage());
        }
    }

    public void updateAccount(Account request) {
        try {
            accountService.updateAccount(request);
        } catch (Exception e) {
            System.out.println("Chỉnh sửa phòng không thành công! " + e.getMessage());
        }
    }

    public void deleteAccount(Account request) {
        try {
            accountService.deleteAccount(request);
        } catch (Exception e) {
            System.out.println("Xoá acc thành công! " + e.getMessage());
        }
    }

}
