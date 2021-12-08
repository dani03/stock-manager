package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.CustomerOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderLineRepository extends JpaRepository<CustomerOrderLine, Long> {
}
