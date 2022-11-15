package com.jonathanlbt.projetospringbootcombdrelacional.repositories;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
