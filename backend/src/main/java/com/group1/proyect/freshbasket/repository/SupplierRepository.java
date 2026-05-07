package com.group1.proyect.freshbasket.repository;

import com.group1.proyect.freshbasket.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // JpaRepository brinda las opciones save(), findById(), findAll(), existsById(), etc.

    List<Supplier> findByNameContainingIgnoreCase(String name);
}