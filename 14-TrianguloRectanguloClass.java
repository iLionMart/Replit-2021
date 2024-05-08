public class TrianguloRectangulo{
  private int catetoA;
  private int catetoB;
  private double hipotenusaC;


  public TrianguloRectangulo(int catetoA, int catetoB, double hipotenusaC){
    this.catetoA = catetoA;
    this.catetoB = catetoB;
    this.hipotenusaC = hipotenusaC;
  }

  public double getPerimetro(){
    double Perimetro = (catetoA + catetoB + hipotenusaC);
    return Perimetro;
  }

  public double getArea(){
    double Area = ((catetoA * catetoB) / 2);
    return Area;
  }
}