import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class BuyTest {


    @Test
    public void buy () throws InterruptedException {
        LoginPage login = new LoginPage();
        login.openLoginPage();
        login.logIn();
        ProductBuyPage product = new ProductBuyPage();
        Thread.sleep(1000);
        product.adding();

        product.buying();
        product.thankMessage.shouldBe(visible);
        Assertions.assertEquals("CHECKOUT: COMPLETE!", product.thankMessage.getText());
    }
}
