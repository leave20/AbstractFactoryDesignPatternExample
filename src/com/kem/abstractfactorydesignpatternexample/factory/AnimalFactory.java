package com.kem.abstractfactorydesignpatternexample.factory;

import com.kem.abstractfactorydesignpatternexample.entity.Animal;
import com.kem.abstractfactorydesignpatternexample.entity.Dog;
import com.kem.abstractfactorydesignpatternexample.entity.Duck;

public class AnimalFactory  implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}
