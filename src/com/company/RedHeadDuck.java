package com.company;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehaviour = new QuackWithBeak();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a Red Head duck!");
    }
}
