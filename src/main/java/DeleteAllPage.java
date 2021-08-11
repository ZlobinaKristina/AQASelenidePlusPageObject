import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeleteAllPage  extends ProductBuyPage {

    ElementsCollection removeFromCart =  $$("button[class='btn btn_secondary btn_small cart_button']");
    SelenideElement value = $ ("a[class='shopping_cart_link']");
    SelenideElement back = $(By.name("back-to-products"));


    void deleteAllFromCart ()  {


       for (int i = 0; i < 6; i++) {
           removeFromCart.get(0).click(); }
           cartButton.click();

       }

}
