package com.management.restcontrollers;

import com.management.entities.Category;
import com.management.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CategoryRestController {
    @Autowired
    CategoryRepository categoryRepository;
    @GetMapping("/categories")
    public List<Category> getALlCategories(){
        return categoryRepository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Category getCategorybyId(@PathVariable("id") Long id){
        return categoryRepository.findById(id).get();
    }
}
