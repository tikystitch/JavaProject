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
public class Bulletin_matiere {
    private int id=0;
    private String appreciation="";
    private int idbulletin=0;

    public Bulletin_matiere() {
    }
    public Bulletin_matiere(int id, String appreciation, int idbulletin) {
        this.id=id;
        this.appreciation=appreciation;
        this.idbulletin=idbulletin;
    }

    public int getId() {
        return id;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public int getIdbulletin() {
        return idbulletin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public void setIdbulletin(int idbulletin) {
        this.idbulletin = idbulletin;
    }
    
    
    

}
