package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.SupplierOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierOrderRepository extends JpaRepository<SupplierOrder, Long> {
}
