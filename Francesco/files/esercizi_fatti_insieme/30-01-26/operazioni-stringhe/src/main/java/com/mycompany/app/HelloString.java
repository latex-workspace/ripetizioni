package com.mycompany.app;

/**
 * HelloString
 */
public class HelloString {

  public static void run() {
    System.out.println("Hello World!");
    // String a = new String("abc");
    String a = new String("word1   ,word2,   word3");
    System.out.println(a.replaceFirst("word", "x"));

    // String splitParts[] = a.split("\s*,\s*");
    // for (String parts : splitParts) {
    // System.out.println(parts);
    // }
    //
    // String joined = String.join("", splitParts);
    // System.out.println(joined);
    //
    // String nonTrimmed = " ciao \t\n ";
    // System.out.println("Trimmed: '" + nonTrimmed.trim() + "'");
    //
    // System.out.println(a.contains("abc"));
    // System.out.println(a.lastIndexOf('a'));
    // System.out.println(a.indexOf("bab"));

    // String b = new String("aaa");

    // ArrayList<String> v = new ArrayList<>(Arrays.asList("Marco", "Luca",
    // "Matteo"));
    // v.sort((s1, s2) -> s1.compareTo(s2));
    // System.out.println(v);
    // System.out.println("Compare to: " + a.compareTo(b));
  }

}
