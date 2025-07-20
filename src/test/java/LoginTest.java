import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    @Parameters({"username", "password"})
    public void login(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
