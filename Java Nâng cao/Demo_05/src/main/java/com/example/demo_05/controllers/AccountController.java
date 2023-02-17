package com.example.demo_05.controllers;

import com.example.demo_05.models.Account;
import com.example.demo_05.repo.AccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountRepo accountRepo;

    @GetMapping("/hello")
    public String hello(){
        return "hello 1323";
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        if (account.getAccountName() == null  || account.getAccountName().isEmpty()) {
            System.out.println("false");
            return null;
        }

        return accountRepo.save(account);
    }

    @PutMapping("/{id}")
    public Account update(@PathVariable Long id, @RequestBody Account account) {
        Account fromDB = accountRepo.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setAccountName(account.getAccountName());
        return accountRepo.save(fromDB);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        accountRepo.deleteById(id);
    }

    @GetMapping
    public Iterable<Account> findAll() {
        return accountRepo.findAll();
    }

    @GetMapping("/{id}")
    public Account findByID(@PathVariable Long id) {
        return accountRepo.findById(id).orElse(null);
    }
}
