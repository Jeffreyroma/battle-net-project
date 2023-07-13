import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BattleTest extends BaseTest {

    @Test
    public void checkAuthorizationFormData() {
        $(By.id("accountName")).setValue("romamakarcikov@gmail.com");
        $(By.id("password")).setValue("Bastardjeffrey123");
        $(By.id("submit")).click();

        $(By.xpath("//h1[@class=\"title\"]")).shouldHave(text("Обзор учетной записи"));
    }
}
