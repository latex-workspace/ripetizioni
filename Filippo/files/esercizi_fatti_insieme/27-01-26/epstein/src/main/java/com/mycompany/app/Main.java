package com.mycompany.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

/**
 * Hello world!
 */
public class Main {

  public static boolean existsAtIndex(String text, String pattern, int index) {
    if (index < 0 || index > text.length() - pattern.length()) {
      return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
      if (text.charAt(index + i) != pattern.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static String censura(String text, List<String> paroleVietate) {
    boolean mask[] = new boolean[text.length()];
    for (int i = 0; i < text.length(); i++)
      mask[i] = false;

    for (int i = 0; i < text.length(); i++) {
      for (String parola : paroleVietate) {
        if (existsAtIndex(text, parola, i)) {
          // Aggiungere alla struttura di output
          for (int j = 0; j < parola.length(); j++)
            mask[i + j] = true;
        }
      }
    }

    // System.out.println("Text: " + text);
    // System.out.print("Mask: ");
    // for (int i = 0; i < mask.length; i++)
    // System.out.print(mask[i] == true ? 'X' : 'O');
    // System.out.println();

    char censoredText[] = new char[text.length()];
    for (int i = 0; i < mask.length; i++)
      censoredText[i] = mask[i] == true ? 'X' : text.charAt(i);

    String result = new String(censoredText);

    return result;
  }

  public static void main(String[] args) {
    String criptFilePath = "files/cript.txt";
    String textFilePath = "files/testo.txt";

    String content;
    List<String> lines;
    try {
      content = new String(Files.readAllBytes(Paths.get(textFilePath)));
      lines = Files.readAllLines(Paths.get(criptFilePath));
    } catch (IOException e) {
      System.out.println("Non riesco a leggere i files: " + e.getMessage());
      return;
    }

    content = content.substring(0, content.length() - 1);

    String censurata = censura(content, lines);
    System.out.println("\"" + censurata + "\"");
    // lettura criptFile

  }

}
