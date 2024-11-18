package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Reading;
import jakarta.transaction.Transactional;

public interface ReadingService {

    void saveReading(Reading reading);
}
