package com.aviary;

import com.animal.Animal;
import com.animal.Carnivorous;
import com.animal.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<H extends Animal> {

    int count;

    private String firstAnimal;
    private Map<String, H> animals;
    private AviarySize size;

    public Aviary(AviarySize size) {
        count = 0;
        animals = new HashMap<>();
        this.size = size;
    }

    public void add(H animal) {
        if (animal.getSize() <= size.getSize() && count < size.getMaxAnimalCount()) {
            if (animals.isEmpty()) {
                firstAnimal = animal.getName();
                animals.put(animal.getName(), animal);
                count++;
                System.out.println(animal.getName() + " added to aviary");
                return;
            }
            Animal anim = animals.get(firstAnimal);
            if(anim instanceof Herbivore && animal instanceof Herbivore) {
                animals.put(animal.getName(), animal);
                count++;
                System.out.println(animal.getName() + " added to aviary");
            }
            else if (anim instanceof Carnivorous && animal instanceof Carnivorous) {
                animals.put(animal.getName(), animal);
                count++;
                System.out.println(animal.getName() + " added to aviary");
            }
            else System.out.println("You can't add different types of animals");
        } else {

            System.out.println("Aviary size is too small or aviary is crowded");
        }

    }

    public void remove(String name) {
        if (animals.remove(name) == null) {
            System.out.println("Animal is null");
        }
            else System.out.println(name + " removed");
        }

    public Animal get(String name) {
        return animals.get(name);
    }

}
