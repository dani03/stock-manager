package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockMovementRepository extends JpaRepository<StockMovement, Long> {
}
