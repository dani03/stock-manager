package com.daniel.stockmanager.controller;

import com.daniel.stockmanager.repository.ICategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @Autowired
    ICategoryRepository categoryRepository;
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping("/categories")
    public String ListCategories(Model model){
    model.addAttribute("categories", categoryRepository.findAll());
        return "categories/categories";
    }
}
