/**
 * EsercizioAuto
 */
class EsercizioAuto {

  public static void main(String[] args) {
    //Targa t = new Targa("su7y70");

    Auto auto1 = new Auto("A", "a", 1,2,3);
    Auto auto2 = new Auto("B", "b", 1,2,3);
    Auto auto3 = new Auto("A", "a", 1,2,3);
    Auto auto4 = new Auto("B", "b", 1,2,3);
    System.out.println(Auto.count);
  }

}

class Targa {
  String l = "aa000aa";

  public Targa(String l) {
    if (l.length() != 7) {
      System.out.println("lunghezza sbagliata, creo targa di default");
      return;
    }

    if (!(isLettera(l.charAt(0)) && isLettera(l.charAt(1)) && isLettera(l.charAt(5)) && isLettera(l.charAt(6)))) {
      System.out.println("Ho carattere sbagliato nel posto delle lettere");
      return;
    }

    if (!(isCifra(l.charAt(2)) && isCifra(l.charAt(3)) && isCifra(l.charAt(4)))) {
      System.out.println("Ho carattere sbagliato nel posto delle cifre");
      return;
    }

    this.l = l;
  }

  private boolean isCifra(char c) {
    return c <= '9' && c >= '0';

  }

  private boolean isLettera(char c) {
    return (c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A');
  }

}

class Auto {
  private String modello, casaProduttrice;
  private int cilindrata, peso, costo;
  static int count;

  


  public int getCilindrata() {
    return cilindrata;
  }


  public void setCount(int count) {
    this.count = count;
  }

  public Auto(String modello, String casaProduttrice, int cilindrata, int peso, int costo) {
    this.modello = modello;
    this.casaProduttrice = casaProduttrice;
    this.cilindrata = cilindrata;
    this.peso = peso;
    this.costo = costo;
    count++;
  }

  public String getModello() {
    return modello;
  }

  public String getCasaProduttrice() {
    return casaProduttrice;
  }

  public int getCilidrata() {
    return cilindrata;
  }

  public int getPeso() {
    return peso;
  }

  public int getCosto() {
    return costo;
  }

  public void setCosto(int costo) {
    this.costo = costo;
  }

  void stampaDati() {
    System.out.println("Modello:" + modello);
    System.out.println("Costo:" + costo);
  }

  boolean perNeopatentato() {
    if (cilindrata < 95 && ((float)cilindrata)/peso < 0.055){
        return true;
    }

    return false;
  }
}
