class Auto {
  private String modello, casaProduttrice;
  private int cilindrata, costo, peso;
  private Targa t;

  static private int count = 0;

  public Auto(String modello, String casaProduttrice, int cilindrata, int costo, int peso, Targa t) {
    this.modello = modello;
    this.casaProduttrice = casaProduttrice;
    this.cilindrata = cilindrata;
    this.costo = costo;
    this.peso = peso;
    this.t = t;
  }

  @Override
  public String toString() {
    return "Auto [modello=" + modello + ", casaProduttrice=" + casaProduttrice + ", cilindrata=" + cilindrata
        + ", costo=" + costo + ", peso=" + peso + ", t=" + t + ", getClass()=" + getClass() + ", hashCode()="
        + hashCode() + "]";
  }

  public boolean perNeopatentato() {
    // non funziona proprio così ma fa nulla
    return cilindrata <= 2000 && cilindrata / (float) peso < 1.2;
  }

  public String getModello() {
    return modello;
  }

  public String getCasaProduttrice() {
    return casaProduttrice;
  }

  public int getCilindrata() {
    return cilindrata;
  }

  public int getCosto() {
    return costo;
  }

  public int getPeso() {
    return peso;
  }

  public Targa getTarga() {
    return t;
  }

  @Override
  public int hashCode() {
    return t.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return ((Auto) obj).getTarga().equals(t);
  }

}
