package org.ldv.sio;

import java.util.Objects;

public class AdresseEtendue extends Adresse {
  private String url;
  private String email;

  public AdresseEtendue(String nom, String rue, String url, String email) {
    super(nom, rue);
    this.url = url;
    this.email = email;
  }

  public AdresseEtendue(String nom, String rue, String email) {
    this(nom, rue,null,email);
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}