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
public class Eleve {
    private int id=0;
    private String nom="";
    private String prenom="";
    private int classe=0;
    private int bulletin=0;

    public Eleve() {
    }
    
    public Eleve(int id, String nom, String prenom,int classe, int bulletin) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.classe=classe;
        this.bulletin=bulletin;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getBulletin() {
        return bulletin;
    }

    public void setBulletin(int bulletin) {
        this.bulletin = bulletin;
    }
    
    
}
