package com.aviary;

import com.animal.Animal;
import com.animal.Carnivorous;
import com.animal.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<H extends Animal> {

    int count;

    private Map<String, H> animals;
    private AviarySize size;

    public Aviary(AviarySize size) {
        count = 0;
        animals = new HashMap<>();
        this.size = size;
    }

    public void add(H animal) {
        if (animals.isEmpty()) {
            animals.put(animal.getName(), animal);
            count++;
            System.out.println(animal.getName() + " added to aviary");
            return;
        }
        if (animal.getSize() <= size.getSize() && count < size.getMaxAnimalCount()) {
            for (Map.Entry<String, H> entry : animals.entrySet()) {
                Animal anim = entry.getValue();
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
                break;
            }
        } else {

            System.out.println("Aviary size is too small or aviary is crowded");
        }

    }

    public void remove(String name) {
        animals.remove(name);
        System.out.println(name + " removed");
    }

    public Animal get(String name) {
        return animals.get(name);
    }

}
