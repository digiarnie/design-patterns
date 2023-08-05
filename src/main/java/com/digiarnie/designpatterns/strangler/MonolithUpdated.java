package com.digiarnie.designpatterns.strangler;

public class MonolithUpdated {
    private final StranglerFacade facade;

    public MonolithUpdated(boolean isFeatureFlagEnabled) {
        this.facade = new StranglerFacade(isFeatureFlagEnabled);
    }

    // Billing boundary
    public void doBilling1() {
        facade.doBilling1();
    }

    public void doBilling2() {
        facade.doBilling2();
    }

    public void doBilling3() {
        facade.doBilling3();
    }

    // Ordering boundary
    public void testOrder1() {}

    public void testOrder2() {}

    public void testOrder3() {}
}
