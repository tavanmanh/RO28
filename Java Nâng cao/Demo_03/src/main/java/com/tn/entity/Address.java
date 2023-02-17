//package com.tn.entity;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="address")
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Builder
//public class Address {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id" )
//    private Integer id;
//
//    @Column(name = "street")
//    private String street;
//
//    @ManyToOne
//    @JoinColumn(name = "student_id")
//    private Student student;
//}
