import java.util.Scanner;
class main {
  private static String frase = "Primera frase";
  public static void main(String[] args){
    int op;
    Scanner teclado = new Scanner(System.in);
    System.out.println("1.- Ejecuta Clase Estática");
    System.out.println("2.- Ejecuta Clase con Constantes");
    op = teclado.nextInt();

    if (op == 1){
      Main obj1 = new Main();
      Main obj2 = new Main();

      System.out.println(obj1.frase);
      System.out.println(obj2.frase);
      System.out.println("----------------------------");

      obj2.frase = "Segunda frase";

      System.out.println(obj1.frase);
      System.out.println(obj2.frase);
      System.out.println("****************************");
      Main.frase = "tercera frase";

      System.out.println(obj1.frase);
      System.out.println(Main.frase);
      System.out.println(ClaseEstatico.sumar(4,30));

    }else{
      PersonaConstante per1 = new PersonaConstante("David",335, 12);
      PersonaConstante per2 = new PersonaConstante("Cecilia",565,15);

      per1.mostrarDatos();
      per2.mostrarDatos();

      System.out.println("****************************");

      per1.setEdad(8);

      System.out.println(per1.getNombre() + " tiene " + per2.getEdad() + "años");
      System.out.println("metodo estatico sumar " + ClaseEstatico.sumar(564,646) + " raiz " + Math.sqrt(49));
    }
  }  
}