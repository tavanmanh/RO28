package org.example.Controllers;

import org.example.entity.Department;
import org.example.entity.Potision;
import org.example.service.impl.IDepartmentService;
import org.example.service.impl.PotisionService;

import java.util.ArrayList;
import java.util.List;

public class PotisionController {
    private final PotisionService potisionService;

    public PotisionController(PotisionService potisionService) {
        this.potisionService = potisionService;
    }

    public List<Potision> getListPotision() {
        List<Potision> potisions = new ArrayList<>();
        try {
            potisions = potisionService.getListPotision();
        } catch (Exception e) {
            System.out.println("Lấy danh sách không thành công " + e.getMessage());
        }
        return potisions;
    }

    public void cretePotision(Potision request) {
        try {
            potisionService.cretePotision(request);
        } catch (Exception e) {
            System.out.println("Tạo mới phòng ban không thành công! " + e.getMessage());
        }
    }

    public void updatePotision(Potision request) {
        try {
            potisionService.updatePotision(request);
        } catch (Exception e) {
            System.out.println("Chỉnh sửa phòng không thành công! " + e.getMessage());
        }
    }

    public void deletePotision(Potision request) {
        try {
            potisionService.deletePotision(request);
        } catch (Exception e) {
            System.out.println("Xoá không thành công! " + e.getMessage());
        }
    }

}
