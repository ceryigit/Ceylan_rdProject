package Ders11Odev;

public class Men extends Person {
    public Men(String firstName, String surName, int age) {
        super(firstName, surName, age);
    }

    @Override
    public int calculateRetirementAge() {
        int result;
        return result = 65 - age;
    }
}
