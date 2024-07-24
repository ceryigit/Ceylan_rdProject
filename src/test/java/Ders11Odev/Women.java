package Ders11Odev;

public class Women extends Person {
    public Women(String firstName, String surName, int age) {
        super(firstName, surName, age);
    }

    @Override
    public int calculateRetirementAge() {
        int result;
        return result = 60 - age;
    }

}
