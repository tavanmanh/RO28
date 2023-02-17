package com.example.demo_05.models;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>, ProjectRepositoryCustom {
    Project getByIdAndStatus(Long id, Long status);
    Project findByIdAndStatus(Long id, Long status);
    void deleteByIdAndStatus(Long id, Long status);
}
