package exercicio_02.classes;

import java.util.ArrayList;

public class Person {
    String name;
    String lastName;
    int age;

    public Person (String name, String lastName, int age) {
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
