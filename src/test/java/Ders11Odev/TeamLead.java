package Ders11Odev;

public class TeamLead {
    private String name, surName;
    public TeamLead(String name, String surName, int age) {
        this.name=name;
        this.surName=surName;
    }
    @Override
    public String toString() {
        return  name+ " " + surName;
    }

}
