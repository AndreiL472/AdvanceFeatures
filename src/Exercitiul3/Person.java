package Exercitiul3;

public class Person{

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        if (name == null||name.isEmpty()) {
            throw new IllegalArgumentException("name in null");
        }

        if (name.length() > 40){
            throw new IllegalArgumentException("Name over 40 characters");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("The age should be between 0 and 120 (inclusive).");
        }

    }
}