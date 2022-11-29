package org.example.Controllers;

import org.example.entity.Department;
import org.example.service.impl.IDepartmentService;

import java.util.ArrayList;
import java.util.List;

public class DepartmentController {
    private final IDepartmentService departmentService;

    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<Department> getListDepartment() {
        List<Department> departments = new ArrayList<>();
        try {
            departments = departmentService.getListDepartment();
        } catch (Exception e) {
            System.out.println("Lấy danh sách không thành công " + e.getMessage());
        }
        return departments;
    }

    public void creteDepartment(Department request) {
        try {
            departmentService.creteDepartment(request);
        } catch (Exception e) {
            System.out.println("Tạo mới phòng ban không thành công! " + e.getMessage());
        }
    }

    public void updateDepartment(Department request) {
        try {
            departmentService.updateDepartment(request);
        } catch (Exception e) {
            System.out.println("Chỉnh sửa phòng không thành công! " + e.getMessage());
        }
    }

    public void deleteDepartment(Department request) {
        try {
            departmentService.deleteDepartment(request);
        } catch (Exception e) {
            System.out.println("Xoá phòng không thành công! " + e.getMessage());
        }
    }

}
