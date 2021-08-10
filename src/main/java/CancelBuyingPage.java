import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CancelBuyingPage extends ProductBuyPage {

    SelenideElement cancelButton = $(By.name("cancel"));
    String url = "https://www.saucedemo.com/cart.html";
    SelenideElement back = $(By.name("back-to-products"));

    void cancelBuyingMethod () {

        back.click();
        addToCart.get(0).click();
        cartButton.click();
        checkOutButton.click();
        cancelButton.click();
    }
}
