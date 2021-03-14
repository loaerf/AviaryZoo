package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.food.Meat;
import com.interfaces.Run;
import com.interfaces.Swim;
import com.interfaces.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    public Tiger(String name) {
        super(name, 4);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Meat) {
                this.food += 5;
                System.out.println("Tiger is eating");
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
        System.out.println("Tiger is running");
    }

    @Override
    public void swim() {
        this.food -= 2;
        System.out.println("Tiger is swimming");
    }

    @Override
    public String voice() {
        return "Tiger says Rrrrrrrrrr";
    }

    @Override
    public void roar() {
        System.out.println("Rrrrrrrrrrrr");
    }

    @Override
    public void jump() {
        System.out.println("Tiger jumping");
    }

    @Override
    public void sneak() {
        System.out.println("Tiger sneaking");
    }

    @Override
    public void crouch() {
        System.out.println("Tiger crouching");
    }



}
