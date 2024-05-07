import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce los numeros a promediar");
    int PromNum = sc.nextInt();
    System.out.println("Introduce el valor del numero 1");
    int Num1 = sc.nextInt();
    System.out.println("Introduce el valor del numero 2");
    int Num2 = sc.nextInt();
    System.out.println("Introduce el valor del numero 3");
    int Num3 = sc.nextInt();

    double Promedio = (Num1 + Num2 + Num3 / PromNum);

    System.out.print("El promedio de los numeros es: " + Promedio);
  }
}
