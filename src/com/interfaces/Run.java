package com.interfaces;

public interface Run {
    public void run();

    default public void jump() {
        System.out.println("jumping");
    }
    default public void sneak() {
        System.out.println("sneaking");
    }
    default public void crouch() {
        System.out.println("crouching");
    }
}
