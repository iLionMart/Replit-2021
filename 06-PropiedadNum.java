import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe un numero");
    int Numero = sc.nextInt();

    if (Numero >= 1)
    {
      System.out.print("El numero es positivo" + Numero);
    }
    else
    {
      if (Numero <= -1)
      {
        System.out.print("El numero es negativo" + Numero);
      }
      else
      {
        System.out.print("El numero es cero" + Numero);
      }
    }
  }
}
