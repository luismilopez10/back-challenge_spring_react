package com.challenge.backchallenge.dto;

import lombok.Data;

@Data
public class NoteDTO {

    public Long id;

    private String message;

    private Boolean done;

    private Long fkCategoryId;
}
