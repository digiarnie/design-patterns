package com.digiarnie.designpatterns.strangler;

import org.junit.jupiter.api.Test;

public class StranglerFacadeTest {

    @Test
    public void testWithFeatureFlagOff() {
        MonolithUpdated subject = new MonolithUpdated(false);
        subject.doBilling1();
        subject.doBilling2();
        subject.doBilling3();
    }

    @Test
    public void testWithFeatureFlagOn() {
        MonolithUpdated subject = new MonolithUpdated(true);
        subject.doBilling1();
        subject.doBilling2();
        subject.doBilling3();
    }
}
