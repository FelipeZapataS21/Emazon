package com.example.Emazon.domain.api;

import com.example.Emazon.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {

    void saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategory(String name);

    void updateCategory(Category category);

    void deleteCategory(String name);
}
