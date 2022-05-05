package com.challenge.backchallenge.service;

import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category entity) throws Exception {
        if (entity == null) {
            throw new Exception("The category is null");
        }

        return categoryRepository.save(entity);
    }

    @Override
    public Category update(Category entity) throws Exception {
        if(entity==null) {
            throw new Exception("The category is null");
        }

        if(!categoryRepository.existsById(entity.id)) {
            throw new Exception("The category doesn't exist");
        }

        return categoryRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        if(id==null)
            throw new Exception("The id is null");

        if(!categoryRepository.existsById(id)) {
            throw new Exception("The category doesn't exist");
        }

        categoryRepository.deleteById(id);
    }
}
