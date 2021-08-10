import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class LogInTest {
    @Test
    public  void  logInTest ()  {
        LoginPage login = new LoginPage();
        login.openLoginPage();
        login.logIn();
        login.productTitle.shouldBe(visible);
        Assertions.assertEquals("PRODUCTS", login.productTitle.getText());
    }
}
