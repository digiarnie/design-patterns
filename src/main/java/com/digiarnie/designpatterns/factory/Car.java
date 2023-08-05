package com.digiarnie.designpatterns.factory;

public class Car implements Vehicle {

    @Override
    public int getCost() {
        return 25_000;
    }
}
