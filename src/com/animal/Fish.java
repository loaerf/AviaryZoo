package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.food.Meat;
import com.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name, 1);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Meat) {
                this.food += 5;
                System.out.println("Fish is eating");
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
    public void swim() {
        this.food -= 2;
        System.out.println("Fish is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Fish diving");
    }
}
