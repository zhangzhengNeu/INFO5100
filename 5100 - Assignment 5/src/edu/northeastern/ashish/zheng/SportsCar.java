package edu.northeastern.ashish.zheng;

public class SportsCar extends CarDecorator{
    public SportsCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Sports Car.");
    }
}
