package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();
        output("Blick von aussen: " + cat1);
        output(cat1.tellYourAddress());

        // Wertzuweisung
        
        cat1.changeName("Grizabella");
        cat1.changeFurColor("white");
        cat1.changeAge(29);

        // Designschwäche !!!!!
        cat1.furColor = "grey";

        // Ausgabe
        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(Integer.toString(cat1.tellYourAge()));

        output("--------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress());

        // Wertzuweisung
        cat2.changeName("Alonzo");
        cat2.changeFurColor("grey");
        cat2.changeAge(35);

        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(Integer.toString(cat2.tellYourAge()));


    }

    public static void output(String outStr) {
      System.out.println(outStr);
    }
   
  

}

