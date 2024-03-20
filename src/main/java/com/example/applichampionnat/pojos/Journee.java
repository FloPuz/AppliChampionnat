package com.example.applichampionnat.pojos;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Journee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;

    @ManyToOne
    private Championnat championnat;

    @OneToMany(mappedBy = "journee")
    private Collection<Game> games;

    public Journee() {
    }

    public Journee(int numero, Championnat championnat, Collection<Game> games) {
        this.numero = numero;
        this.championnat = championnat;
        this.games = games;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Championnat getChampionnat() {
        return championnat;
    }

    public void setChampionnat(Championnat championnat) {
        this.championnat = championnat;
    }

    public Collection<Game> getGames() {
        return games;
    }

    public void setGames(Collection<Game> games) {
        this.games = games;
    }
}
