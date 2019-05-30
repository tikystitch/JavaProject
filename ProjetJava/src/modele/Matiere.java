/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author louis
 */
public class Matiere {
    private int id=0;
    private int note=0;
    private String appreciation="";
    private int bulletin=0;
    private int prof=0;

    public Matiere() {
    }
    
    public Matiere(int id, int note, String appreciation, int bulletin,int prof) {
        this.id=id;
        this.note=note;
        this.appreciation=appreciation;
        this.bulletin=bulletin;
        this.prof=prof;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public int getBulletin() {
        return bulletin;
    }

    public void setBulletin(int bulletin) {
        this.bulletin = bulletin;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }
    
    
}
