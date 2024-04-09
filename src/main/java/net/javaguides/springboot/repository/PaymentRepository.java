package net.javaguides.springboot.repository;

import net.javaguides.springboot.entitiy.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
