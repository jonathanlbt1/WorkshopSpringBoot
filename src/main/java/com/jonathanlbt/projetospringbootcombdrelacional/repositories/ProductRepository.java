package com.jonathanlbt.projetospringbootcombdrelacional.repositories;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
