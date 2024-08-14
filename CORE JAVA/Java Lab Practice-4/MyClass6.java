package LabPracticeiv;

abstract class Animal {
    abstract void move();
    abstract void makeSound();
}
class Bird extends Animal { 
    void move() {
        System.out.println("The bird flies through the sky.");
    }
    void makeSound() {
        System.out.println("The bird chirps melodiously: Tweet Tweet!");
    }
}

class Panthera extends Animal {
    void move() {
        System.out.println("The panther moves stealthily on the ground.");
    }
    void makeSound() {
        System.out.println("The panther roars powerfully: Roar Roar!");
    }
}

public class MyClass6 {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.move();
        bird.makeSound();

        Animal panthera = new Panthera();
        panthera.move();
        panthera.makeSound();
    }
}
