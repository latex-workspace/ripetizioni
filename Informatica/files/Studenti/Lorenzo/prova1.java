
class prova1 {
  public static void main(String[] args) {
    Persona p = new Persona("nome", 12);
    Persona p1 = new Persona("nome1", 15);


    System.out.println(p);
    System.out.println(p1);


  }
}

class Persona {
  private String nome;
  int eta;

  Persona(String nome, int eta) {
    this.nome = nome;
    this.eta = eta;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return nome;
  }

  public String toString() {
    return nome + " " + eta;
  }

  

}
