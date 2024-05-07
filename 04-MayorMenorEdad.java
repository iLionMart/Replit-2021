import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce la edad de la persona");
     int Edad = sc.nextInt();

     if (Edad > 18) 
       {
         System.out.print("Esta persona es mayor de edad");
       }
       else
       {
         System.out.print("Esta persona no es mayor de edad");
       }
  }
}
