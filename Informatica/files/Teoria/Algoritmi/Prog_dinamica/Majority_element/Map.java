import java.util.HashMap;

class Map {
  public static void main(String[] args) {

    HashMap<Integer, String> map = new HashMap<Integer, String>();

    map.put(1, "uno");
    map.put(2, "due");
    map.put(3, "tre");

    System.out.println(map.getOrDefault(5, "aslkjdfa"));

  }
}
