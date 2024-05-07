import java.util.Scanner;

class main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el radio del cilindro");
    int radio = sc.nextInt();

    System.out.println("Introduce la altura del cilindro");
    int altura = sc.nextInt();

    double pi = (Math.PI);  
    double Area = (pi * radio * radio);

    System.out.print("El area del cilindro es: " + Area);

    double Volumen = (Area * altura);

    System.out.print("El volumen del cilindro es: " + Volumen);
  }
}
