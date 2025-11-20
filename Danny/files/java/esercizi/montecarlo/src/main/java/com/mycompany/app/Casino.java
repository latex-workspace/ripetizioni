package com.mycompany.app;

import java.util.ArrayList;

/**
 * Casino
 */

public class Casino {
  ArrayList<Slot> slots = new ArrayList<Slot>();
  String nome;
  private int slotIDCounter = 0;

  public Casino(String nome) {
    this.nome = nome;
  }

  public int addSlot(Slot s) {
    slotIDCounter++;
    s.setId(slotIDCounter);
    slots.add(s);
    return slotIDCounter;
  }

  public Slot getSlotById(int id) {
    for (Slot s : slots) {
      if (s.getId() == id)
        return s;
    }
    return null;
  }

  public Slot getSlotByName(String name) {
    for (Slot s : slots) {
      if (s.getName() == name)
        return s;
    }
    return null;
  }

  public Slot removeSlotById(int id) {
    for (int i = 0; i < slots.size(); i++) {
      if (slots.get(i).getId() == id) {
        return slots.remove(i);
      }
    }
    return null;
  }

  // Ritorna il numero di indici rimossi
  public Slot removeSlotByName(String name) {
    for (int i = 0; i < slots.size(); i++) {
      if (slots.get(i).getName() == name)
        return slots.remove(i);
    }
    return null;
  }

  // Ritorna il numero di indici rimossi
  public int removeAllSlotsByName(String name) {
    ArrayList<Integer> indiciDaRimuovere = new ArrayList<Integer>();
    for (int i = 0; i < slots.size(); i++) {
      if (slots.get(i).getName() == name)
        indiciDaRimuovere.add(i);
    }
    indiciDaRimuovere.sort((a, b) -> b - a); // Ordino in modo decrescente per evitare problemi di indice
    for (int index : indiciDaRimuovere) {
      slots.remove(index);
    }
    return indiciDaRimuovere.size();
  }

  @Override
  public String toString() {
    String rv = "Casino \"" + nome + "\": " + slots.size() + " slots:";
    for (Slot s : slots) {
      rv += "\n\t" + s.getName() + ":\t" + s.getId();
    }
    return rv;
  }
}
