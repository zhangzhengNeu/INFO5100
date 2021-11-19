package edu.northeastern.ashish.zheng;

public class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public CarDecorator() {}

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
