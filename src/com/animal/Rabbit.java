package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.interfaces.Run;

public class Rabbit extends Herbivore implements Run {

    public Rabbit(String name) {
        super(name, 2);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Grass) {
                this.food += 3;
                System.out.println("Rabbit is eating");
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
        System.out.println("Rabbit is running");
    }

    @Override
    public void jump() {
        System.out.println("Rabbit jumping");
    }

    @Override
    public void sneak() {
        System.out.println("Rabbit sneaking");
    }
}
