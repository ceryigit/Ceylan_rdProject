package Ders11Odev;

public abstract class Person {
    protected String firstName;
    protected String surName;
    protected int age;

    public Person(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + surName;
    }

    public int calculateRetirementAge() {
        return 0;
    }

    public void printRetirementAge() {
        int yearsLeft = calculateRetirementAge();
        System.out.println(getFullName() + " için emekliliğe kalan yıl: " + yearsLeft);
    }
}

