import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeleteAllPage  extends ProductBuyPage {

    ElementsCollection removeFromCart =  $$("button[class='btn btn_secondary btn_small cart_button']");
    SelenideElement value = $ ("a[class='shopping_cart_link']");


    void deleteAllFromCart () throws InterruptedException {
        Thread.sleep(3000);

       for (int i = 0; i < 6; i++) {
            Thread.sleep(3000);
            removeFromCart.get(0).click(); }

        Thread.sleep(1000);
        cartButton.click();

       }

}
