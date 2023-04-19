package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();
        output("Blick von aussen: " + cat1);
        output(cat1.tellYourAddress());

        output("--------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress());


    }

    public static void output(String outStr) {
      System.out.println(outStr);
    }
   
  

}

