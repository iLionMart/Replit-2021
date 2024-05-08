import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    TrianguloRectangulo t1;

    int catetoA, catetoB;
    double hipotenusaC;

    System.out.println("Escribe el valor del Cateto A:");
    catetoA = sc.nextInt();
    System.out.println("Escribe el valor del Cateto B:");
    catetoB = sc.nextInt();

    hipotenusaC = Math.sqrt((catetoA ^ 2) + (catetoB ^ 2));

    System.out.println("La hipotenusa es igual a: " + hipotenusaC);

    t1 = new TrianguloRectangulo(catetoA, catetoB, hipotenusaC);

    System.out.println("El perimentro es: " + t1.getPerimetro());
    System.out.println("El area es: " + t1.getArea());
  }
}