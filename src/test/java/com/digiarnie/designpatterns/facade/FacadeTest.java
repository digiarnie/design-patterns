package com.digiarnie.designpatterns.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {
    // Name the thing being tested subject.
    private Facade subject = new Facade();

    @Test
    public void testFacade() {
        subject.doComplexTask();
    }
}
