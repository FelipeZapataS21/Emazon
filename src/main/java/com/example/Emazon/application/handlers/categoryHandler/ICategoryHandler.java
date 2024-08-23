package com.example.Emazon.application.handlers.categoryHandler;

import com.example.Emazon.application.dto.request.CategoriesRequest;
import com.example.Emazon.application.dto.response.CategoriesResponse;

import java.util.List;

public interface ICategoryHandler {

    void saveCategoryInCategories(CategoriesRequest categoriesRequest);

    List<CategoriesResponse> getAllCategoriesFromCategories();

    CategoriesResponse getCategoryFromCategories(String name);

    void updateCategoryFromCategories(CategoriesRequest categoriesRequest);

    void deleteCategoryFromCategories(String name);
}
