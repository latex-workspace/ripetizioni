import java.util.ArrayList;

class Teo5 {
  public static void main(String[] args) {
    ArrayList<Integer> v = new ArrayList<>();

    System.out.println(v.size());
    v.add(1);
    v.add(2);
    System.out.println(v.size());
    v.add(3);
    v.add(4);
    System.out.println(v.size());
    System.out.println("----------------");

    for (int i = 0; i < v.size(); i++) {
      System.out.println(v.get(i));
    }
    /*
     * float -> Float
     * int -> Integer
     * boolean -> Boolean
     * float []
     * int[]
     * v[i] -> v.get(i)
     * v[i] = x -> v.set(i, x)
     */
  }
}
