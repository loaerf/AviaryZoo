package com;

import com.animal.*;
import com.food.*;
import com.interfaces.Swim;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        List<Food> food = new ArrayList<>();
        food.add(new Beef());
        food.add(new Oat());
        food.add(new Chicken());
        food.add(new Wheat());
        Worker worker = new Worker();

        List<Animal> list= new ArrayList<>();
        list.add(new Duck("Daniil"));
        list.add(new Fish("kirill"));
        list.add(new Wolf("Maxim"));
        list.add(new Tortoise("Dasha"));
        list.add(new Tiger("Marina"));
        list.add(new Rabbit("Viktor"));

        for(Animal animal: list) {
            for (Food food1: food) {
                worker.feed(animal, food1);
            }
        }

        Duck duck = new Duck("Daniil");
        Fish fish = new Fish("kirill");
        Tiger tiger = new Tiger("Marina");
        Tortoise tortoise = new Tortoise("Dasha");
        Wolf wolf = new Wolf("Maxim");

        worker.getVoice(tiger);
        worker.getVoice(wolf);
        worker.getVoice(duck);

        Swim[] prud = {fish, duck, tortoise};
        for (Swim swim: prud) {
            swim.swim();
        }
    }
}
