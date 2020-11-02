package com.kem.abstractfactorydesignpatternexample.factory;

import com.kem.abstractfactorydesignpatternexample.entity.*;

public class ColorFactory implements AbstractFactory{
    @Override
    public Object create(String colorType) {
        if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }else if ("Brown".equalsIgnoreCase(colorType)){
            return new Brown();
        }else if ("Black".equalsIgnoreCase(colorType)){
            return new Black();
        }
        return null;
    }
}
