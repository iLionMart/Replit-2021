import javax.swing.JOptionPane;

public class main{
  public static void main(String [] args){
    Operacion  op = new Operacion();

    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digita un numero:  "));
    double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digita un numero:  "));

    op.sumar(n1, n2);
    op.restar(n1, n2);
    op.multiplicar(n1, n2);
    op.dividir(n1, n2);

    op.imprimirResultado();
  }
}
