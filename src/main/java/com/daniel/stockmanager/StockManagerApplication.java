package com.daniel.stockmanager;

import com.daniel.stockmanager.entity.Article;
import com.daniel.stockmanager.entity.Category;
import com.daniel.stockmanager.repository.IArticleRepository;
import com.daniel.stockmanager.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StockManagerApplication implements CommandLineRunner {

	@Autowired
	private IArticleRepository articleRepository;
	@Autowired
	private ICategoryRepository categoryRepository;
	public static void main(String[] args) {

		SpringApplication.run(StockManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category("cat_shoes", "Chaussures");
		Category category2 = new Category("cat_pants", "pants");

		categoryRepository.save(category);
		categoryRepository.save(category2);

		Article article = new Article("Jordan_5", "Jordan 5", "ma paire de Jordan ",
				new BigDecimal("99.00"), new BigDecimal("20.00"));

		Article article2 = new Article("nike", "vapor nike 5", "ma paire de nike ",
				new BigDecimal("200.00"), new BigDecimal("20.00"));

		Article article3 = new Article("puma", "puma 5", "ma paire de puma ",
				new BigDecimal("100.00"), new BigDecimal("15.00"));

		article.setCategory(category);
		article2.setCategory(category2);
		article3.setCategory(category);

		articleRepository.save(article);
		articleRepository.save(article2);
		articleRepository.save(article3);

		articleRepository.findAll();





	}
}
