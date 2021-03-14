package com.interfaces;

public interface Fly {
    public void fly();

    default public void glide() {
        System.out.println("gliding");
    }
}
