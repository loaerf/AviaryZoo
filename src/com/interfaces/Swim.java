package com.interfaces;

public interface Swim {
    public void swim();

    default public void dive() {
        System.out.println("diving");
    }

}
