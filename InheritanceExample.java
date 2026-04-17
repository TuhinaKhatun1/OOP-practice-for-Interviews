/**
 * Concept: Inheritance
 *
 * - One class acquires properties and behavior of another class
 * - Promotes code reuse
 */

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // own method
    }
}
