import java.util.ArrayList;

class Teo2 {
  public static void main(String[] args) {
    int v[] = new int[40];
    //v[40] = 10;

    ArrayList<Integer> al = new ArrayList<Integer>(5);


   // System.out.println(al.size());
    al.add(1);
   // System.out.println(al.size());
    al.add(2);
  //  System.out.println(al.size());
    al.add(3);
 //   System.out.println(al.size());

  
    al.remove(1);

    for(int i = 0; i<al.size(); i++){
      System.out.println(al.get(i));
    }

    // for(int i = 0; i<v.length; i++){
    //   System.out.println(v[i]);
    // }

  }
}

class MyInt {
  private int x;

  public MyInt(int x) {
    this.x = x;
  }

}
