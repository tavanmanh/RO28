package tn.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="director")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;

    @Column(name = "director_name")
    private String DirectorName;

    @ManyToMany(mappedBy = "directors")
    List<Department> departments ;
}
