import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CancelTest {

    @Test
    public void cancel () {
        LoginPage login = new LoginPage();
        login.openLoginPage();
        login.logIn();
        ProductBuyPage product = new ProductBuyPage();
        product.adding();
        product.buying();
        CancelBuyingPage cancelBuy = new CancelBuyingPage();
        cancelBuy.cancelBuyingMethod();
        Assertions.assertEquals("https://www.saucedemo.com/cart.html", cancelBuy.url);
    }
}




