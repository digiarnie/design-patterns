package com.digiarnie.designpatterns.factory;

/**
 * This pattern is used to create objects based on a common interface. This means that clients of the factory
 * can create the objects without knowing the exact type of object that will be created.
 *
 * Let's say your company takes orders for vehicles and the order specifies the type of vehicle which can be
 * a car, truck or bus. The client can call this factory class with the type of vehicle which will return
 * the requested vehicle.
 */
public class VehicleFactory {

    public Vehicle build(VehicleType type) {
        if (type == VehicleType.CAR) return new Car();
        if (type == VehicleType.TRUCK) return new Truck();
        if (type == VehicleType.BUS) return new Bus();
        throw new IllegalArgumentException("" + type);
    }
}
