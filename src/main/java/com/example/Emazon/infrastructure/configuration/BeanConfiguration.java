package com.example.Emazon.infrastructure.configuration;

import com.example.Emazon.domain.api.ICategoryServicePort;
import com.example.Emazon.domain.spi.ICategoryPersistencePort;
import com.example.Emazon.domain.usecase.CategoryUseCase;
import com.example.Emazon.infrastructure.out.jpa.adapter.CategoryJpaAdapter;
import com.example.Emazon.infrastructure.out.jpa.mapper.CategoryEntityMapper;
import com.example.Emazon.infrastructure.out.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;


    @Bean
    public ICategoryPersistencePort categoryPersistencePort(){
        return new CategoryJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public ICategoryServicePort categoryServicePort(){
        return new CategoryUseCase(categoryPersistencePort());
    }
}
