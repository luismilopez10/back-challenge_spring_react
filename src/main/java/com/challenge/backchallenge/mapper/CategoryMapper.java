package com.challenge.backchallenge.mapper;

import com.challenge.backchallenge.dto.CategoryDTO;
import com.challenge.backchallenge.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryDTO categoryToCategoryDTO(Category category);

    Category categoryDTOToCategory(CategoryDTO categoryDTO);

    List<CategoryDTO> categoryListToCategoryDTOList(List<Category> category);

    List<Category> categoryDTOListToCategoryList(List<CategoryDTO> categoryDTOs);
}
