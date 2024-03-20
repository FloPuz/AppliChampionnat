package com.example.applichampionnat.pojos;

import com.example.applichampionnat.enums.TypeClassement;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String logo;
    private Date dateDebut;
    private Date dateFin;
    private int pointGagne;
    private int pointPerdu;
    private int pointNul;
    private TypeClassement typeClassement;

    @ManyToOne
    private Pays pays;

    @ManyToMany
    @JoinTable(
            name = "Championnat_Equipe",
            joinColumns=
            @JoinColumn(name="Champ_ID", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="Equipe_ID", referencedColumnName="id")
    )
    private Collection<Equipe> equipes;

    @OneToMany(mappedBy = "championnat")
    private Collection<Journee> journees;

    public Championnat() {
    }

    public Championnat(String nom, String logo, Date dateDebut, Date dateFin, int pointGagne, int pointPerdu, int pointNul, TypeClassement typeClassement, Pays pays, Collection<Equipe> equipes, Collection<Journee> journees) {
        this.nom = nom;
        this.logo = logo;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.pointGagne = pointGagne;
        this.pointPerdu = pointPerdu;
        this.pointNul = pointNul;
        this.typeClassement = typeClassement;
        this.pays = pays;
        this.equipes = equipes;
        this.journees = journees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getPointGagne() {
        return pointGagne;
    }

    public void setPointGagne(int pointGagne) {
        this.pointGagne = pointGagne;
    }

    public int getPointPerdu() {
        return pointPerdu;
    }

    public void setPointPerdu(int pointPerdu) {
        this.pointPerdu = pointPerdu;
    }

    public int getPointNul() {
        return pointNul;
    }

    public void setPointNul(int pointNul) {
        this.pointNul = pointNul;
    }

    public TypeClassement getTypeClassement() {
        return typeClassement;
    }

    public void setTypeClassement(TypeClassement typeClassement) {
        this.typeClassement = typeClassement;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Collection<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(Collection<Equipe> equipes) {
        this.equipes = equipes;
    }

    public Collection<Journee> getJournees() {
        return journees;
    }

    public void setJournees(Collection<Journee> journees) {
        this.journees = journees;
    }
}
