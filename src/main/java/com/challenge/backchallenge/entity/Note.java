package com.challenge.backchallenge.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Note")
@Table(name = "note")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    private String message;

    private Boolean done;

    private Long fkCategoryId;
}
