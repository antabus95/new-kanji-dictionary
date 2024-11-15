package com.example.newkanjidictionary.repository;

import com.example.newkanjidictionary.model.Kanji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KanjiRepository extends JpaRepository<Kanji, Integer> {
    void deleteKanjiBySpelling(String spelling);

    Kanji findKanjiBySpelling(String spelling);

    @Query("SELECT k FROM Kanji k WHERE k.baseMeaning ILIKE ?1")
    List<Kanji> findKanjiByBaseMeaning(String baseMeaning);

    @Query("SELECT k FROM Kanji k WHERE k.jlptLvl = ?1")
    List<Kanji> findAllKanjiOfJlptLvl(Integer jlptLvl);

    @Query("SELECT k FROM Kanji k WHERE k.kankenLvl = ?1")
    List<Kanji> findAllKanjiOfKankenLvl(Float kankenLvl);

    @Query("SELECT k FROM Kanji k WHERE k.schoolGrade = ?1")
    List<Kanji> findAllKanjiOfSchoolGrade(Integer schoolGrade);

    @Query("SELECT k FROM Kanji k WHERE k.category = '常用'")
    List<Kanji> findAllJoyoKanji();

    @Query("SELECT k FROM Kanji k WHERE k.category = '人名用'")
    List<Kanji> findAllJinmeiyoKanji();
}
