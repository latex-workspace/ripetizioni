import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * SommaEMedia
 */
public class array {

  public static void main(String[] args) throws FileNotFoundException, IOException {

    Scanner scan = new Scanner(new File("input.txt"));
    // Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();

    int sum = 0;

    for (int i = 0; i < N; i++) {
      sum += scan.nextInt();
    }

    FileWriter fw = new FileWriter("output.txt");

    fw.write(sum + " " + (float) sum / N);

    fw.close();
    scan.close();

  }

}
