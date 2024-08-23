package com.example.Emazon.domain.usecase;

import com.example.Emazon.DataProvider;
import com.example.Emazon.domain.model.Category;
import com.example.Emazon.domain.spi.ICategoryPersistencePort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CategoryUseCaseTest {
    //Given
    ICategoryPersistencePort categoryPersistencePort = mock(ICategoryPersistencePort.class);
    CategoryUseCase categoryUseCase = new CategoryUseCase(categoryPersistencePort);

    @Test
    public void testGetAllCategories(){
        //When
        when(categoryPersistencePort.getAllCategories()).thenReturn(DataProvider.categoryListMock());
        List<Category> categoryList = categoryUseCase.getAllCategories();

        //Then
        assertNotNull(categoryList);
        assertFalse(categoryList.isEmpty());
        assertEquals("Gamer Laptops", categoryList.get(0).getName());
        assertEquals("Computers Laptops Gamers for all", categoryList.get(0).getDescription());
    }

    @Test
    public void testGetCategory(){
        //When
        when(categoryPersistencePort.getAllCategories()).thenReturn(DataProvider.categoryListMock());
        List<Category> categoryList = categoryUseCase.getAllCategories();

        //Then
        assertNotNull(categoryList);
        assertFalse(categoryList.isEmpty());
        assertEquals("Gamer Laptops", categoryList.get(0).getName());
        assertEquals("Computers Laptops Gamers for all", categoryList.get(0).getDescription());
    }
}
