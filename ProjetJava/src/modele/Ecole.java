/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class Ecole {
    private int id=0;
    private String nom="";
    private int idclasse=0;
    ArrayList<Classe> listClasse = new ArrayList<Classe>();

    public Ecole() {
    }
    
     public Ecole(int id, String nom) {
         this.id=id;
         this.nom=nom;
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

    public int getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(int idclasse) {
        this.idclasse = idclasse;
    }

    public ArrayList<Classe> getListClasse() {
        return listClasse;
    }

    public void setListClasse(ArrayList<Classe> listClasse) {
        this.listClasse = listClasse;
    }
     
     
    
}
