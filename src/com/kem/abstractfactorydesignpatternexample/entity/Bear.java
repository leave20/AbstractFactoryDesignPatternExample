package com.kem.abstractfactorydesignpatternexample.entity;

public class Bear implements Animal {
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Raur";
    }
}
