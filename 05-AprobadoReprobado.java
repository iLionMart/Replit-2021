import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la calificacion del alumno");
    int Calificacion = sc.nextInt();

    if (Calificacion >= 6)
    {
      System.out.print("El alumno aprobo");
    }
    else
    {
      System.out.print("El alumno reprobo");
    }
  }
}
