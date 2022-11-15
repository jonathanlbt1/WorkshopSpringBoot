package com.jonathanlbt.projetospringbootcombdrelacional.repositories;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
