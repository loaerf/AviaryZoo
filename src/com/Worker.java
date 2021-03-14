package com;

import com.animal.Animal;
import com.food.Food;
import com.interfaces.Voice;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public void getVoice(Voice voice) {
        System.out.println(voice.voice());
    }

}
