package oops.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Student Management System
 *
 * Concepts Used:
 * - Encapsulation
 * - Abstraction
 * - Polymorphism
 * - Object composition
 */

// Abstract class
abstract class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void displayInfo();
}

// Student class
class Student extends Person {
    private String course;

    public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    @Override
    void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id + ", Course: " + course);
    }
}

// Teacher class
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher: " + name + ", ID: " + id + ", Subject: " + subject);
    }
}

// Management class
class Management {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public void showAll() {
        for (Person p : people) {
            p.displayInfo(); // polymorphism
        }
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Management management = new Management();

        Person s1 = new Student("Tuhina", 101, "CSE");
        Person t1 = new Teacher("Mr. Roy", 201, "Java");

        management.addPerson(s1);
        management.addPerson(t1);

        System.out.println("--- All Records ---");
        management.showAll();
    }
}
