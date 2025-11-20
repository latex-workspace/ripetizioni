package com.mycompany.app;

import java.util.Random;

class Game {
  private int rounds;
  private float totalScore = 0;

  public Game(int rounds) {
    this.rounds = rounds;
  }

  private Ball drawRandomBall() {
    Random random = new Random();

    Color[] colors = Color.values();
    Color randomColor = colors[random.nextInt(colors.length)];

    int randomNumber = random.nextInt(9) + 1; // Numeri da 1 a 9

    return new Ball(randomColor, randomNumber);
  }

  private float playRound(int roundNumber) {
    System.out.println("-------------------------------------------------------------");
    System.out.println("Round " + roundNumber + ". Inserisci una previsione");

    String colorString;
    Color userColor = null;
    System.out.println("Colore [RED|GREEN|YELLOW]: ");

    colorString = Main.scanner.nextLine();
    System.out.println("Colorstering: " + colorString);
    userColor = Color.fromString(colorString);

    while (userColor == null) {
      System.out.println("Colore '" + colorString + "' non valido! Inserisci un colore valido [RED|GREEN|YELLOW]: ");
      colorString = Main.scanner.nextLine();
      userColor = Color.fromString(colorString);
    }

    int n = -1;
    System.out.println("Inserisci un numero [1 - 9]: ");
    n = Main.scanner.nextInt();
    Main.scanner.nextLine();

    while (n < 1 || n > 10) {
      System.out.println("Il numero deve essere compreso fra 1 e 10. Inserisci un numero valido");
      n = Main.scanner.nextInt();
      Main.scanner.nextLine();
    }

    Ball userBall = new Ball(userColor, n);
    Ball randomBall = this.drawRandomBall();

    float roundScore = 0;

    if (userBall.getColor() == randomBall.getColor())
      roundScore += 1.0;
    if (userBall.getColor() == randomBall.getColor() && userBall.getNumber() == randomBall.getNumber())
      roundScore += 1.0;

    roundScore += (1.0 - Math.abs(userBall.getNumber() - randomBall.getNumber()) / 8.0) * 4.0;

    System.out.println("Scommessa:  " + userBall.getColor() + "\t" + userBall.getNumber());
    System.out.println("Estrazione: " + randomBall.getColor() + "\t" + randomBall.getNumber());

    return roundScore;
  }

  public void play() {
    for (int i = 0; i < this.rounds; i++) {
      float roundScore = playRound(i + 1);
      System.out.println("Punteggio round: " + roundScore);
      this.totalScore += roundScore;
    }

    System.out.println("Punteggio totale: " + this.totalScore);
  }
}
