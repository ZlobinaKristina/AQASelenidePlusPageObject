import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteAllTest {

    @Test
    void deleteAll ()  {
        LoginPage  login = new LoginPage();
        login.openLoginPage();
        login.logIn();
        ProductBuyPage product = new ProductBuyPage();
        product.adding();
        DeleteAllPage delete = new DeleteAllPage();
        delete.deleteAllFromCart();
        Assertions.assertTrue(delete.value.is(Condition.empty));

    }
}
