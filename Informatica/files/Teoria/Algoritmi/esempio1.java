class esempio1 {
  public static void main(String[] args) {
    int v[] = { 1, 2, 3, 5, 2, 9, 11, -1 };
    System.out.println(massimo(v));
  }

  public static int massimo(int v[]) {
    int max = v[0];
    for (int i = 1; i < v.length; i++) {
      if (max < v[i])
        max = v[i];
    }

    return max;
  }
}
