package com.example.newkanjidictionary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "readings")
public class Reading {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String text;

    //音読み、訓読み、名乗り
    @Enumerated(EnumType.STRING)
    private TypeOfReading type;

    //呉音、漢音、唐音、慣用音， only for 音読み
    @Enumerated(EnumType.STRING)
    private CategoryOfChineseReading chineseCategory;

    //常用、常用外
    @Enumerated(EnumType.STRING)
    private LevelOfReading level;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kanji_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    private Kanji kanji;
}
