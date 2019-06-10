package com.AbstractFactory;



public class CarDesign {
    public static void main(String[] args) {
        Car c=CarFactory.buildCar(Model.luxury);

    }
}
