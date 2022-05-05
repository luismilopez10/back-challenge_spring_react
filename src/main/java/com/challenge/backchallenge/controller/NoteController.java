package com.challenge.backchallenge.controller;

import com.challenge.backchallenge.dto.NoteDTO;
import com.challenge.backchallenge.entity.Note;
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
    private NoteService noteService;

    @Autowired
    NoteMapper noteMapper;

    @GetMapping
    public List<NoteDTO> findAll() throws Exception{
        List<Note> note = noteService.findAll();
        List<NoteDTO> noteDTOs = noteMapper.noteListToNoteDTOList(note);
        return noteDTOs;
    }

    @PostMapping
    public NoteDTO save(@RequestBody NoteDTO noteDTO) throws Exception{
        Note note = noteMapper.noteDTOToNote(noteDTO);
        note = noteService.save(note);
        noteDTO = noteMapper.noteToNoteDTO(note);

        return noteDTO;
    }

    @PutMapping
    public NoteDTO update(@RequestBody NoteDTO noteDTO)throws Exception{
        Note note = noteMapper.noteDTOToNote(noteDTO);
        note = noteService.save(note);
        noteDTO = noteMapper.noteToNoteDTO(note);

        return noteDTO;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        noteService.deleteById(id);
    }
}
