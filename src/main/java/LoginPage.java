import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {

    SelenideElement loginField = $(By.name("user-name"));
    SelenideElement passwordField = $(By.name("password"));
    SelenideElement logInButton = $(By.name("login-button"));
    SelenideElement productTitle = $("span.title");

    void logIn()  {
        loginField.setValue("standard_user");
        passwordField.setValue("secret_sauce");
        logInButton.click();
            }

    public void openLoginPage(){
          open("https://www.saucedemo.com/");
    }
}
