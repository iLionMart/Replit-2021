import java.util.Scanner;
public class main{
  public static void main(String[] args){
    String nombre;
    Scanner teclado = new Scanner(System.in);

    Encapsula objeto1 = new Encapsula();
    System.out.println("Dime el nombre del alumno");
    nombre = teclado.nextLine();

    objeto1.setEdad(194450);
    objeto1.setAlumno(nombre);
    System.out.println("El alumno se llama: " + objeto1.getAlumno());

    System.out.println("su edad es: " + objeto1.getEdad());
  }
}