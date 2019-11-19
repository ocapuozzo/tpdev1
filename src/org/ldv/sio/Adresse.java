package org.ldv.sio;

import java.util.Objects;

public class Adresse {
  private String nom;
  private String rue;

  public Adresse(String nom, String rue) {
    this.nom = nom;
    this.rue = rue;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getRue() {
    return rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    // accepter les sous-classes aussi, comme AdresseEtendue
    if (!(o instanceof Adresse)) return false;
    Adresse adresse = (Adresse) o;
    return Objects.equals(getNom(), adresse.getNom()) &&
            Objects.equals(getRue(), adresse.getRue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNom(), getRue());
  }

  @Override
  public String toString() {
    return "Adresse domicile {" +
            "nom='" + nom + '\'' +
            ", rue='" + rue + '\'' +
            '}';
  }
}
