package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Radical;
import com.example.newkanjidictionary.repository.RadicalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RadicalServiceImpl implements RadicalService{
    private final RadicalRepository radicalRepository;

    @Override
    public List<Radical> getAllRadicals() {
        return radicalRepository.findAll();
    }

    @Override
    public Radical getById(Integer id) {
        return radicalRepository.findById(id).orElse(null);
    }

    @Override
    public Radical getByRadicalForm(String spelling) {
        return radicalRepository.findByRadicalForm(spelling);
    }

    @Override
    public List<Radical> getByStrokeCount(Integer strokeCount) {
        return radicalRepository.findByStrokeCount(strokeCount);
    }

    @Override
    public Radical saveRadical(Radical radical) {
        return radicalRepository.save(radical);
    }

    @Override
    public Radical updateRadical(Radical radical) {
        return radicalRepository.save(radical);
    }

    @Override
    public void deleteRadical(String spelling) {
        radicalRepository.deleteBySpelling(spelling);
    }
}
