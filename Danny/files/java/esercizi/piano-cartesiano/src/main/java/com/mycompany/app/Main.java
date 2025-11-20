package com.mycompany.app;

public class Main {
  public static void main(String[] args) {
    // Punto p1 = new Punto(0, 0);
    // Punto p2 = new Punto(2, 3);
    //
    // Rettangolo rettangolo = new Rettangolo(p2, p1);
    //
    // Cerchio cerchio = new Cerchio(new Punto(1, 1), 5);
    //
    // System.out.println(p1);
    // System.out.println(p2);
    // System.out.println(rettangolo);
    // System.out.println(cerchio);

    PianoCartesiano piano = new PianoCartesiano();
    System.out.println("Creato piano cartesiano e aggiungo punti:");
    int id1 = piano.addPunto(new Punto(1, 2));
    int id2 = piano.addPunto(new Punto(4, 5));
    int id3 = piano.addPunto(new Punto(-4, 3));
    int id4 = piano.addPunto(new Punto(-1, 3));
    int id5 = piano.addPunto(new Punto(7, 8));
    piano.stampaPunti();

    System.out.println("Rimuovo punto " + id1 + " " + id3 + " " + id5);
    piano.removePunto(id1);
    piano.removePunto(id3);
    piano.removePunto(id5);

    int id6 = piano.addPunto(new Punto(-1, -2));
    int id7 = piano.addPunto(new Punto(3, 3));

    piano.stampaPunti();

    System.out.println("Riesco a rimuovere punto " + id1 + " ? " + piano.removePunto(id1));
    System.out.println("Riesco a rimuovere punto " + id6 + " ? " + piano.removePunto(id6));

    piano.stampaPunti();

  }
}
