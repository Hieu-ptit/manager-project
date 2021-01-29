package com.example.demo.services.mappers;

import com.example.demo.models.entities.CategoryEntity;
import com.example.demo.models.ins.CategoryRequest;
import com.example.demo.models.outs.CategoryDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMapper {

    public List<CategoryDto> mapToListCategoryDto(List<CategoryEntity> categoryEntities){
        return  categoryEntities.stream().map(this::mapToCategoryDto).collect(Collectors.toList());
    }

    public CategoryDto mapToCategoryDto(CategoryEntity categoryEntity){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(categoryEntity.getName());
        categoryDto.setDescription(categoryEntity.getDescription());
        return categoryDto;
    }

    public CategoryEntity mapToCategoryEntity(CategoryRequest categoryRequest){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoryRequest.getName());
        categoryEntity.setDescription(categoryRequest.getDescription());
        return categoryEntity;
    }

    public CategoryEntity mapToCategoryEntity(CategoryRequest categoryRequest,int id){
        CategoryEntity categoryEntity =new CategoryEntity();
        categoryEntity.setId(id);
        categoryEntity.setName(categoryRequest.getName());
        categoryEntity.setDescription(categoryRequest.getDescription());
        return categoryEntity;
    }
}
