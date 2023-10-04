package com.company;

public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();

        MoscovyDuck moscovyDuck = new MoscovyDuck();
        moscovyDuck.display();
        moscovyDuck.performFly();
        moscovyDuck.performQuack();
        moscovyDuck.swim();

        PekinDuck pekinDuck = new PekinDuck();
        pekinDuck.display();
        pekinDuck.performFly();
        pekinDuck.performQuack();
        pekinDuck.swim();
    }
}
