public class Main{
  public static void main(String [] args){
    PersonaSobrecarga per1 = new PersonaSobrecarga ("Gustavo" , 48);
    PersonaSobrecarga per2 = new PersonaSobrecarga("HESG640819HGTRNSA4");

    per1.correr();
    per2.correr(65);
    per2.correr();
  }
}
