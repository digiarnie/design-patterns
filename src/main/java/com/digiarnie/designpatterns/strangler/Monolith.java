package com.digiarnie.designpatterns.strangler;

public class Monolith {
    private final BillingPrinter printer = new BillingPrinter();

    // Billing boundary
    public void doBilling1() {
        printer.doBillingPrintln(1);
    }

    public void doBilling2() {
        printer.doBillingPrintln(2);
    }

    public void doBilling3() {
        printer.doBillingPrintln(3);
    }

    // Ordering boundary
    public void testOrder1() {}

    public void testOrder2() {}

    public void testOrder3() {}
}
