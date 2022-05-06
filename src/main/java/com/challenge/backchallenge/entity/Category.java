package com.challenge.backchallenge.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Note> notes = new ArrayList<>();

    public Category addNote(Note note){
        this.notes.add(note);
        return this;
    }
}
