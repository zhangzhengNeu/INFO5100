package edu.northeastern.ashish.zheng;

public class CarDecorator implements ICar{
    ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    public CarDecorator() {}

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
