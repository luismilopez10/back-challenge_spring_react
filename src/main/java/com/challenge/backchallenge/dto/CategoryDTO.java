package com.challenge.backchallenge.dto;

import com.challenge.backchallenge.entity.Note;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {

//    private Long id;

    private String name;

    private List<Note> notes;
}
