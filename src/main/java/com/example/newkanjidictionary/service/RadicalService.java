package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Radical;

import java.util.List;

public interface RadicalService {
    List<Radical> getAllRadicals();
    Radical getById(Integer id);
    Radical getByRadicalForm(String spelling);
    List<Radical> getByStrokeCount(Integer strokeCount);
    Radical saveRadical(Radical radical);
    Radical updateRadical(Radical radical);
    void deleteRadical(String spelling);

}
