package com.company;

public class MoscovyDuck extends Duck{

    public MoscovyDuck() {
        quackBehaviour = new QuackNoWay();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a Moscovy duck!");
    }
}
