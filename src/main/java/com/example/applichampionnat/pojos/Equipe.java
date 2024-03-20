package com.example.applichampionnat.pojos;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Date dateCreation;
    private String logo;
    private String nomEntraineur;
    private String president;
    private String statut;
    private String siege;
    private String telephone;
    private String siteWeb;



    @ManyToMany(mappedBy = "equipes")
    private Collection<Championnat> championnats;

    @ManyToOne
    private Stade stade;


    public Equipe(String nom, Date dateCreation, String logo, String nomEntraineur, String president, String statut, String siege, String telephone, String siteWeb, Collection<Championnat> championnats, Stade stade) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.logo = logo;
        this.nomEntraineur = nomEntraineur;
        this.president = president;
        this.statut = statut;
        this.siege = siege;
        this.telephone = telephone;
        this.siteWeb = siteWeb;
        this.championnats = championnats;
        this.stade = stade;
    }

    public Equipe() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNomEntraineur() {
        return nomEntraineur;
    }

    public void setNomEntraineur(String nomEntraineur) {
        this.nomEntraineur = nomEntraineur;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Collection<Championnat> getChampionnats() {
        return championnats;
    }

    public void setChampionnats(Collection<Championnat> championnats) {
        this.championnats = championnats;
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

}
