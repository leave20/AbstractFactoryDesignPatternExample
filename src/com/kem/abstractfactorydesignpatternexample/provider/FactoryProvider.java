package com.kem.abstractfactorydesignpatternexample.provider;

import com.kem.abstractfactorydesignpatternexample.factory.AbstractFactory;
import com.kem.abstractfactorydesignpatternexample.factory.AnimalFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
    if ("Animal".equalsIgnoreCase(choice)){
return new AnimalFactory();
    }
    return null;
}
}
