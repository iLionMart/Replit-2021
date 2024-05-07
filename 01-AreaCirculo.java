import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el radio del circulo");
    int radio = sc.nextInt();

    double pi = (Math.PI);  
    double Area = (pi * radio * radio);

    System.out.print("El area del circulo es: " + Area);
  }
}
