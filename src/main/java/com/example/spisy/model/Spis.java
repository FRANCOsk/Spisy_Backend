package com.example.spisy.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Spis {

    private @Id
    @GeneratedValue Long id;
    private String cisloSpisu;

    private String nazovDokumentu;

    private String typDokumentu;

    private LocalDateTime platnyOd;

    private LocalDateTime platnyDo;

    private LocalDateTime ulozenyDna;

    public Spis(Long id, String cisloSpisu, String nazovDokumentu, String typDokumentu, LocalDateTime platnyOd, LocalDateTime platnyDo, LocalDateTime ulozenyDna) {
        this.id = id;
        this.cisloSpisu = cisloSpisu;
        this.nazovDokumentu = nazovDokumentu;
        this.typDokumentu = typDokumentu;
        this.platnyOd = platnyOd;
        this.platnyDo = platnyDo;
        this.ulozenyDna = ulozenyDna;
    }

    public Spis(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCisloSpisu() {
        return cisloSpisu;
    }

    public void setCisloSpisu(String cisloSpisu) {
        this.cisloSpisu = cisloSpisu;
    }

    public String getNazovDokumentu() {
        return nazovDokumentu;
    }

    public void setNazovDokumentu(String nazovDokumentu) {
        this.nazovDokumentu = nazovDokumentu;
    }

    public String getTypDokumentu() {
        return typDokumentu;
    }

    public void setTypDokumentu(String typDokumentu) {
        this.typDokumentu = typDokumentu;
    }

    public LocalDateTime getPlatnyOd() {
        return platnyOd;
    }

    public void setPlatnyOd(LocalDateTime platnyOd) {
        this.platnyOd = platnyOd;
    }

    public LocalDateTime getPlatnyDo() {
        return platnyDo;
    }

    public void setPlatnyDo(LocalDateTime platnyDo) {
        this.platnyDo = platnyDo;
    }

    public LocalDateTime getUlozenyDna() {
        return ulozenyDna;
    }

    public void setUlozenyDna(LocalDateTime ulozenyDna) {
        this.ulozenyDna = ulozenyDna;
    }
}
