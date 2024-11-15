package com.example.newkanjidictionary.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="kanjies")
public class Kanji {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique=true, nullable=false)
    private String spelling;
    private String baseMeaning;
    private String meanings;
    private String etymology;
    private Integer strokeCount;
    private Integer jlptLvl;
    private Float kankenLvl;
    private Integer schoolGrade;
    private String jisCode;
    private String unicode;
    //常用、人名用
    @Enumerated(EnumType.STRING)
    private CategoryOfKanji category;

    /*
    @ManyToMany
    @JoinTable(
            name="traditional_forms_of_kanji",
            joinColumns = { @JoinColumn(name = "traditional_kanji_id") },
            inverseJoinColumns = { @JoinColumn(name = "simplified_kanji_id") }
    )
    private Set<Kanji> traditionalFormOfKanji = new HashSet<Kanji>();

    @ManyToMany
    @JoinTable(
            name="traditional_forms_of_kanji",
            joinColumns = { @JoinColumn(name = "simplified_kanji_id") },
            inverseJoinColumns = { @JoinColumn(name = "traditional_kanji_id") }
    )
    private Set<Kanji> simplifiedFormOfKanji = new HashSet<Kanji>();
    */




}
