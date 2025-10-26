package ooplab.abstraction;

abstract class Animal1 {
    public abstract void eat();
    public abstract void sleep();
}

class Lion1 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps on grassland.");
    }
}
class Tiger1 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
class Deer extends Animal1 {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}
class M3 {
    public static void main(String[] args) {
        Lion1 lion = new Lion1();
        lion.eat();
        lion.sleep();

        System.out.println();

        Tiger1 tiger = new Tiger1();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}