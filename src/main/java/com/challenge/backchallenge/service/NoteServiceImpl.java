package com.challenge.backchallenge.service;

import com.challenge.backchallenge.entity.Note;
import com.challenge.backchallenge.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    Validator validator;

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note save(Note entity) throws Exception {
        if (entity == null) {
            throw new Exception("The note is null");
        }

        return noteRepository.save(entity);
    }

    @Override
    public Note update(Note entity) throws Exception {
        if(entity==null) {
            throw new Exception("The note is null");
        }

        if(!noteRepository.existsById(entity.id)) {
            throw new Exception("The note doesn't exist");
        }

        return noteRepository.save(entity);
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
