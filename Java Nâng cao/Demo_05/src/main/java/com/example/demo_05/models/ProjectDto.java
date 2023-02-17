package com.example.demo_05.models;

import com.reupneverdie.dto.PaginationDto;
import com.reupneverdie.model.Project;
import lombok.Data;

import java.util.Date;

@Data
public class ProjectDto extends PaginationDto {
    private Long id;
    private String projectName;
    private String custommerName;
    private String leaderUser;
    private String createdUser;
    private String updatedUser;
    private String state;
    private Date createDate;
    private Date updateDate;
    private Long status;
    public Project toModel() {
        Project bo = new Project();

        bo.setId(this.id);
        bo.setProjectName(this.projectName);
        bo.setCustommerName(this.custommerName);
        bo.setCreatedUser(this.createdUser);
        bo.setCreateDate(this.createDate);
        bo.setUpdateDate(this.updateDate);
        bo.setLeaderUser(this.leaderUser);
        bo.setUpdatedUser(this.updatedUser);
        bo.setState(this.state);
        bo.setStatus(this.status);
        return bo;
    }
}
