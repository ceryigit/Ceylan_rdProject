package Ders11Odev;

import java.util.ArrayList;

public class Department {
    private ArrayList<Person> person;
    private ArrayList<String > tasks;
    private TeamLead teamLead;

    public Department(TeamLead teamLead){
        this.teamLead=teamLead;
        this.person= new ArrayList<>();
        this.tasks= new ArrayList<>();
    }
    public void changeTeamLead(TeamLead newLead){
        this.teamLead = newLead;
        System.out.println("Yeni takım lideri: " + newLead);
    }

    public void addPerson(Person person){
        this.person.add(person);
        System.out.println(person.getFullName() + " kişisi departmana eklendi.");
    }

    public void deletePerson (Person person){
        this.person.remove(person);
        System.out.println(person.getFullName() + " kişisi departmandan silindi.");
    }

    public void addTask(String task) {
        this.tasks.add(task);
        System.out.println("Yeni görev eklendi: " + task);
    }

    public void taskCompleted(String task) {
        this.tasks.remove(task);
        System.out.println("Görev tamamlandı: " + task);
    }

}
