package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.SupplierOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierLineOrderLineRepository extends JpaRepository<SupplierOrderLine, Long> {
}
