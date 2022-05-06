package com.challenge.backchallenge.controller;

import com.challenge.backchallenge.dto.CategoryDTO;
import com.challenge.backchallenge.dto.NoteDTO;
import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.entity.Note;
import com.challenge.backchallenge.mapper.CategoryMapper;
import com.challenge.backchallenge.mapper.NoteMapper;
import com.challenge.backchallenge.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@CrossOrigin("*")
public class NoteController {

    @Autowired
    NoteService noteService;

    @Autowired
    NoteMapper noteMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @GetMapping
    public List<NoteDTO> findAll() throws Exception{
        List<Note> note = noteService.findAll();
        List<NoteDTO> noteDTOs = noteMapper.noteListToNoteDTOList(note);
        return noteDTOs;
    }

    @PostMapping
    public CategoryDTO saveToCategory(@RequestBody NoteDTO noteDTO) throws Exception{
        Note note = noteMapper.noteDTOToNote(noteDTO);
        Category category = noteService.saveToCategory(note);
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        return categoryDTO;
    }

    @PutMapping
    public CategoryDTO updateToCategory(@RequestBody NoteDTO noteDTO)throws Exception{
        Note note = noteMapper.noteDTOToNote(noteDTO);
        Category category = noteService.updateToCategory(note);
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        return categoryDTO;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        noteService.deleteById(id);
    }
}
