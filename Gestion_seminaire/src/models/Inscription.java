/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author hpp
 */
public class Inscription {
    private Date date;
    private enum etat {confirme,attente,desister}
    private int idParticipant;
    private int idSeminaire;

    public Inscription(Date date, int idParticipant, int idSeminaire) {
        this.date = date;
        this.idParticipant = idParticipant;
        this.idSeminaire = idSeminaire;
    }


    public Inscription() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public int getIdSeminaire() {
        return idSeminaire;
    }

    public void setIdSeminaire(int idSeminaire) {
        this.idSeminaire = idSeminaire;
    }

   
    
    
}
