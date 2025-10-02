
class esempio3 {
  public static void main(String[] args) {
    System.out.println(sumUpTo(10));
  }

  public static int sumUpTo(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++)
      sum += i;

    return sum;
  }
}
