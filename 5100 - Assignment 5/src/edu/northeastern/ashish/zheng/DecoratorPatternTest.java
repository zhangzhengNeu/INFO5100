package edu.northeastern.ashish.zheng;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();
        SportsCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}

//o/p:
//        Basic Car. Adding features of Sports Car.
//
//        Basic Car. Adding features of Luxury Car. Adding features of Sports Car.
//
