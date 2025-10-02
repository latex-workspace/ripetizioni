import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import Exceptions.*;

class Targa {
  String lhs;
  int center;
  String rhs;

  private static PlateFormat format = new PlateFormat("ll-cccc-ll");
  private static HashSet<Targa> targhe = new HashSet<Targa>();

  private void init(String targa, boolean addToDb) {
    if (!format.check(targa))
      throw new InvalidPlateSerialNumber();

    lhs = targa.substring(0, format.lhsLen);
    center = Integer.valueOf(targa.substring(format.lhsLen + 1, format.lhsLen + format.centerLen + 1));
    rhs = targa.substring(format.lhsLen + format.centerLen + 2);

    if (addToDb) {
      if (targhe.contains(this)) {
        throw new PlateAlreadyExistingException();
      } else
        targhe.add(this);
    }

  }

  public Targa(String targa, boolean addToDb) throws InvalidPlateSerialNumber, PlateAlreadyExistingException {
    init(targa, addToDb);
  }

  public Targa(String targa) {
    init(targa, false);
  }

  private static String generateRandomPlateString() {
    int lhsLen = format.rhsLen, centerLen = format.centerLen, rhsLen = format.rhsLen;

    String lhs = "";
    int center = 0;
    String rhs = "";

    Random r = new Random();
    String letters = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < lhsLen; i++)
      lhs += letters.charAt(r.nextInt(26));
    for (int i = 0; i < rhsLen; i++)
      rhs += letters.charAt(r.nextInt(26));

    int power = 1;
    for (int i = 0; i < centerLen; i++) {
      center += r.nextInt(10) * power;
      power *= 10;
    }

    return lhs + '-' + center + '-' + rhs;
  }

  public static Targa generateRandom() {
    try {
      return new Targa(generateRandomPlateString());
    } catch (Exception e) {
      return generateRandom(); // occhio che è una cosa brutta da vedere
    }
  }

  public static void printAll() {
    for (Targa targa : targhe) {
      System.out.println(targa);
    }
  }

  @Override
  public String toString() {
    return lhs + "-" + center + "-" + rhs;
  }

  @Override
  public boolean equals(Object obj) {
    return ((Targa) obj).toString().equals(this.toString());
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }

}

class PlateFormat {
  private String format = "ll-cccc-ll";
  int lhsLen = 0;
  int centerLen = 0;
  int rhsLen = 0;

  public PlateFormat(String format) throws InvalidPlateSerialNumber {
    this.format = format;

    for (int i = 0; i < format.length() && format.charAt(i) != '-'; i++)
      lhsLen++;
    for (int i = lhsLen + 1; i < format.length() && format.charAt(i) != '-'; i++)
      centerLen++;
    for (int i = lhsLen + centerLen + 2; i < format.length(); i++)
      rhsLen++;
  }

  public boolean check(String targa) throws InvalidPlateSerialNumber {
    if (targa.length() != format.length())
      return false;

    for (int i = 0; i < targa.length(); i++) {
      if (format.charAt(i) == 'l' && !(targa.charAt(i) >= 'a' && targa.charAt(i) <= 'z'))
        return false;
      else if (format.charAt(i) == 'c' && !(targa.charAt(i) >= '0' && targa.charAt(i) <= '9'))
        return false;
      else if (format.charAt(i) == '-' && targa.charAt(i) != '-')
        return false;
    }
    return true;
  }

}
