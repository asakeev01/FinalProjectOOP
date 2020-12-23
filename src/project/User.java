package project;

public class User {
    private String username;
    private String password;
    private String email;
    private String location;

    public User(String username, String password, String email, String location){
        this.username = username;
        this.password = password;
        this.email = email;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
