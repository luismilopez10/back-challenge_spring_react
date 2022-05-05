package com.challenge.backchallenge.controller;

import com.challenge.backchallenge.dto.CategoryDTO;
import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.mapper.CategoryMapper;
import com.challenge.backchallenge.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    CategoryMapper categoryMapper;

    @GetMapping
    public List<CategoryDTO> findAll() throws Exception{
        List<Category> category = categoryService.findAll();
        List<CategoryDTO> categoryDTOs = categoryMapper.categoryListToCategoryDTOList(category);
        return categoryDTOs;
    }

    @PostMapping
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO) throws Exception{
        Category category = categoryMapper.categoryDTOToCategory(categoryDTO);
        category = categoryService.save(category);
        categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        return categoryDTO;
    }

    @PutMapping
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO)throws Exception{
        Category category = categoryMapper.categoryDTOToCategory(categoryDTO);
        category = categoryService.save(category);
        categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        return categoryDTO;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        categoryService.deleteById(id);
    }

}
