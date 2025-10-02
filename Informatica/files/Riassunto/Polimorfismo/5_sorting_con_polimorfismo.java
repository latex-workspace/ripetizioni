import java.util.ArrayList;
import java.util.Comparator;

class Main {
  public static void main(String[] args) {
    ArrayList<A> v = new ArrayList<>();

    v.add(new A(6));
    v.add(new A(1));
    v.add(new A(8));
    v.add(new A(10));
    v.add(new A(-2));

    v.sort(new AComparator());

    for (int i = 0; i < v.size(); i++)
      System.out.println(v.get(i));

  }
}

class A {
  Integer value;

  public A(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "A {" + value + "}";
  }

}

class AComparator implements Comparator<A> {
  @Override
  public int compare(A a1, A a2) {
    return a1.value - a2.value;
    //return Integer.compare((int)a1.value, (int)a2.value);
  }
}
