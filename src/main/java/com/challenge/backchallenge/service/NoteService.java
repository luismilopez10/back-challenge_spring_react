package com.challenge.backchallenge.service;

import com.challenge.backchallenge.entity.Category;
import com.challenge.backchallenge.entity.Note;

public interface NoteService extends GenericService<Note, Long> {
    Category saveToCategory(Note note) throws Exception;
    Category updateToCategory(Note note) throws Exception;
}
