package com.viktor;

public class Cat {

    public String address;
    protected String address2;
    private String name;
    private int age;
    private static String color;

    //this is constructor which will send all the nessasary variables to the objects
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(){
    }

    public Cat(String color, int age){
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public void callFactorial(int a) throws Exception{ //will work with exception in the upper level in MainClass
//        return methods.factorial(a);
//    }
}
