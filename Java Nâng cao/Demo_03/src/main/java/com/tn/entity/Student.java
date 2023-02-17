//package com.tn.entity;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name="student")
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Builder
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id" )
//    private Integer id;
//
//    @Column(name = "student_name")
//    private String studentName;
//
//    @Column(name = "student_age")
//    private Integer studentAge;
//
//    @OneToMany(mappedBy = "student")
//    private List<Address> addresses;
//
//}
