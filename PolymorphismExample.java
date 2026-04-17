
/**
 * Concept: Polymorphism
 *
 * - One name, many forms
 * - Two types:
 *   1. Compile-time (Method Overloading)
 *   2. Runtime (Method Overriding)
 */

class Calculator {

    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    // Method Overriding (Runtime Polymorphism)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Add 2 ints: " + calc.add(2, 3));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));

        // Runtime polymorphism
        Animal obj = new Dog(); // Upcasting
        obj.sound(); // Calls Dog's method (dynamic dispatch)
    }
}
