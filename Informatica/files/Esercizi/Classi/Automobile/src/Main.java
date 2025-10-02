import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // Targa t1 = new Targa("ab-1234-cd");
    // Targa t2 = new Targa("ac-1234-cd");
    //
    // Targa t3 = Targa.generateRandom();
    // Targa t4 = Targa.generateRandom();
    //
    // Targa.printAll();

    Auto Auto1 = new Auto("Model S", "Tesla", 100, 80000, 2200, new Targa("ab-1234-cd", true));
    Auto Auto2 = new Auto("Mustang", "Ford", 5000, 55000, 1800, new Targa("ef-5678-gh", true));
    Auto Auto3 = new Auto("Civic", "Honda", 2000, 25000, 1500, new Targa("ij-9101-kl", true));
    Auto Auto4 = new Auto("911", "Porsche", 3000, 100000, 1600, new Targa("mn-1213-op", true));
    Auto Auto5 = new Auto("A4", "Audi", 2500, 40000, 1700, new Targa("qr-1415-st", true));
    Auto Auto6 = new Auto("Panda 4x4", "Fiat", 1300, 18000, 1200, new Targa("uv-1617-wx", true));
    Auto Auto7 = new Auto("Mini Cooper", "Mini", 1600, 28000, 1300, new Targa("yz-1819-ab", true));
    Auto Auto8 = new Auto("Yaris", "Toyota", 1500, 20000, 1100, new Targa("cd-2021-ef", true));
    Auto Auto9 = new Auto("Clio", "Renault", 1400, 19000, 1150, new Targa("gh-2324-ij", true));
    Auto Auto10 = new Auto("Corsa", "Opel", 1400, 18000, 1100, new Targa("kl-2526-mn", true));
    Auto Auto11 = new Auto("F-Pace", "Jaguar", 2000, 65000, 2100, new Targa("op-2728-qr", true));
    Auto Auto12 = new Auto("XC90", "Volvo", 3000, 70000, 2200, new Targa("st-2930-uv", true));
    Auto Auto13 = new Auto("Q7", "Audi", 4500, 75000, 2400, new Targa("wx-3132-yz", true));
    Auto Auto14 = new Auto("Cayenne", "Porsche", 4000, 90000, 2300, new Targa("ab-3334-cd", true));
    Auto Auto15 = new Auto("Tiguan", "Volkswagen", 2000, 35000, 1800, new Targa("ef-3536-gh", true));

    ArrayList<Auto> tutte = new ArrayList<>();
    tutte.add(Auto1);
    tutte.add(Auto2);
    tutte.add(Auto3);
    tutte.add(Auto4);
    tutte.add(Auto5);
    tutte.add(Auto6);
    tutte.add(Auto7);
    tutte.add(Auto8);
    tutte.add(Auto9);
    tutte.add(Auto10);
    tutte.add(Auto11);
    tutte.add(Auto12);
    tutte.add(Auto13);
    tutte.add(Auto14);
    tutte.add(Auto15);

    for (Auto auto : tutte) {
      System.out.println(auto);
      System.out.println();
    }

  }
}
