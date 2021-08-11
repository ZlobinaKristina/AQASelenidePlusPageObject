import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SumTest  extends  ProductBuyPage {

    @Test
   public void sum ()  {

        LoginPage  login = new LoginPage();
        login.openLoginPage();
        login.logIn();
        ProductBuyPage product = new ProductBuyPage();
        product.adding();
        cartButton.click();
        checkOutButton.click();
        firstName.setValue("Name");
        lastName.setValue("Last Name");
        postalCode.setValue("1234567890");
        buttonContinue.click();
        SumPage n = new SumPage();
        n.allSum();
         Assertions.assertEquals(n.allSum(),n.allPriceSum.getText().substring(13));

    }


}
