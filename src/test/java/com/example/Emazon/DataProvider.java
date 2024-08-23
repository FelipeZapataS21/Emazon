package com.example.Emazon;

import com.example.Emazon.domain.model.Category;

import java.util.List;

public class DataProvider {

    public static List<Category> categoryListMock(){

        System.out.println(" -> Obteniendo listado Category / Mock");

        return List.of(
                new Category(1L,"Gamer Laptops","Computers Laptops Gamers for all"),
                new Category(2L,"Electronics","Computers and something more")
        );
    }
}
