package com.example.applichampionnat.pojos;

import com.example.applichampionnat.enums.TypeClassement;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "championnat_equipe")
public class ChampionnatEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    private int points;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Championnat getChampionnat() {
        return championnat;
    }

    public void setChampionnat(Championnat championnat) {
        this.championnat = championnat;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ChampionnatEquipe() {
    }

    public ChampionnatEquipe(Long id, Championnat championnat, Equipe equipe, int points) {
        this.id = id;
        this.championnat = championnat;
        this.equipe = equipe;
        this.points = points;
    }
}
