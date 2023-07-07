package com.example.spisy.controller;

import com.example.spisy.model.Spis;
import com.example.spisy.service.SpisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class SpisController {
    private SpisService spisService;

    public SpisController(SpisService spisService) {
        this.spisService = spisService;
    }
    @PostMapping("/saveSpis")
    void saveMultipleSpis(@RequestBody List<Spis> spisList){

        spisService.saveMultipleSpis(spisList);

    }

    @GetMapping("/spisy")
    List<Spis> getMultipleSpis(){
     return  spisService.getMultipleSpis();

    }

    @GetMapping("/spis/{id}")
    Spis getSpisById(@PathVariable Long id){

        return spisService.getSpisById(id);
    }

    @PutMapping("/spis")
    Spis putSpisById(@RequestBody Spis spis){

        return spisService.putSpis(spis);
    }

    @DeleteMapping("/spis/{id}")
     void deleteSpisById (@PathVariable Long id){
        spisService.deleteSpisById(id);
    }

}
