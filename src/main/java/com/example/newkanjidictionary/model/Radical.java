package com.example.newkanjidictionary.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "radicals")
public class Radical {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String mainForm;
    private String leftForm;
    private String rightForm;
    private String upForm;
    private String downForm;
    private String alternateForm;
}
