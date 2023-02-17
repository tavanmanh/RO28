package tn.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="subject")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;

    @Column(name = "subject_name")
    private String subjectName;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "subject_student",
            joinColumns = { @JoinColumn(name = "subject_id") },
            inverseJoinColumns = { @JoinColumn(name = "student_id") }
    )
    List<Student> students ;
}
