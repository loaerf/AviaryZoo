package com.interfaces;

public interface Voice {
    public String voice();

    default public void roar() {
        System.out.println("roar");
    }

}
