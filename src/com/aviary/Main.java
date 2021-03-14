package com.aviary;

import com.Worker;
import com.animal.Carnivorous;
import com.animal.Duck;
import com.animal.Herbivore;
import com.animal.Tiger;
import com.food.Chicken;
import com.food.Meat;

public class Main {

    public static void main(String[] args) {
        Aviary aviary = new Aviary(AviarySize.BIG);
        aviary.add(new Tiger("Kirill"));
        Worker worker = new Worker();
        worker.feed(aviary.get("Kirill"), new Chicken());
        aviary.add(new Duck("Maxim"));



    }

}
