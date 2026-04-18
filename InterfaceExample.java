package oops;

/**
 * Concept: Interface
 *
 * - 100% abstraction (before Java 8)
 * - Supports multiple inheritance
 * - Defines a contract (what to do, not how)
 */

// Interface
interface Payment {
    void pay(double amount);
}

// Another interface
interface Refund {
    void refund(double amount);
}

// Class implementing multiple interfaces
class CreditCardPayment implements Payment, Refund {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(1000);

        Payment p2 = new UpiPayment();
        p2.pay(500);

        Refund r1 = new CreditCardPayment();
        r1.refund(300);
    }
}
