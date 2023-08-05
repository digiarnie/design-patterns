package com.digiarnie.designpatterns.factory;

public class Bus implements Vehicle {

    @Override
    public int getCost() {
        return 50_000;
    }
}
