package com.company;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack() {quackBehaviour.quack(); }
    public void swim() {
        System.out.println("Swimming!");
    }
    public void performFly() {
        flyBehaviour.fly();
    }
    public abstract void display();
}
