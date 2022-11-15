package com.jonathanlbt.projetospringbootcombdrelacional.config;

import com.jonathanlbt.projetospringbootcombdrelacional.repositories.UserRepository;
import com.jonathanlbt.projetospringbootcombdrelacional.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userBank;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userBank.saveAll(Arrays.asList(u1,u2));
    }


}
