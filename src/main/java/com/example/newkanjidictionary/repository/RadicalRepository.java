package com.example.newkanjidictionary.repository;

import com.example.newkanjidictionary.model.Radical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RadicalRepository extends JpaRepository<Radical, Integer> {
    @Query("SELECT r, rf.spelling, rf.altSpelling, rf.formName FROM Radical r JOIN RadicalForm rf ON rf.radical = r AND (rf.spelling = ?1 OR rf.altSpelling = ?1)")
    Radical findByRadicalForm(String spelling);

    @Query("SELECT r FROM Radical r WHERE r.strokeCount = ?1")
    List<Radical> findByStrokeCount(Integer strokeCount);

    @Query("SELECT r FROM Radical r JOIN RadicalForm rf ON rf.radical = r AND rf.spelling = ?1 OR rf.altSpelling = ?1")
    void deleteBySpelling(String spelling);


}
