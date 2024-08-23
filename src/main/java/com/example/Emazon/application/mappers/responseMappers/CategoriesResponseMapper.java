package com.example.Emazon.application.mappers.responseMappers;

import com.example.Emazon.application.dto.response.CategoriesResponse;
import com.example.Emazon.domain.model.Category;

import java.util.List;

public interface CategoriesResponseMapper {

    CategoriesResponse toResponse(Category category);

    default List<CategoriesResponse> toResponseList(List<Category> categoriesList){
        return categoriesList.stream()
                .map(category -> {
                    CategoriesResponse categoriesResponse = new CategoriesResponse();
                    categoriesResponse.setName(category.getName());
                    categoriesResponse.setDescription(category.getDescription());
                    return categoriesResponse;
                }).toList();
    }
}
