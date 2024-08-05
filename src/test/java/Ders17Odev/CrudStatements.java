import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;

public class CrudStatements {
    public static void main(String[] args) {

        String url = "jdbc:mysql://sql7.freemysqlhosting.net/sql7724182";
        String kullaniciAdi = "sql7724182";
        String sifre = "msEppxHyKX";

        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try (Handle handle = jdbi.open()) {
            System.out.println("Database bağlantısı başarılı.");
            //Tablo Oluşturma
            handle.execute("CREATE TABLE IF NOT EXISTS Departments (dptName VARCHAR(100), nrOfMembers int)");
            //Tabloya Yeni Kayıt Ekleme
            int eklenenSatir =  handle.createUpdate("INSERT INTO Departments (dptName, nrOfMembers) VALUES (:dptName, :nrOfMembers)")
                    .bind("dptName", "IT")
                    .bind("nrOfMembers", 15)
                    .execute();
            System.out.println("Eklenen kayıt sayısı: " + eklenenSatir);
            //Tablodaki Kayıtları Okuma
            Optional<Map<String, Object>> department = handle.createQuery("SELECT * FROM Departments")
                    .mapToMap()
                    .findFirst();

            if (department.isPresent()) {
                System.out.println("Departments tablosuna eklenen kayıt: " + department.get());
            } else {
                System.out.println("Departments tablosunda kayıt bulunamadı.");
            }
            //Kayıt Güncelleme
            int updatedRows = handle.createUpdate("UPDATE Departments SET nrOfMembers = :nrOfMembers WHERE dptName = :dptName")
                    .bind("dptName", "IT")
                    .bind("nrOfMembers", 12)
                    .execute();
            System.out.println("Güncellenen kayıt sayısı: " + updatedRows);
            //Kayıt Silme
            int satirSil = handle.createUpdate("DELETE FROM Departments WHERE dptName = :dptName")
                    .bind("dptName", "IT")
                    .execute();
            System.out.println("Silinen kayıt sayısı: " + satirSil);
        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

}
