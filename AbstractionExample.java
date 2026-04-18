package oops;

/**
 * Concept: Abstraction
 *
 * - Hiding implementation details
 * - Showing only essential features
 * - Achieved using abstract classes or interfaces
 */

// Abstract class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Uses fuel");
    }
}

// Concrete class
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.start();
    }
}
