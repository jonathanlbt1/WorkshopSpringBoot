package com.jonathanlbt.projetospringbootcombdrelacional.repositories;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
