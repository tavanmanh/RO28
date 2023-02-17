package tn.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;

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
    

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "director_department",
            joinColumns = { @JoinColumn(name = "department_id") },
            inverseJoinColumns = { @JoinColumn(name = "director_id") }
    )
    List<Director> directors ;
}
