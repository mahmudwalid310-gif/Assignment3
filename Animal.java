package assignment3;


public abstract class Animal {
    abstract void sound();

}

class Lion extends Animal{
    public void sound(){
        System.out.println("Lion roars!");
    }
}
class Tiger extends Animal{
    public void sound() {
        System.out.println("Tiger growls!");
    }
}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();

    }
}
