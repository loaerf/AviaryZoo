package com.animal;

import com.aviary.WrongFoodException;
import com.food.Food;
import com.food.Grass;
import com.interfaces.Fly;
import com.interfaces.Run;
import com.interfaces.Swim;
import com.interfaces.Voice;

public class Duck extends Herbivore implements Voice, Fly, Run, Swim {

    public Duck(String name) {
        super(name,2);
    }

    @Override
    public void eat(Food food) {
        try {
            if(food instanceof Grass) {
                this.food += 3;
                System.out.println("Duck is eating");
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
    public void fly() {
        this.food -= 2;
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        this.food -= 2;
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        this.food -= 2;
        System.out.println("Duck is swimming");
    }

    @Override
    public String voice() {
        return "Duck says Gak Gak";
    }

    @Override
    public void glide() {
        System.out.println("Duck gliding");
    }

    @Override
    public void jump() {
        System.out.println("Duck jumping");
    }

    @Override
    public void dive() {
        System.out.println("Duck diving");
    }
}
