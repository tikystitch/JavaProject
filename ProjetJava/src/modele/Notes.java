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
public class Notes {
    private int id=0;
    private int note=0;
    private String appreciation="";
    private int id_bulletin_matiere=0;

    public Notes() {
    }
    
    public Notes(int id, int note, String appreciation) {
        this.id=id;
        this.note=note;
        this.appreciation=appreciation;
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

    public int getId_bulletin_matiere() {
        return id_bulletin_matiere;
    }

    public void setId_bulletin_matiere(int id_bulletin_matiere) {
        this.id_bulletin_matiere = id_bulletin_matiere;
    }
    
    
}
