package Ders17Odev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectStatement {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/new_schema";
        String kullaniciAdi = "root";
        String sifre = "my-secret-pw";

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            System.out.println("Database bağlantısı başarılı");
            String sqlSorgusu = "SELECT * FROM new_schema.Employee WHERE Id is not null";
            preparedStatement = connection.prepareStatement(sqlSorgusu);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String ad = resultSet.getString("Name");
                String soyad = resultSet.getString("Surname");
                System.out.println("ID: " + id + " " + ", Adı: " + ad + " " +"Soyadı: " + soyad);
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

}

