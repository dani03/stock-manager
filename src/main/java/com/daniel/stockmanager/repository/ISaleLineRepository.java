package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.SaleLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleLineRepository extends JpaRepository<SaleLine, Long> {
}
