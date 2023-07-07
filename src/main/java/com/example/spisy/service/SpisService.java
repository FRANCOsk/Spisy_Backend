package com.example.spisy.service;

import com.example.spisy.model.Spis;
import com.example.spisy.repository.SpisRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service


public class SpisService {

    private SpisRepository spisRepository;

    public void saveMock() {

        List<Spis> spisArray = new ArrayList<Spis>();
        spisArray.add(new Spis(1L, "AB210", "Akta", "titul",
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20), LocalDateTime.of(2023, Month.APRIL, 21, 20, 20),
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20)));
        spisArray.add(new Spis(2L, "CD1510", "Akta", "koniec",
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20), LocalDateTime.of(2023, Month.JUNE, 15, 8, 30),
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20)));
        spisArray.add(new Spis(3L, "FE650", "Akta", "zaznam",
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20), LocalDateTime.of(2023, Month.JULY, 23, 12, 45),
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20)));
        spisArray.add(new Spis(4L, "GH950", "Akta", "zaznam",
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20), LocalDateTime.of(2023, Month.AUGUST, 17, 18, 15),
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20)));
        spisArray.add(new Spis(5L, "XZ850", "Akta", "zaznam",
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20), LocalDateTime.of(2023, Month.OCTOBER, 19, 22, 30),
                LocalDateTime.of(2023, Month.APRIL, 21, 20, 20)));

        saveMultipleSpis(spisArray);


    }
    public SpisService(SpisRepository spisRepository) {


        this.spisRepository = spisRepository;
        this.saveMock();
    }

    public void saveMultipleSpis(List<Spis> spisList) {
        spisList.forEach(spis -> spisRepository.save(spis));
    }

    public List<Spis> getMultipleSpis() {

        return spisRepository.findAll();
    }

    public Spis getSpisById(Long id) {

        return spisRepository.findById(id).get();

    }

    public Spis putSpis(Spis spis) {

        return spisRepository.save(spis);
    }

    public void deleteSpisById(Long id) {

        spisRepository.deleteById(id);
    }
}
