package Ders5Odev;

public class CompanyATest {
    public static void main(String[] args) {
        CompanyA ik1 = new CompanyA();
        CompanyA it1 = new CompanyA();
        CompanyA marketing1 = new CompanyA();

        ik1.ik = "Ayşe hanım";
        it1.it = "Sait bey";
        marketing1.marketing = "Aylin hanım";

        ik1.IkMembers();
        it1.ItMembers();
        marketing1.MarketingMember();
    }

}