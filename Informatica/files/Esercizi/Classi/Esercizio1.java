public class Esercizio1 {
  static int x = 15;
    public static void main(String[] args) {
        A a = new A();
        a.stampaX(5);
    }
}
class A{
    int x = 0;
    void stampaX(int x){
        System.out.println(x);
    }
}

