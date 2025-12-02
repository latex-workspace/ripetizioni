package com.mycompany.app;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;

/**
 * Hello world!
 */
public class Main {

  public static Persona getPersona(String nome, String cognome) {

    Random r = new Random();
    Calendar dataNascita = Calendar.getInstance();
    dataNascita.set(r.nextInt(1940, 2005), r.nextInt(0, 12), r.nextInt(1, 28));
    return new Persona(nome, cognome, dataNascita, new Residenza("Roma", "Via Roma", 10),
        new NumeroCellulare(39, 1234567890), new Email("prova@gmail.com"));
  }

  public static void testPerson() {
    Calendar dataNascita = Calendar.getInstance();
    dataNascita.set(1995, Calendar.JULY, 28);

    // System.out.println(dataNascita.getTime());

    Email email = new Email("prova@gmail.com");
    // System.out.println(email);

    NumeroCellulare numeroCellulare = new NumeroCellulare(39, 1234567890);
    // System.out.println(numeroCellulare);

    Residenza residenza = new Residenza("Roma", "Via Roma", 10);
    // +39 1234567890

    Persona persona = new Persona("Mario", "Rossi", dataNascita, residenza, numeroCellulare, email);
    System.out.println(persona);
  }

  public static void testFileSync() throws IOException {
    Party party = new Party(getPersona("nome_organizzatore", "cognome_organizzatore"),
        new Residenza("Milano", "Via Milano", 20));

    party.startFileSync("invitati.txt");

    // party.aggiungiInvitato(getPersona("nome_invitato_1", "cognome_invitato_1"));
    // party.aggiungiInvitato(getPersona("nome_invitato_2", "cognome_invitato_2"));
    //
    // party.stopFileSync();

  }

  public static void main(String[] args) throws IOException {

    testFileSync();

  }
}
