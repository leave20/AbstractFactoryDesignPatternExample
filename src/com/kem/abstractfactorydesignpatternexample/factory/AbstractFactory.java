package com.kem.abstractfactorydesignpatternexample.factory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
