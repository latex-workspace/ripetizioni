package com.mycompany.app;

public class Email {
  private String prefisso;
  private String dominio;
  private String topLevelDomain;

  public Email(String email) {
    email = email.trim();

    // String regex = "^([a-zA-Z0-9_.+-]+)@([a-zA-Z0-9-]+)\\.([a-zA-Z]{2,})$";
    String[] parts = email.split("@");

    if (email.equals("@"))
      throw new IllegalArgumentException("La chiocciola non può essere l'unico carattere");
    if (parts.length != 2)
      throw new IllegalArgumentException("La mail deve contenere esattamente una chiocciola");
    String prefix = parts[0];
    String suffix = parts[1];
    if (prefix.length() == 0 || suffix.length() == 0)
      throw new IllegalArgumentException("Il prefisso e il suffisso non possono essere vuoti");

    String[] suffixParts = suffix.split("\\.");

    if (suffix.equals("."))
      throw new IllegalArgumentException("Il suffisso non può contenere solo un punto (.)");
    if (suffixParts.length != 2)
      throw new IllegalArgumentException("La mail deve avere un dominio e un top level domain");
    String domain = suffixParts[0];
    String topLevelDomain = suffixParts[1];
    if (domain.length() == 0 || topLevelDomain.length() == 0)
      throw new IllegalArgumentException("Il dominio e il top level domain non possono essere vuoti");

    this.prefisso = prefix;
    this.dominio = domain;
    this.topLevelDomain = topLevelDomain;
  }

  @Override
  public String toString() {
    return this.prefisso + "@" + this.dominio + "." + this.topLevelDomain;
  }

  public String getPrefisso() {
    return prefisso;
  }

  public String getDominio() {
    return dominio;
  }

  public String getTopLevelDomain() {
    return topLevelDomain;
  }

}
