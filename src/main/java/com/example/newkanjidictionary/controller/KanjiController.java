package com.example.newkanjidictionary.controller;

import com.example.newkanjidictionary.model.Kanji;
import com.example.newkanjidictionary.model.Reading;
import com.example.newkanjidictionary.service.KanjiService;
import com.example.newkanjidictionary.service.ReadingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/kanjidic")
@AllArgsConstructor
public class KanjiController {

    private final KanjiService kanjiService;
    private final ReadingService readingService;

    @GetMapping
    public List<Kanji> findAllKanji() {
        return kanjiService.findAllKanji();
    }
    //Add new Kanji to DB
    @PostMapping("save_kanji")
    public Kanji saveKanji(@RequestBody Kanji kanji) {
        return kanjiService.saveKanji(kanji);
    }
    //Find Kanji by its spelling
    @GetMapping("/search/spelling={spelling}")
    public Kanji findKanjiBySpelling(@PathVariable String spelling) {
        return kanjiService.findKanjiBySpelling(spelling);
    }
    //Find Kanji by its base meaning
    @GetMapping("/search/meaning={baseMeaning}")
    public List<Kanji> findKanjiByBaseMeaning(@PathVariable String baseMeaning) {
        return kanjiService.findKanjiByBaseMeaning(baseMeaning);
    }

    //Find all Kanji of JLPT Level
    @GetMapping("/search/kanji_jlpt-n{jlptLvl}")
    public List<Kanji> findAllKanjiOfJlptLvl(@PathVariable Integer jlptLvl) {
        return kanjiService.findAllKanjiOfJlptLvl(jlptLvl);
    }
    //Find all Kanji of Kanken Level
    @GetMapping("/search/kanji_kanken-{kankenLvl}")
    public List<Kanji> findAllKanjiOfKankenLvl(@PathVariable Float kankenLvl) {
        return kanjiService.findAllKanjiOfKankenLvl(kankenLvl);
    }
    //Find all Kanji of School Grade
    @GetMapping("/search/kanji_grade-{schoolGrade}")
    public List<Kanji> findAllKanjiOfSchoolGrade(@PathVariable Integer schoolGrade) {
        return kanjiService.findAllKanjiOfSchoolGrade(schoolGrade);
    }
    //Find all 常用漢字
    @GetMapping("/search/kanji_joyo")
    public List<Kanji> findAllJoyoKanji() {
        return kanjiService.findAllJoyoKanji();
    }
    //Find all 人名用漢字
    @GetMapping("/search/kanji_jinmeiyo")
    public List<Kanji> findAllJinmeiyoKanji() {
        return kanjiService.findAllJinmeiyoKanji();
    }
    //Update Kanji info
    @PutMapping("update_kanji")
    public Kanji updateKanji(@RequestBody Kanji kanji) {
        return kanjiService.updateKanji(kanji);
    }
    //Delete Kanji by its spelling
    @DeleteMapping("delete_kanji/{spelling}")
    public void deleteKanji(@PathVariable String spelling) {
        kanjiService.deleteKanji(spelling);
    }

}
