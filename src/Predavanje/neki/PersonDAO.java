package Predavanje.neki;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/person";

        List<Person> personList = new ArrayList<>();

        public List<Person> getPersonList () {
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                String sqlUpit = "SELECT * FROM person";
                ResultSet resultSet = statement.executeQuery(sqlUpit);
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString(2);
                    String surname = resultSet.getString("surname");
                    Date birthday = resultSet.getDate(4);
                    Person person = new Person(id, name, surname, birthday);
                    personList.add(person);
                }
            } catch (SQLException exception) {
                System.err.println(exception.getMessage());
            }
            return personList;
        }
}

