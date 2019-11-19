package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Client c = new Client("nom", "prenom",new Adresse("toto","rue de la gare"));
    System.out.println(c.toString());
  }
}
