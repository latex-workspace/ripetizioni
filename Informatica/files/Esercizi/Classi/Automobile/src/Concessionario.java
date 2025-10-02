import java.util.ArrayList;
import java.util.HashSet;

class Concessionario {

  // ArrayList<Auto> auto = new ArrayList<>();
  HashSet<Auto> auto = new HashSet<>();
  String nome, proprietario;

  void stampa() {
    for (Auto a : auto) {
      System.out.println(a + "\n");
    }
  }

  public Auto cercaTarga(Targa t) {
    for (Auto a : auto) {
      if (a.getTarga() == t)
        return a;
    }
    return null;
  }

  public void inserAuto(Auto a) {
    auto.add(a);
  }

  public ArrayList<Auto> cercaModello(String modello) {
    ArrayList<Auto> rv = new ArrayList<>();
    for (Auto a : auto) {
      if (a.getModello() == modello)
        rv.add(a);
    }
    return rv;
  }

  public ArrayList<Auto> cercaPrezzo(int costo) {
    ArrayList<Auto> rv = new ArrayList<>();
    for (Auto a : auto) {
      if (a.getCosto() <= costo)
        rv.add(a);
    }
    return rv;
  }

  public ArrayList<Auto> cercaNeoPatentati() {
    ArrayList<Auto> rv = new ArrayList<>();
    for (Auto a : auto) {
      if (a.perNeopatentato())
        rv.add(a);
    }
    return rv;
  }
}
