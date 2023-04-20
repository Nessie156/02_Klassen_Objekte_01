package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    // Custom-Konstruktor
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName() {
        if (checkPermission()) { // Delegation an Methode ...
            return name; 
        } else {
            return "Sorry, no permission!";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    // private, weil call aus der EIGENEN Klasse/Objekt
    private boolean checkPermission() {
        return false;
    }
   



}
