package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Kanji;
import jakarta.persistence.OrderBy;
import jakarta.transaction.Transactional;

import java.util.List;

public interface KanjiService {
    List<Kanji> findAllKanji();
    List<Kanji> findAllKanjiOfJlptLvl(Integer jlptLvl);
    List<Kanji> findAllKanjiOfKankenLvl(Float kankenLvl);
    List<Kanji> findAllKanjiOfSchoolGrade(Integer schoolGrade);
    List<Kanji> findAllJoyoKanji();
    List<Kanji> findAllJinmeiyoKanji();
    Kanji saveKanji(Kanji kanji);
    Kanji updateKanji(Kanji kanji);
    Kanji findKanjiBySpelling(String spelling);
    List<Kanji> findKanjiByBaseMeaning(String baseMeaning);
    void deleteKanji(String spelling);
}
