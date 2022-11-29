package org.example.service.impl;

import org.example.entity.Potision;

import java.sql.SQLException;
import java.util.List;

public interface PotisionService {
    List<Potision> getListPotision() throws SQLException;

    void cretePotision(Potision request) throws SQLException;

    void updatePotision(Potision request) throws SQLException;

    void deletePotision(Potision request) throws SQLException;
}
