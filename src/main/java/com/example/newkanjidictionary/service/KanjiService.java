package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Kanji;
import jakarta.persistence.OrderBy;
import jakarta.transaction.Transactional;

import java.util.List;

public interface KanjiService {
    List<Kanji> getAllKanji();
    List<Kanji> getAllKanjiOfJlptLvl(Integer jlptLvl);
    List<Kanji> getAllKanjiOfKankenLvl(Float kankenLvl);
    List<Kanji> getAllKanjiOfSchoolGrade(Integer schoolGrade);
    List<Kanji> getAllJoyoKanji();
    List<Kanji> getAllJinmeiyoKanji();
    List<Kanji> getAllKanjiByReading(String reading);
    List<Kanji> getAllKanjiByStrokeCount(Integer strokeCount);
    Kanji saveKanji(Kanji kanji);
    Kanji updateKanji(Kanji kanji);
    Kanji getKanjiBySpelling(String spelling);
    List<Kanji> getKanjiByBaseMeaning(String baseMeaning);
    void deleteKanji(String spelling);
}
