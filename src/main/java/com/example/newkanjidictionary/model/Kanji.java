package com.example.newkanjidictionary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    /*
    @ManyToMany(fetch = FetchType.LAZY,
    cascade =  {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "kanji_readings",
    joinColumns = {@JoinColumn(name = "reading_id")},
    inverseJoinColumns = {@JoinColumn(name = "kanji_id")})
    private Set<Reading> readings = new HashSet<>();
    */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "radical_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    @JsonBackReference
    private Radical radical;

    @OneToMany(mappedBy = "kanji", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Reading> readings = new ArrayList<>();


}
