package com.challenge.backchallenge.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
@Data
public class Note {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String message;

    private Boolean done;
}