package Predavanje.three.db;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class DBDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/person";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String sqlUpit = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(sqlUpit);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                String surname = resultSet.getString("surname");
                Date birthday = resultSet.getDate(4);
                String allInfo = ( id + ": " + name + " " + surname + " birthday: " + birthday + "\r\n");
                arrayList.add(allInfo);
            }
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
        System.out.println(arrayList);
    }
}
