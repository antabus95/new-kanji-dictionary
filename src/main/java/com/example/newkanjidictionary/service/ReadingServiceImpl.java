package com.example.newkanjidictionary.service;

import com.example.newkanjidictionary.model.Reading;
import com.example.newkanjidictionary.repository.ReadingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReadingServiceImpl implements ReadingService {
    private final ReadingRepository readingRepository;

    @Override
    public void saveReading(Reading reading) {
        readingRepository.save(reading);
    }

}
