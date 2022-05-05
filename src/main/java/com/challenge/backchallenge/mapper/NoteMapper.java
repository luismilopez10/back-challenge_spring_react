package com.challenge.backchallenge.mapper;

import com.challenge.backchallenge.dto.NoteDTO;
import com.challenge.backchallenge.entity.Note;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface NoteMapper {
    NoteDTO noteToNoteDTO(Note note);

    Note noteDTOToNote(NoteDTO noteDTO);

    List<NoteDTO> noteListToNoteDTOList(List<Note> Note);

    List<Note> noteDTOListToNoteList(List<NoteDTO> NoteDTOs);
}
