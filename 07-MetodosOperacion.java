import java.util.Scanner;
public class Operacion{
  double suma, resta, multi, divi;

  public void sumar(double numero1, double numero2){
    suma = numero1 + numero2;
  }

  public void restar(double numero1, double numero2){
    resta = numero1 - numero2;
  }

  public void multiplicar(double numero1, double numero2){
    multi = numero1 * numero2;
  }

  public void dividir(double numero1, double numero2){
    divi = numero1 / numero2;
  }

  public void imprimirResultado(){
    System.out.println("La suma es" + suma);
    System.out.println("La resta es" + resta);
    System.out.println("La multiplicacion es" + multi);
    System.out.println("La division es" + divi);
    System.out.println("**********************************");
  }
}
