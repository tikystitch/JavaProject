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
public class Trimestre {
    private int id=0;
    private String nom="";
    private date debut;
    private date fin;
    private int id_bulletin=0;

    public Trimestre() {
    }
    
    public Trimestre(int id, String nom, date debut, date fin) {
        this.id=id;
        this.nom=nom;
        this.debut=debut;
        this.fin=fin;
    }
    
}
