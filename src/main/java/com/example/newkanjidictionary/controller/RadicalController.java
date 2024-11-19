package com.example.newkanjidictionary.controller;

import com.example.newkanjidictionary.model.Radical;
import com.example.newkanjidictionary.service.RadicalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/kanjidic/radicals")
@AllArgsConstructor
public class RadicalController {
    private final RadicalService radicalService;

    @GetMapping
    public List<Radical> findAllRadicals(){
        return radicalService.getAllRadicals();
    }

    @PostMapping("save_radical")
    public Radical saveRadical(@RequestBody Radical radical){
        return radicalService.saveRadical(radical);
    }

    @GetMapping("/search/spelling={spelling}")
    public Radical findByRadicalForm(@PathVariable String spelling){
        return radicalService.getByRadicalForm(spelling);
    }

    @GetMapping("/{id}")
    public Radical findById(@PathVariable Integer id){
        return radicalService.getById(id);
    }

    @GetMapping("/search/stroke_count={strokeCount}")
    public List<Radical> findByStrokeCount(@PathVariable Integer strokeCount){
        return radicalService.getByStrokeCount(strokeCount);
    }

    @PutMapping("update_radical")
    public Radical updateRadical(@RequestBody Radical radical){
        return radicalService.updateRadical(radical);
    }

    @DeleteMapping("delete_radical/{spelling}")
    public void deleteRadical(@PathVariable String spelling){
        radicalService.deleteRadical(spelling);
    }
}
