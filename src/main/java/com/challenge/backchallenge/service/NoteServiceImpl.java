package com.challenge.backchallenge.service;

import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.entity.Note;
import com.challenge.backchallenge.repository.CategoryRepository;
import com.challenge.backchallenge.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note save(Note note) throws Exception {
        if (note == null) {
            throw new Exception("The note is null");
        }
        Category category = categoryRepository.findById(note.getFkCategoryId()).get();
        category.addNote(note);
        categoryRepository.save(category);
        return noteRepository.save(note);
    }

    @Override
    public Category saveToCategory(Note note) throws Exception {
        if (note == null) {
            throw new Exception("The note is null");
        }
        Category category = categoryRepository.findById(note.getFkCategoryId()).get();
        category.addNote(note);
        return categoryRepository.save(category);
    }

    @Override
    public Note update(Note note) throws Exception {
        if(note==null) {
            throw new Exception("The note is null");
        }

        if(!noteRepository.existsById(note.id)) {
            throw new Exception("The note doesn't exist");
        }

        Category category = categoryRepository.findById(note.getFkCategoryId()).get();
        category.addNote(note);
        categoryRepository.save(category);
        return noteRepository.save(note);
    }

    @Override
    public Category updateToCategory(Note note) throws Exception {
        if(note==null) {
            throw new Exception("The note is null");
        }

        if(!noteRepository.existsById(note.id)) {
            throw new Exception("The note doesn't exist");
        }

        Category category = categoryRepository.findById(note.getFkCategoryId()).get();
        noteRepository.save(note);
        return category;
    }

    @Override
    public void deleteById(Long id) throws Exception {
        if(id==null)
            throw new Exception("The id is null");

        if(!noteRepository.existsById(id)) {
            throw new Exception("The note doesn't exist");
        }

        noteRepository.deleteById(id);
    }
}
