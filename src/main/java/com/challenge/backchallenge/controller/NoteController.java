package com.challenge.backchallenge.controller;

import com.challenge.backchallenge.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notes")
@CrossOrigin("*")
public class NoteController {

    @Autowired
    private NoteService noteService;
}
