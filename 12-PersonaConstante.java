public class PersonaConstante{
 private int edad;
 private final String nombre;
 private final int numControl;

 public PersonaConstante (String nombre, int numControl, int edad){
   this.nombre = nombre;
   this.numControl = numControl;
   this.edad = edad;
 }

 public void mostrarDatos(){
   System.out.println("Numero de control " + this.numControl);
   System.out.println("Nombre del alumno: " + nombre);
   System.out.println("Edad del alumno " + edad);
 }

 public void setEdad(int edad){
   this.edad = edad;
 }

 public int getEdad(){
   return(edad);
 }

 public String getNombre(){
   return(nombre);
 }

 public int getNumControl(){
   return(numControl);
 }
}