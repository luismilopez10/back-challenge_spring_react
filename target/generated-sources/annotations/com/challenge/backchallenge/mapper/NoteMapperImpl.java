package com.challenge.backchallenge.mapper;

import com.challenge.backchallenge.dto.NoteDTO;
import com.challenge.backchallenge.entity.Note;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class NoteMapperImpl implements NoteMapper {

    @Override
    public NoteDTO noteToNoteDTO(Note note) {
        if ( note == null ) {
            return null;
        }

        NoteDTO noteDTO = new NoteDTO();

        noteDTO.setId( note.getId() );
        noteDTO.setMessage( note.getMessage() );
        noteDTO.setDone( note.getDone() );
        noteDTO.setFkCategoryId( note.getFkCategoryId() );

        return noteDTO;
    }

    @Override
    public Note noteDTOToNote(NoteDTO noteDTO) {
        if ( noteDTO == null ) {
            return null;
        }

        Note note = new Note();

        note.setId( noteDTO.getId() );
        note.setMessage( noteDTO.getMessage() );
        note.setDone( noteDTO.getDone() );
        note.setFkCategoryId( noteDTO.getFkCategoryId() );

        return note;
    }

    @Override
    public List<NoteDTO> noteListToNoteDTOList(List<Note> Note) {
        if ( Note == null ) {
            return null;
        }

        List<NoteDTO> list = new ArrayList<NoteDTO>( Note.size() );
        for ( Note note : Note ) {
            list.add( noteToNoteDTO( note ) );
        }

        return list;
    }

    @Override
    public List<Note> noteDTOListToNoteList(List<NoteDTO> NoteDTOs) {
        if ( NoteDTOs == null ) {
            return null;
        }

        List<Note> list = new ArrayList<Note>( NoteDTOs.size() );
        for ( NoteDTO noteDTO : NoteDTOs ) {
            list.add( noteDTOToNote( noteDTO ) );
        }

        return list;
    }
}
