package com.kem.abstractfactorydesignpatternexample.provider;

import com.kem.abstractfactorydesignpatternexample.factory.AbstractFactory;
import com.kem.abstractfactorydesignpatternexample.factory.AnimalFactory;
import com.kem.abstractfactorydesignpatternexample.factory.ColorFactory;

public class FactoryProvider {
    public  AbstractFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        }else if ("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
