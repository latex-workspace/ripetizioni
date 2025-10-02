class esempio2 {
  public static void main(String[] args) {

    int v[] = { 1, 2, 3, 4, 5 };
    System.out.println(cointains(5, v));
    System.out.println(cointains(1, v));
    System.out.println(cointains(-2, v));
  }

  public static boolean cointains(int element, int v[]) {
    for (int i = 0; i < v.length; i++) {
      if (v[i] == element)
        return true;
    }
    return false;
  }
}
