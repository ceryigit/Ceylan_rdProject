package Ders11Odev;

public class IkApp {
    public static void main(String[] args) {
        TeamLead leader = new TeamLead("Ceylan", "Eryiğit", 28);
        Men menEmployee = new Men("Ali", "Uslu", 32);
        Women womenEmployee = new Women("Ayşe", "Güngör", 35);
        Women womenEmployee2 = new Women("Zehra", "Çalışkan", 30);


        Department department = new Department(leader);

        department.addPerson(menEmployee);
        department.addPerson(womenEmployee);
        department.deletePerson(womenEmployee2);

        department.addTask("Görev1");
        department.addTask("Görev2");

        department.taskCompleted("Görev2");

        TeamLead newLeader = new TeamLead("Emine", "Yılmaz", 29);
        department.changeTeamLead(newLeader);

        menEmployee.printRetirementAge();
        womenEmployee.printRetirementAge();
        womenEmployee2.printRetirementAge();


    }
}
