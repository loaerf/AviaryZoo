package com.aviary;

import com.food.Food;

public class WrongFoodException extends Throwable{
    public WrongFoodException() {
        super ("Food is wrong");
    }
}
