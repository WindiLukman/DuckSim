package com.company;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour = new QuackWithBeak();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a Mallard Duck!");
    }
}
