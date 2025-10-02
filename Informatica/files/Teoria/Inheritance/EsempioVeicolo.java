class EsempioVeicolo {
  public static void main(String[] args) {

  }
}

class Veicolo {

  String modello = "Undefined";
  int costo;

  public Veicolo(String modello, int costo) {
    this.modello = modello;
    this.costo = costo;
  }

  public void stampa() {
    System.out.println("Veicolo, modello " + modello + ", costo " + costo);
  }

}

class VeicoloAgricolo extends Veicolo {

  String impiegoAgricolo;

  public VeicoloAgricolo(String modello, int costo, String impiegoAgricolo) {
    super(modello, costo);
    this.impiegoAgricolo = impiegoAgricolo;
  }

  public void stampaImpiego() {
    System.out.println(impiegoAgricolo);
  }

}

class Moto extends Veicolo {
  boolean isCross;

  public Moto(String modello, int costo, boolean isCross) {
    super(modello, costo);
    this.isCross = isCross;
  }

}
