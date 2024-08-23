package com.example.Emazon.domain.usecase;

import com.example.Emazon.domain.api.ICategoryServicePort;
import com.example.Emazon.domain.exceptions.AlreadyDeclaredValueException;
import com.example.Emazon.domain.exceptions.DescriptionRequiredException;
import com.example.Emazon.domain.exceptions.MaximumLengthException;
import com.example.Emazon.domain.model.Category;
import com.example.Emazon.domain.spi.ICategoryPersistencePort;

import java.util.List;

import static com.example.Emazon.domain.utils.DomainConstants.*;


public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category) {

        if(categoryPersistencePort.getCategory(category.getName()) != null){
            throw new AlreadyDeclaredValueException(FIELD_ALREDY_DECLARED_VALUE);
        }
        if(category.getName().length() > 50){throw new MaximumLengthException(FIELD_MAX_LENGTH);}

        if(category.getDescription().trim().isEmpty()){
            throw new DescriptionRequiredException(FIELD_VALUE_REQUIRED);
        }
        if(category.getDescription().length() > 90){throw new MaximumLengthException(FIELD_MAX_LENGTH);}

        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryPersistencePort.getAllCategories();
    }

    @Override
    public Category getCategory(String name) {
        return categoryPersistencePort.getCategory(name);
    }

    @Override
    public void updateCategory(Category category) {
        categoryPersistencePort.updateCategory(category);
    }

    @Override
    public void deleteCategory(String name) {

    }
}
