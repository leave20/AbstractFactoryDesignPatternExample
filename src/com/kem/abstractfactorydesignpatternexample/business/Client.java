package com.kem.abstractfactorydesignpatternexample.business;

import com.kem.abstractfactorydesignpatternexample.entity.Animal;
import com.kem.abstractfactorydesignpatternexample.entity.Color;
import com.kem.abstractfactorydesignpatternexample.factory.AbstractFactory;
import com.kem.abstractfactorydesignpatternexample.provider.FactoryProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese la opción que desee interactuar: \"Animal\"" + "o" + "\"Color\"");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option = br.readLine();
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory abstractFactory;
        abstractFactory = factoryProvider.getFactory(option);
        if (option.equals("Animal")) {
            System.out.println("Usted ingresó al area "+option);
            System.out.println("Seleccione el animal \"Duck\", \"Dog\" or \"Bear\"");
            String type = br.readLine();
            Animal animal = (Animal) abstractFactory.create(type);
            System.out.println("The " + animal.getAnimal() + " makes " + animal.makeSound());
        }else if (option.equals("Color")){
            System.out.println("Usted ingresó al area "+option);
            System.out.println("Seleccione un color \"Brown\", \"White\" or \"Black\"");
            String type = br.readLine();
            Color color = (Color) abstractFactory.create(type);
            System.out.println("Selected color " + color.getColor());
        }
    }
}
