package com.example.newkanjidictionary.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "radicals")
public class Radical {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false)
    private String name;
    private Integer number;

    @OneToMany(mappedBy = "radical")
    @JsonManagedReference
    private List<Kanji> kanjies = new ArrayList<>();

    @OneToMany(mappedBy = "radical")
    @JsonManagedReference
    private List<RadicalForm> radicalForms = new ArrayList<>();

}
