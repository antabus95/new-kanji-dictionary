package com.example.newkanjidictionary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "radical_forms")
public class RadicalForm {
    @Id
    @GeneratedValue
    private Integer id;
    private String formName;
    private String spelling;
    private String altSpelling;
    @ManyToOne
    @JoinColumn(name = "radical_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    private Radical radical;

}
