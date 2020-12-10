package main.java.com.TP;

import main.java.com.TP.observable.Observable;

public class Demande  extends Observable {
    //OBSERVABLE
    public static final String INIT="INIT";
    public static final String APPROUVE="APPROUVE";
    public static final String INORDER="INORDER";
    public static final String BLOQUE="BLOQUE";
    private String state;
    private double prix;

    public Demande(Double prix){
        this.state=Demande.INIT;
        this.prix=prix;
    }

    public Demande(String state, double prix) {
        this.state = state;
        this.prix = prix;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

            notifie();

    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
