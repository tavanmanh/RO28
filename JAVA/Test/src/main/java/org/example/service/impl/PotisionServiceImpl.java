package org.example.service.impl;

import org.example.entity.Potision;
import org.example.repository.PotisionRepository;
import org.example.util.Utils;

import java.sql.SQLException;
import java.util.List;

public class PotisionServiceImpl implements PotisionService{
    private final PotisionRepository potisionRepository;

    public PotisionServiceImpl(PotisionRepository potisionRepository) {
        this.potisionRepository = potisionRepository;
    }


    @Override
    public List<Potision> getListPotision() throws SQLException {
        return potisionRepository.getListPotision();
    }

    @Override
    public void cretePotision(Potision request) throws SQLException {
        int result = potisionRepository.cretePotision(request);
        if (result > 0) {
            System.out.println("Thêm mới dữ liệu thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    @Override
    public void updatePotision(Potision request) throws SQLException {
        boolean resultValidate = Utils.validatePosition("update", request);
        if (resultValidate) {
            int result = potisionRepository.updatePotision(request);
            if (result > 0) {
                System.out.println("Chỉnh sửa dữ liệu thành công");
            } else {
                throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
            }
        } else {
            throw new RuntimeException("Dữ liệu nhập vào không đúng vui lòng kiểm tra lại");
        }

    }

    @Override
    public void deletePotision(Potision request) throws SQLException {
        int result = potisionRepository.deletePotision(request);
        if (result > 0) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }
}
