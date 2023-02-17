package com.tn.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="account")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "accountType")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}
