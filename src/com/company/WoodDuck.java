package com.company;

public class WoodDuck extends Duck{

    public WoodDuck() {
        quackBehaviour = new QuackNoWay();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a Wood duck!");
    }
}
