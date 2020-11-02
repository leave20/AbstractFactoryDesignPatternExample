package com.kem.abstractfactorydesignpatternexample.entity;

public class Dog implements Animal{

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Guau";
    }
}
