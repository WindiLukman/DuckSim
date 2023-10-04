package com.company;

public class PekinDuck extends Duck{

    public PekinDuck() {
        quackBehaviour = new QuackWithBeak();
        flyBehaviour = new FlyNoWay();
    }
    public void display() {
        System.out.println("Looks like a Pekin duck!");
    }
}
