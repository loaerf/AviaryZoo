package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.interfaces.Run;
import com.interfaces.Swim;

public class Tortoise extends Herbivore implements Run, Swim {

    public Tortoise(String name) {
        super(name, 1);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Grass) {
                this.food += 3;
                System.out.println("Tortoise is eating");
            }
            else
                throw new WrongFoodException();
            //System.out.println("Duck can't eat meat");
        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.food -= 2;
        System.out.println("Tortoise is running");
    }

    @Override
    public void swim() {
        this.food -= 2;
        System.out.println("Tortoise is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Tortoise diving");
    }

    @Override
    public void sneak() {
        System.out.println("Tortoise sneaking");
    }
}
