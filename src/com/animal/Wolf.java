package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.food.Meat;
import com.interfaces.Run;
import com.interfaces.Swim;
import com.interfaces.Voice;

public class Wolf extends Carnivorous implements Run, Swim, Voice {

    public Wolf(String name) {
        super(name, 4);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Meat) {
                this.food += 5;
                System.out.println("Wolf is eating");
            }
            else
                throw new WrongFoodException();

        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.food -= 2;
        System.out.println("Wolf is running");
    }

    @Override
    public void swim() {
        this.food -= 2;
        System.out.println("Wolf is swimming");
    }

    @Override
    public String voice() {
        return "Wolf says Awoooo";
    }

    @Override
    public void jump() {
        System.out.println("Wolf jumping");
    }

    @Override
    public void sneak() {
        System.out.println("Wolf sneaking");
    }

    @Override
    public void crouch() {
        System.out.println("Wolf crouching");
    }

    @Override
    public void roar() {
        System.out.println("Wolf roar");
    }
}
