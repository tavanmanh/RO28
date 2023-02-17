package com.example.demo_05.repo;

import com.example.demo_05.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {
}
