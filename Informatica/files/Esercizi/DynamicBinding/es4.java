public class es4 {
    public static void main(String[] args) {
        A obj = new B();
        obj.m(new D());
    }
}
class A {
    void m(C c) { System.out.println("g"); }
}
class B extends A {
    void m(C c) { System.out.println("h"); }
    void m(D c) { System.out.println("i"); }
}
class C { }
class D extends C { }
