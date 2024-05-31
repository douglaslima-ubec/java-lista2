package edu.animal;

import edu.animal.Animal;
import edu.animal.canine.Dog;
import edu.animal.feline.Cat;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println("A cat sounds like: ");
        cat.makeSound();

        Animal dog = new Dog();
        System.out.println("A dog sounds like: ");
        dog.makeSound();
    }

}