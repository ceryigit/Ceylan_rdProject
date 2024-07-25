import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;

public class CrudStatements {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/new_schema";
        String kullaniciAdi = "root";
        String sifre = "my-secret-pw";

        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try  {
            Handle handle = jdbi.open();
            System.out.println("Database bağlantısı başarılı.");

            handle.execute("CREATE TABLE IF NOT EXISTS Departments (dptName VARCHAR(100), nrOfMembers int)");
            int eklenenSatir =  handle.createUpdate("INSERT INTO Departments (dptName, nrOfMembers) VALUES (:dptName, :nrOfMembers)")
                    .bind("dptName", "IT")
                    .bind("nrOfMembers", 15)
                    .execute();
            System.out.println("Eklenen kayıt sayısı: " + eklenenSatir);

            String department = handle.createQuery("SELECT * FROM new_schema.Departments")
                    .mapToMap(String.class)
                    .one().toString();
            System.out.println("Departments tablosuna eklenen kayıt: " + department);

            Optional<Long> updateResult = handle.createUpdate("UPDATE Departments SET nrOfMembers = 12 WHERE dptName = :dptname")
                    .bind("dptname", "IT")
                    .executeAndReturnGeneratedKeys()
                    .mapTo(Long.class)
                    .findFirst();
            System.out.println("Kayıt update edildi.");


            int satirSil = handle.createUpdate("DELETE FROM Employee WHERE id = :id")
                    .bind("id", 3)
                    .execute();
            System.out.println("Silinen kayıt: " + satirSil);
        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

}
