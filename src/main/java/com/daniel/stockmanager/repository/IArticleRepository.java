package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleRepository extends JpaRepository<Article, Long> {
}
