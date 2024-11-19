package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Kanji;
import com.example.newkanjidictionary.repository.KanjiRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class KanjiServiceImpl implements KanjiService {

    private final KanjiRepository kanjiRepository;

    @Override
    public List<Kanji> getAllKanji() {
        return kanjiRepository.findAll();
    }

    @Override
    public Kanji saveKanji(Kanji kanji) {
        return kanjiRepository.save(kanji);
    }

    @Override
    public Kanji updateKanji(Kanji kanji) {
        return kanjiRepository.save(kanji);
    }

    @Override
    public Kanji getKanjiBySpelling(String spelling) {
        return kanjiRepository.findKanjiBySpelling(spelling);
    }

    @Override
    public List<Kanji> getKanjiByBaseMeaning(String baseMeaning) {
        return kanjiRepository.findKanjiByBaseMeaning(baseMeaning);
    }

    @Override
    public List<Kanji> getAllKanjiOfJlptLvl(Integer jlptLvl) {
        return kanjiRepository.findAllKanjiOfJlptLvl(jlptLvl);
    }
    @Override
    public List<Kanji> getAllKanjiOfKankenLvl(Float kankenLvl) {
        return kanjiRepository.findAllKanjiOfKankenLvl(kankenLvl);
    }
    @Override
    public List<Kanji> getAllKanjiOfSchoolGrade(Integer schoolGrade) {
        return kanjiRepository.findAllKanjiOfSchoolGrade(schoolGrade);
    }
    @Override
    public List<Kanji> getAllJoyoKanji() {
        return kanjiRepository.findAllJoyoKanji();
    }

    @Override
    public List<Kanji> getAllJinmeiyoKanji() {
        return kanjiRepository.findAllJinmeiyoKanji();
    }

    @Override
    public List<Kanji> getAllKanjiByReading(String reading){
        return kanjiRepository.findAllByReading(reading);
    }

    @Override
    @Transactional
    public void deleteKanji(String spelling) {
        kanjiRepository.deleteKanjiBySpelling(spelling);
    }


}
