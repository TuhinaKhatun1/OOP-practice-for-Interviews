/**
 * Encapsulation Example
 *
 * - Wrapping data (variables) and methods together
 * - Restrict direct access using private
 * - Access via getters and setters
 */

class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Tuhina");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setAge(-5); // invalid case
    }
}
