
class prova3 {

  public static void main(String[] args) {
    int vett[] = {};
    System.out.println(Algoritmi.max(vett));
  }

}

class Algoritmi {
  static int max(int vett[]) {
    
    if(vett.length == 0){
      System.out.println("Vettore vuoto, errore");
      return -1;
    }

    int max = vett[0];
    for (int i = 0; i < vett.length; i++) {
      if (vett[i] > max) {
        max = vett[i];
      }
    }

    return max;
  }
}
