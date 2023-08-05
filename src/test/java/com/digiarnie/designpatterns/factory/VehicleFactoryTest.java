package com.digiarnie.designpatterns.factory;

import org.junit.jupiter.api.Test;

public class VehicleFactoryTest {
    private final VehicleFactory subject = new VehicleFactory();

    @Test
    public void buildVehiclesAndGetCosts() {
        printVehicleCost(VehicleType.CAR);
        printVehicleCost(VehicleType.BUS);
        printVehicleCost(VehicleType.TRUCK);
        printVehicleCost(VehicleType.FLYING_SAUCER);
    }

    private void printVehicleCost(VehicleType type) {
        Vehicle vehicle = subject.build(type);
        System.out.println(type + " costs $" + vehicle.getCost());
    }
}
