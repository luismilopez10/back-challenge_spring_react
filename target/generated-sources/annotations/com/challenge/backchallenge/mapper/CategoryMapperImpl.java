package com.challenge.backchallenge.mapper;

import com.challenge.backchallenge.dto.CategoryDTO;
import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.entity.Note;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );
        List<Note> list = category.getNotes();
        if ( list != null ) {
            categoryDTO.setNotes( new ArrayList<Note>( list ) );
        }

        return categoryDTO;
    }

    @Override
    public Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDTO.getId() );
        category.setName( categoryDTO.getName() );
        List<Note> list = categoryDTO.getNotes();
        if ( list != null ) {
            category.setNotes( new ArrayList<Note>( list ) );
        }

        return category;
    }

    @Override
    public List<CategoryDTO> categoryListToCategoryDTOList(List<Category> category) {
        if ( category == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( category.size() );
        for ( Category category1 : category ) {
            list.add( categoryToCategoryDTO( category1 ) );
        }

        return list;
    }

    @Override
    public List<Category> categoryDTOListToCategoryList(List<CategoryDTO> categoryDTOs) {
        if ( categoryDTOs == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryDTOs.size() );
        for ( CategoryDTO categoryDTO : categoryDTOs ) {
            list.add( categoryDTOToCategory( categoryDTO ) );
        }

        return list;
    }
}
