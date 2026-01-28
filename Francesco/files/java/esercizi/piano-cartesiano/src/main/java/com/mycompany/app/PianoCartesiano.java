package com.mycompany.app;

import java.util.ArrayList;

class Coppia {
  int id;
  Punto p;

  public Coppia(int id, Punto p) {
    this.id = id;
    this.p = p;
  }

  @Override
  public String toString() {
    return "Coppia{" + "id=" + id + ", p=" + p + '}';
  }
}

// per ora il piano contiene solo punti
class PianoCartesiano {
  ArrayList<Coppia> punti = new ArrayList<Coppia>();
  int counter = 0;

  public int addPunto(Punto p) {
    counter++;
    this.punti.add(new Coppia(counter, p));
    return counter;
  }

  public boolean removePunto(int id) {
    // Scorrere tutto l'array e salvarti la posizione dell'elemento con id == id
    // Rimuoverlo dall'array
    // val | | | | | | | | | | | |
    // index | 0 | 1 | 2 | 3 | | | | | | | |

    boolean found = false;
    int indexToRemove = -1;
    for (int i = 0; i < punti.size(); i++) {
      Coppia current = punti.get(i);
      // System.out.println("indice: " + i + "\t coppia" + current);

      if (current.id == id) {
        // System.out.println("TROVATO ID: " + id);
        found = true;
        indexToRemove = i;
        break;
      }
    }

    if (found == true)
      punti.remove(indexToRemove);

    return found;
  }

  public void stampaPunti() {
    // for (int i = 0; i < this.punti.size(); i++)
    // System.out.println(punti.get(i));

    for (Coppia p : this.punti)
      System.out.println(p);
  }
}
