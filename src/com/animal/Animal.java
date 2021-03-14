package com.animal;

import com.food.Food;

import java.util.Objects;

public abstract class Animal {
    protected int food = 0;
    public abstract void eat(Food food);
    protected int size;


    protected String name;
    Animal(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return food == animal.food && size == animal.size && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, size, name);
    }
}
