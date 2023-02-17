package com.tn.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="person")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "personType")
    @Enumerated(EnumType.STRING)
    private PersonType personType;
}
