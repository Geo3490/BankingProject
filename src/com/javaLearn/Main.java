package com.javaLearn;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet", "Camaro", 2021);

        //  example of setter to change outcome
          //  car.setMake("ford");

        System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear());
    }
}