package com.daniel.stockmanager.repository;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
