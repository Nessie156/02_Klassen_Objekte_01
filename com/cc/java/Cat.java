package com.cc.java;

public class Cat {
    
    public String name;
    public String furColor;
    public int age;


    // this -- Instanzvariable
    public String tellYourAddress() {
       return "Blick von innen: " + this;
    }

    public String tellYourName() {
        return this.name;  
    }

    public String tellYourFurColor() {
        return this.furColor;
    }

    public int tellYourAge() {
        return this.age;
    }


    public void changeName(String name) {
        this.name = name;
    }

    public void changeFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void changeAge(int age) {
        this.age = age;
    }




}
