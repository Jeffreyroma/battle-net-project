import net.Battle.steps.AuthorizationFormStep;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BattleTest extends BaseTest {

    AuthorizationFormStep authorizationFormStep = new AuthorizationFormStep();

    @Test
    public void checkAuthorizationFormData() {
        authorizationFormStep.login();

        $(By.xpath("//h1[@class=\"title\"]")).shouldHave(text("Обзор учетной записи"));
    }
}
