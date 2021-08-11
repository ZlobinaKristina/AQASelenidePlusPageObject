import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
public class SumPage {
    ElementsCollection allPriceFields =  $$("div[class='inventory_item_price']");
    SelenideElement allPriceSum =  $("div[class='summary_subtotal_label']");

   String allSum () {
        String[] str;
        str = new String[6];
        str[0] = allPriceFields.get(0).getText().substring(1);
        str[1] = allPriceFields.get(1).getText().substring(1);
        str[2] = allPriceFields.get(2).getText().substring(1);
        str[3] = allPriceFields.get(3).getText().substring(1);
        str[4] = allPriceFields.get(4).getText().substring(1);
        str[5] = allPriceFields.get(5).getText().substring(1);
        double[] numbers = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Double.parseDouble(str[i]);
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; }

           String value = Double.toString(sum);
                System.out.println(value);
       return value;

            }}





