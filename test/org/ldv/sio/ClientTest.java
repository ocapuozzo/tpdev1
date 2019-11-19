package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;

  @Before
  public void initializeEachTest() {
    Adresse adr = new Adresse("joé", "rue de la gare");
    this.c = new Client("Dijkstra", "Edsger", adr);
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }

  @Test
  public void livraisonExiste() {
    assertNotNull(this.c.getLivraison());
  }

  @Test
  public void bonneAdresseDeLivraison() {
    Adresse adr = new Adresse("joé", "rue de la gare");
    assertEquals(adr, this.c.getLivraison());
  }

  @Test
  public void bonneAdresseDeLivraisonEtendue() {
    Adresse adr = new AdresseEtendue("joé", "rue de la gare", "a@gmail.com");
    Client c = new Client("Dijkstra", "Edsger", adr);
    assertEquals(adr, this.c.getLivraison());
  }

  @Test
  public void changeAdressesDeLivraisonEtendue() {
    Adresse adr1 = new AdresseEtendue("Kernighan", "rue de la gare", "a@gmail.com");
    Adresse adr2 = new Adresse("Knuth", "rue du cinema");

    Client c = new Client("Dijkstra", "Edsger", adr2, adr1);

    assertEquals(adr1, c.getLivraison());

    List adrLivraisons = new ArrayList<Adresse>();
    adrLivraisons.add(adr2);
    adrLivraisons.add(adr1);

    c.setLivraisons(adrLivraisons);
    assertEquals(adr2, c.getLivraison());
  }

}