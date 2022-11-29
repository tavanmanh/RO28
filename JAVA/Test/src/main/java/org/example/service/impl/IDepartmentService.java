package org.example.service.impl;

import org.example.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentService {

    List<Department> getListDepartment() throws SQLException;

    void creteDepartment(Department request) throws SQLException;

    void updateDepartment(Department request) throws SQLException;

    void deleteDepartment(Department request) throws SQLException;
}
