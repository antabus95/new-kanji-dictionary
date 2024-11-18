package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Reading;
import jakarta.transaction.Transactional;

public interface ReadingService {
    @Transactional
    void saveReading(Reading reading);
}
