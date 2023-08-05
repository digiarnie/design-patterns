package com.digiarnie.designpatterns.facade;

/**
 * A facade is a class that abstracts the complexities of an underlying system by exposing a simpler interface
 * for clients to interact with.
 */
public class Facade {
    private final ComplexService1 complexService1 = new ComplexService1();
    private final ComplexService2 complexService2 = new ComplexService2();
    private final ComplexService3 complexService3 = new ComplexService3();

    public void doComplexTask() {
        complexService1.doComplexTask1();
        complexService2.doComplexTask2();
        complexService3.doComplexTask3();
    }
}
