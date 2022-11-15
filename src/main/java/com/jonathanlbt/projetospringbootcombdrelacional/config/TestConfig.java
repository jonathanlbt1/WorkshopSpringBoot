package com.jonathanlbt.projetospringbootcombdrelacional.config;

import com.jonathanlbt.projetospringbootcombdrelacional.entities.Order;
import com.jonathanlbt.projetospringbootcombdrelacional.entities.User;
import com.jonathanlbt.projetospringbootcombdrelacional.entities.enums.OrderStatus;
import com.jonathanlbt.projetospringbootcombdrelacional.repositories.OrderRepository;
import com.jonathanlbt.projetospringbootcombdrelacional.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userBank;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2022-12-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userBank.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }


}
