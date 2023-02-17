package com.example.demo_05.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="uhr_project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "custommer_name")
    private String custommerName;

    @Column(name = "leader_user" )
    private String leaderUser;

    @Column(name = "created_user" )
    private String createdUser;

    @Column(name = "updated_user" )
    private String updatedUser;

    @Column(name = "create_date" )
    private Date createDate;

    @Column(name = "update_date" )
    private Date updateDate;

    @Column(name = "status" )
    private Long status;

    @Column(name = "state" )
    private String state;

    public ProjectDto toDto() {
        ProjectDto dto = new ProjectDto();
        dto.setId(this.id);
        dto.setProjectName(this.projectName);
        dto.setCustommerName(this.custommerName);
        dto.setCreatedUser(this.createdUser);
        dto.setCreateDate(this.createDate);
        dto.setUpdateDate(this.updateDate);
        dto.setLeaderUser(this.leaderUser);
        dto.setUpdatedUser(this.updatedUser);
        dto.setState(this.state);
        dto.setStatus(this.status);
        return dto;
    }
}
