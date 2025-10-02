import java.util.Random;

class SubsequenceIneff {
  public static int n = 100000;
  public static int times = 100;

  public static void main(String[] args) {

    Random r = new Random();

    for (int i = 0; i < times; i++) {
      int v[] = new int[n];
      for (int j = 0; j < n; j++) {
        v[j] = r.nextInt(-10000, 10000);
      }
      //System.out.println(subsequenceIneff(v));
      System.out.println(subsequenceEff(v));
    }

  }

  public static int subsequenceEff(int v[]) {

    int prev_cell = 0;
    int max = 0;

    for (int i = 0; i < v.length; i++) {
      prev_cell = Math.max(prev_cell + v[i], 0);
      if (max < prev_cell)
        max = prev_cell;
    }

    return max;

  }

  public static int subsequenceIneff(int v[]) {

    int max = 0;

    for (int i = 0; i < v.length; i++) {

      int currSum = 0;
      for (int j = i; j >= 0; j--) {
        currSum += v[j];
        if (currSum > max)
          max = currSum;
      }

    }

    return max;

  }
}
