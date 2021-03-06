import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AllTestsDependentNotFinished {

@Test
@Order(1)

   public  void  logInTest () {
    LoginPage login = new LoginPage();
    login.openLoginPage();
    login.logIn();
    login.productTitle.shouldBe(visible);
    Assertions.assertEquals("PRODUCTS", login.productTitle.getText());
}

@Test
@Order(2)
  public void buyTest ()  {
   ProductBuyPage product = new ProductBuyPage();
   product.adding();
   product.buying();
   product.thankMessage.shouldBe(visible);
   Assertions.assertEquals("CHECKOUT: COMPLETE!", product.thankMessage.getText());
}


@Test
@Order(3)
 public void cancelTest ()  {
 CancelBuyingPage cancelBuy = new CancelBuyingPage();
 cancelBuy.cancelBuyingMethod();
 Assertions.assertEquals("https://www.saucedemo.com/cart.html", cancelBuy.url);
 }


 @Test
 @Order(4)
 public void deleteAllTest () {
 DeleteAllPage removeAll = new DeleteAllPage();

 removeAll.deleteAllFromCart();

 Assertions.assertTrue(removeAll.value.is(Condition.empty));


}

}
