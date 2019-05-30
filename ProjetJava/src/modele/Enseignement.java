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
public class Enseignement {
    private int id=0;
    private String nom_matiere="";

    public Enseignement() {
    }
    
    public Enseignement(int id, String nom_matiere) {
        this.id=id;
        this.nom_matiere=nom_matiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_matiere() {
        return nom_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }
    
    
    
}
