package net.javaguides.springboot.repository;

import net.javaguides.springboot.entitiy.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
