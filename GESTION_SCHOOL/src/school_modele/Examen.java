/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

/**
 *
 * @author devv
 */
public class Examen {
    private int idExamen;
    private int note;

    public Examen() {
    }

    public Examen(int idExamen, int note) {
        this.idExamen = idExamen;
        this.note = note;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
    
}
