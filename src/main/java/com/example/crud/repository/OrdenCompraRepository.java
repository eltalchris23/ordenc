package com.example.crud.repository;

import com.example.crud.entity.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenCompraRepository extends JpaRepository<Orden, Long> {
}
