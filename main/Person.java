package main;

// Testing out the ol' JUnit chops.
public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age  = a;
    }

    public void changeName(String n) {
        name = n;
    }

    public void changeAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
