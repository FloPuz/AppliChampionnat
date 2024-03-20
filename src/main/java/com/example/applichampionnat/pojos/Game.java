package com.example.applichampionnat.pojos;

import jakarta.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int scoreEquipe1;
    private int scoreEquipe2;


    @ManyToOne
    private Stade stade;
    @ManyToOne
    private Equipe equipe1;
    @ManyToOne
    private Equipe equipe2;
    @ManyToOne
    private Journee journee;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(int scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public int getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(int scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Journee getJournee() {
        return journee;
    }

    public void setJournee(Journee journee) {
        this.journee = journee;
    }

    public Game() {
    }

    public Game(int scoreEquipe1, int scoreEquipe2, Stade stade, Equipe equipe1, Equipe equipe2, Journee journee) {
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
        this.stade = stade;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.journee = journee;
    }
}
