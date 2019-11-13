package com.vesta.repository;

import com.vesta.repository.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    List<CompanyEntity> findAll();

    Optional<CompanyEntity> findByName(String name);

    boolean existsByName(String name);
}