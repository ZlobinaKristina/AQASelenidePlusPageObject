import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductBuyPage {

    ElementsCollection addToCart =  $$("button[class='btn btn_primary btn_small btn_inventory']");
    SelenideElement cartButton = $(By.id("shopping_cart_container"));
    SelenideElement checkOutButton = $(By.id("checkout"));
    SelenideElement firstName = $(By.id("first-name"));
    SelenideElement lastName = $(By.id("last-name"));
    SelenideElement postalCode = $(By.id("postal-code"));
    SelenideElement buttonContinue = $(By.id("continue"));
    SelenideElement buttonFinish = $("button[data-test='finish']");
    SelenideElement thankMessage = $("span[class='title']");

    void adding ()  {

      for (int i = 0; i < 6; i++) {
        addToCart.get(0).click(); }
        cartButton.click(); }

    void buying () {
        checkOutButton.click();
        firstName.setValue("Name");
        lastName.setValue("Last Name");
        postalCode.setValue("1234567890");
        buttonContinue.click();
        buttonFinish.click();
    }
}
