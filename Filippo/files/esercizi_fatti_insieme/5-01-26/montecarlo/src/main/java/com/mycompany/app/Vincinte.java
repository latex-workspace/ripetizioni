package com.mycompany.app;

import java.util.ArrayList;

/**
 * Vincinte
 */
public class Vincinte {

  static public int sottosequenzaMassimaContigua(ArrayList<Numero> numeri) {
    if (numeri.size() == 0)
      return 0;

    int numeriConsecutivi = 0;
    int maxNumeriConsecutivi = 0;
    for (int i = 1; i < numeri.size(); i++) {
      if (numeri.get(i).getValore() == numeri.get(i - 1).getValore() + 1) {
        numeriConsecutivi++;
      } else {
        if (numeriConsecutivi > maxNumeriConsecutivi)
          maxNumeriConsecutivi = numeriConsecutivi;

        numeriConsecutivi = 0;
      }
    }
    return maxNumeriConsecutivi + 1;
  }

  static public int sottosequenzaMassimaContigua2(ArrayList<Numero> numeri) {

    int latest = numeri.get(0).getValore() - 1;
    int numeriConsecutivi = 0;
    int maxNumeriConsecutivi = 0;
    for (int i = 0; i < numeri.size(); i++) {
      if (numeri.get(i).getValore() == latest + 1) {
        numeriConsecutivi++;
      } else {
        if (numeriConsecutivi > maxNumeriConsecutivi)
          maxNumeriConsecutivi = numeriConsecutivi;

        numeriConsecutivi = 1;
      }
      latest = numeri.get(i).getValore();
    }

    return maxNumeriConsecutivi;
  }

  static int checkScala(Mazzo mazzo) {
    // Seme semi[] = Seme.values();

    ArrayList<Numero> cuori = new ArrayList<Numero>();
    ArrayList<Numero> quadri = new ArrayList<Numero>();
    ArrayList<Numero> fiori = new ArrayList<Numero>();
    ArrayList<Numero> picche = new ArrayList<Numero>();

    for (Carta c : mazzo.getCarte()) {
      if (c.getSeme() == Seme.CUORI) {
        cuori.add(c.getNumero());
      } else if (c.getSeme() == Seme.QUADRI) {
        quadri.add(c.getNumero());
      } else if (c.getSeme() == Seme.FIORI) {
        fiori.add(c.getNumero());
      } else if (c.getSeme() == Seme.PICCHE) {
        picche.add(c.getNumero());
      }
    }

    cuori.sort((n1, n2) -> {
      return n1.getValore() - n2.getValore();
    });
    quadri.sort((n1, n2) -> {
      return n1.getValore() - n2.getValore();
    });
    fiori.sort((n1, n2) -> {
      return n1.getValore() - n2.getValore();
    });
    picche.sort((n1, n2) -> {
      return n1.getValore() - n2.getValore();
    });

    return 0;
  }
}
