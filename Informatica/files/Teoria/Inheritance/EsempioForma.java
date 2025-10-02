/**
 * EsempioForma
 */
public class EsempioForma {

}

class Forma {

  int borderR = 0, borderG = 0, borderB = 0;
  int fillR = 255, fillG = 255, fillB = 255;
  float perimetro;

}

class FormaTonda extends Forma {

}

class Ovale extends FormaTonda {
  float raggioX;
  float raggioY;

  public Ovale(float raggioX, float raggioY) {
    this.raggioX = raggioX;
    this.raggioY = raggioY;
  }

}

class Cerchio extends Ovale {
  float raggio;

  public Cerchio(float raggio) {
    super(raggio, raggio);
    this.raggio = raggio;
  }

}

class Poligono extends Forma {
  int numeroLati;

  public Poligono(int numeroLati) {
    this.numeroLati = numeroLati;
  }

}

class PoligonoRegolare extends Poligono {
  float lunghezzaLati;

  public PoligonoRegolare(float lunghezzaLati, int numeroLati) {
    super(numeroLati);
    this.lunghezzaLati = lunghezzaLati;
  }

}

class Quadrato extends PoligonoRegolare {
  float lato;

  public Quadrato(float lato) {
    super(lato, 4);
    this.lato = lato;
  }

}
