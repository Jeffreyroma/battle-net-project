import net.Battle.models.UserData;
import net.Battle.steps.AuthorizationFormStep;
import net.Battle.utils.JsonReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BattleTest extends BaseTest {

    AuthorizationFormStep authorizationFormStep = new AuthorizationFormStep();

    @Test(dataProvider = "userData",dataProviderClass = JsonReader.class)
    public void checkAuthorizationFormData(UserData userData) {
        authorizationFormStep.login(userData.getEmail(),userData.getPassword());

        $(By.xpath("//h1[@class=\"title\"]")).shouldHave(text("Обзор учетной записи"));
    }
}
