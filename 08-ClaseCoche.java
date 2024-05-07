class main {
    public static void main(String [] args){
      Coche coche1 = new Coche();
      Coche miCoche = new Coche();

      coche1.color = "Negro";
      coche1.marca = "Nisan";
      coche1.modelo = "Armada";
      coche1.km = 15000;

      miCoche.color = "Verde";
      miCoche.marca = "Ferrari";
      miCoche.modelo = "F8 Spider";
      miCoche.km = 20000;
      coche1.imprimeColor();

      System.out.println ("-----------------------------------------")
      coche1.imprimirInfo();
      System.out.println("-----------------------------------------");miCoche.imprimirInfo();
      }
      public void coche2()
      {
        Coche coche2 = new Coche();

        coche2.color = "Negro";
        coche2.marca = "Nisan";
        coche2.modelo = "Armada";
        coche2.km = 15000;
        System.out.println ("-----------------------------------------")
        coche2.imprimeInfo();
      }
    }
