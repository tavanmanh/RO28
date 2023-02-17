package com.tn.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="department")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;

    @Column(name = "department_name")
    private String DepartmenName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director director;
}
