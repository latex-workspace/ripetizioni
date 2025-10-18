package com.mycompany.app;

import com.mycompany.cartella2.Class2;

public class Main {

  public static void main(String[] args) {

    // Class2 class2 = new Class2();
    // class2.publicInt = 5;
    // class2.privateInt = 5;
    // class2.protectedInt = 5;

    Car myCar = new Car("red", "fiat");
    // Car myCar = new Car();

    // myCar.color = "red";
    // myCar.model = "Toyota";

    System.out.println("My car is a " + myCar.color + " " + myCar.model);
    System.out.println("My car speed is " + myCar.getSpeed() + " km/h");

  }

}

class Car {

  private String color;
  private String model;

  public Car(String color, String model) {
    // System.out.println("Car created");
    // for (int i = 0; i < 15; i++) {
    // System.out.print(i);
    // }
    // System.out.println(color);
    this.color = color;
    this.model = model;
  }

  int getSpeed() {
    return 42;
  }

  private int privateFunction() {
    return 42;
  }
}
