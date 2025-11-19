package com.mycompany.app;

enum Seme {
  CUORI, QUADRI, FIORI, PICCHE;
}

public class Carta {
  private Seme seme;
  private int valore;
  private boolean is_jolly;

  public Carta(Seme seme, int valore) {
    if (!(valore > 0 && valore < 14))
      throw new IllegalArgumentException("Valore carta non valido");

    this.seme = seme;
    this.valore = valore;
    this.is_jolly = false;
  }

  private Carta(Seme seme, int valore, boolean is_jolly) {
    this.seme = seme;
    this.valore = valore;
    this.is_jolly = is_jolly;
  }

  public static Carta creaJolly() {
    return new Carta(null, 0, true);
  }

  public Seme getSeme() {
    return seme;
  }

  public int getValore() {
    return valore;
  }

  @Override
  public String toString() {
    if (is_jolly)
      return "Carta{Jolly}";
    return "Carta{" +
        "seme=" + seme +
        ", valore=" + valore +
        '}';
  }

  // Ritorna <0 se "this" va prima, 0 se sono uguali e >0 se va dopo
  public int compare(Carta other) {
    if (other.is_jolly)
      return -1;
    if (this.is_jolly)
      return 1;

    if (this.seme.ordinal() != other.seme.ordinal())
      return this.getSeme().ordinal() - other.getSeme().ordinal();
    else {
      return this.getValore() - other.getValore();
    }
  }
}

// enum Carta {
// UNOCUORI(1, Seme.CUORI),
// DUECUORI(2, Seme.CUORI),
// TRECUORI(3, Seme.CUORI),
// QUATTROCUORI(4, Seme.CUORI),
// CINQUECUORI(5, Seme.CUORI),
// SEICUORI(6, Seme.CUORI),
// SETTECUORI(7, Seme.CUORI),
// OTTOCUORI(8, Seme.CUORI),
// NONECUORI(9, Seme.CUORI),
// DIECICUORI(10, Seme.CUORI),
//
// UNOFIORI(1, Seme.FIORI),
// DUEFIORI(2, Seme.FIORI),
// TREFIORI(3, Seme.FIORI),
// QUATTROFIORI(4, Seme.FIORI),
// CINQUEFIORI(5, Seme.FIORI),
// SEIFIORI(6, Seme.FIORI),
// SETTEFIORI(7, Seme.FIORI),
// OTTOFIORI(8, Seme.FIORI),
// NONEFIORI(9, Seme.FIORI),
// DIECIFIORI(10, Seme.FIORI),
//
// UNOQUADRI(1, Seme.QUADRI),
// DUEQUADRI(2, Seme.QUADRI),
// TREQUADRI(3, Seme.QUADRI),
// QUATTROQUADRI(4, Seme.QUADRI),
// CINQUEQUADRI(5, Seme.QUADRI),
// SEIQUADRI(6, Seme.QUADRI),
// SETTEQUADRI(7, Seme.QUADRI),
// OTTOQUADRI(8, Seme.QUADRI),
// NONEQUADRI(9, Seme.QUADRI),
// DIECIQUADRI(10, Seme.QUADRI),
//
// UNOPICCHE(1, Seme.PICCHE),
// DUEPICCHE(2, Seme.PICCHE),
// TREPICCHE(3, Seme.PICCHE),
// QUATTROPICCHE(4, Seme.PICCHE),
// CINQUEPICCHE(5, Seme.PICCHE),
// SEIPICCHE(6, Seme.PICCHE),
// SETTEPICCHE(7, Seme.PICCHE),
// OTTOPICCHE(8, Seme.PICCHE),
// NONEPICCHE(9, Seme.PICCHE),
// DIECIPICCHE(10, Seme.PICCHE);
//
// private final int valore;
// private final Seme seme;
//
// Carta(int valore, Seme seme) {
// this.valore = valore;
// this.seme = seme;
// }
//
// public int getValore() {
// return valore;
// }
//
// public Seme getSeme() {
// return seme;
// }
//
// }
