package com.jonathanlbt.projetospringbootcombdrelacional.repositories;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
