package com.digiarnie.designpatterns.factory;

public class Truck implements Vehicle {

    @Override
    public int getCost() {
        return 100_000;
    }
}
