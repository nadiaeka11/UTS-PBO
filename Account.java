import java.util.Arrays;
public class Account {
    private String username;
    private String password;

    public Account(){
        this.username = "";
        this.password = "";
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{username='" + this.username + "', passwords'" + this.password + "'}";
    }
}
