package org.ldv.sio;

import java.util.List;
import java.util.Vector;

public class Client {
  private String nom;
  private String prenom;
  private Adresse domicile;
  private List<Adresse> livraisons;

  public Client(String nom, String prenom, Adresse domicile) {
    this.nom = nom;
    this.prenom = prenom;
    this.livraisons = new Vector();
    this.domicile = domicile;
  }

  public Client(String nom, String prenom, Adresse domicile, Adresse liv) {
    this(nom, prenom, domicile);
    this.livraisons.add(liv);
  }

  public Client(String nom, String prenom, Adresse domicile, List<Adresse> livraisons) {
    this(nom, prenom, domicile);
    this.livraisons = livraisons;
  }

  public Adresse getDomicile() {
    return domicile;
  }

  public void setDomicile(Adresse domicile) {
    this.domicile = domicile;
  }

  public Adresse getLivraison() {
    return (livraisons.size() == 0) ? domicile : livraisons.get(0);
  }

  public void setLivraisons(List<Adresse> adresses) {
    livraisons = adresses;
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

  @Override
  public String toString() {
    return "Client {" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            " domicile " + domicile +
            '}';
  }
}
