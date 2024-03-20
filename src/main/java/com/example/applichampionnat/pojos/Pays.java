package com.example.applichampionnat.pojos;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String logo;

    @OneToMany(mappedBy = "pays")
    private Collection<Championnat> championnats;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Collection<Championnat> getChampionnats() {
        return championnats;
    }

    public void setChampionnats(Collection<Championnat> championnats) {
        this.championnats = championnats;
    }

    public Pays() {
    }

    public Pays(String nom, String logo) {
        this.nom = nom;
        this.logo = logo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
