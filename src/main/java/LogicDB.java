import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class LogicDB {

    private Connection connection;
    private Statement statement;
    private String username;
    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;
    private final String INSERT_NEW;
    private BufferedReader reader;

    {
        reader = new BufferedReader(new FileReader("src\\main\\resources\\Output.txt"));
        username = Welcome.getTextField().getText().substring(5) + " " + Welcome.getTextField1().getText().substring(9);
        URL = "jdbc:mysql://localhost:3306/innovativenessdb?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
        USERNAME = "ser_aleu";
        PASSWORD = "root";
        INSERT_NEW = "insert into users (username, gender, age, creativity, riskForSuccess, futureOrientation, innovativeness) values" +
                " ( '" + username + "','"
                + Welcome.getGender() + "', "
                + Welcome.getAge() +"," +
                + Double.parseDouble(reader.readLine()) + ","
                + Double.parseDouble(reader.readLine()) + ","
                + Double.parseDouble(reader.readLine()) + ","
                + Double.parseDouble(reader.readLine()) + ");";
    }

    public LogicDB() throws IOException {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate(INSERT_NEW);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
