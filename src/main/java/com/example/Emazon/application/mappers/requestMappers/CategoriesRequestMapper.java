package com.example.Emazon.application.mappers.requestMappers;


import com.example.Emazon.application.dto.request.CategoriesRequest;
import com.example.Emazon.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface CategoriesRequestMapper {

    @Mapping(target = "categoryId", ignore = true)
    Category toCategory(CategoriesRequest categoriesRequest);
}
