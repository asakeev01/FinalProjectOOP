package project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    final static String DATABASE_URL = "jdbc:postgresql://localhost:5000/UsersDB";
    final static String SELECT_QUERY = "SELECT * FROM users";
    final static String user = "postgres";
    final static String password = "0555753974f";
    static Connection connection;

    public static List<User> get(){
        List<User> users = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(DATABASE_URL, user, password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(SELECT_QUERY);

            while (rs.next()) {
                String id = Integer.toString(rs.getInt("id"));
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String location = rs.getString("location");

                User user = new User(username, password, email, location);
                users.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }
    public static void addUser(User user) throws SQLException {
        connection = DriverManager.getConnection(DATABASE_URL, "postgres", password);
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO users(username, password, email, location)" +  "VALUES('"+ user.getUsername() +"', '"+user.getPassword()+"', '"+user.getEmail()+"', '"+user.getLocation()+"')");
    }
}

