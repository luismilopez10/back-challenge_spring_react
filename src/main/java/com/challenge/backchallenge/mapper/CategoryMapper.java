package com.challenge.backchallenge.mapper;

import com.challenge.backchallenge.dto.CategoryDTO;
import com.challenge.backchallenge.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public CategoryDTO categoryToCategoryDTO(Category category);

    public CategoryDTO categoryDTOToCategory(Category category);

    public List<CategoryDTO> categoryListToCategoryDTOList(List<Category> category);

    public List<Category> categoryDTOListToCategoryList(List<CategoryDTO> categoryDTOs);
}
