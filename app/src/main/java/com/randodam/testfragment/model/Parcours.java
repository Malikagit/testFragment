package com.randodam.testfragment.model;

import java.util.Date;

public class Parcours {

    String nomParcours;
    Date date_parc;
    String[] descriptif_parcours;

    public Parcours(String nom, Date date_parc, String[] descriptif_parcours) {
        this.nomParcours = nom;
        this.date_parc = date_parc;
        this.descriptif_parcours = descriptif_parcours;
    }

    public String getNom() {
        return nomParcours;
    }

    public Date getDate_parc() {
        return date_parc;
    }

    public String[] getDescriptif_parcours() {
        return descriptif_parcours;
    }

    public void setNom(String nom) {
        this.nomParcours = nom;
    }

    public void setDate_parc(Date date_parc) {
        this.date_parc = date_parc;
    }

    public void setDescriptif_parcours(String[] descriptif_parcours) {
        this.descriptif_parcours = descriptif_parcours;
    }
}
