package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat("Grizabella", "white", 29);
   
        // Ausgabe
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));

        output("--------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));


    }

    private static void output(String outStr) {
      System.out.println(outStr);
    }
   
  

}

