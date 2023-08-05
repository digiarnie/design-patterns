package com.digiarnie.designpatterns.strangler;

/**
 * The strangler pattern was invented by Martin Fowler.
 * It is a migration pattern used to migrate (strangle) from
 * monolith applications to microservices.
 *
 * The steps to migrate to microservices is as follows:
 * (1) Build the strangler facade: it acts as the middle-man between the client and the old-new systems
 * (2) Identify ONE functionality that can be separated and move to the microservice.
 *     Build the microservice to satisfy this one functionality.
 * (3) The facade will have the smarts to route the traffic to either the existing monolith
 *     or the new microservice.
 * (4) Repeat steps 2-3 until the monolith dies. i.e. "strangle" the old system which takes over the
 *     functionality of the monolith.
 *
 */
public class StranglerFacade {
    private final BillingMicroservice billingMicroservice = new BillingMicroservice();
    private final BillingPrinter printer = new BillingPrinter();
    private final boolean isFeatureFlagOn;

    public StranglerFacade(boolean isFeatureFlagOn) {
        this.isFeatureFlagOn = isFeatureFlagOn;
    }

    public void doBilling1() {
        if (isFeatureFlagOn) {
            billingMicroservice.doBilling1();
        } else {
            printer.doBillingPrintln(1);
        }
    }

    public void doBilling2() {
        printer.doBillingPrintln(2);
    }

    public void doBilling3() {
        printer.doBillingPrintln(3);
    }
}
