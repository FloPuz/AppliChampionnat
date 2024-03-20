package com.example.applichampionnat.pojos;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private String capcaite;
    private String telephone;

    @OneToMany(mappedBy = "stade")
    private Collection<Equipe> equipes;

    @OneToMany(mappedBy = "stade")
    private Collection<Game> games;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Stade{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capcaite='" + capcaite + '\'' +
                ", telephone='" + telephone + '\'' +
                ", equipes=" + equipes +
                ", games=" + games +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCapcaite() {
        return capcaite;
    }

    public void setCapcaite(String capcaite) {
        this.capcaite = capcaite;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Collection<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(Collection<Equipe> equipes) {
        this.equipes = equipes;
    }

    public Collection<Game> getGames() {
        return games;
    }

    public void setGames(Collection<Game> games) {
        this.games = games;
    }

    public Stade() {
    }

    public Stade(String nom, String adresse, String capcaite, String telephone, Collection<Equipe> equipes, Collection<Game> games) {
        this.nom = nom;
        this.adresse = adresse;
        this.capcaite = capcaite;
        this.telephone = telephone;
        this.equipes = equipes;
        this.games = games;
    }
}
