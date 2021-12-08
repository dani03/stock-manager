package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository  extends JpaRepository<Customer, Long> {
}
