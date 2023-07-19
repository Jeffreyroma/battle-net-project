import io.qameta.allure.Description;
import net.Battle.models.UserData;
import net.Battle.pages.BasketPage;
import net.Battle.steps.*;
import net.Battle.utils.JsonReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BattleTest extends BaseTest {

    AuthorizationFormStep authorizationFormStep = new AuthorizationFormStep();

    AccountStep accountStep = new AccountStep();

    ShopStep shopStep = new ShopStep();

    GameStep gameStep = new GameStep();

    BasketStep basketStep = new BasketStep();

    @Description("Check authorization  user")
    @Test(dataProvider = "userData",dataProviderClass = JsonReader.class)
    public void checkAuthorizationFormData(UserData userData) {
        authorizationFormStep.login(userData.getEmail(),userData.getPassword());

        $(By.xpath("//h1[@class=\"title\"]")).shouldHave(text("Обзор учетной записи"));
        accountStep.logOut();
    }

    @Description("Add game Hearthstone in basket")
    @Test(dataProvider = "userData",dataProviderClass = JsonReader.class)
    public void checkShopFormAddGameHearthstone(UserData userData) {
        authorizationFormStep.login(userData.getEmail(),userData.getPassword());

        accountStep.entranceShop();

        shopStep.inputNameOfTheGame("Hearthstone game");
        shopStep.clickButtonOfCertainGameHearthstone();

        gameStep.clickAddToCartButton();
        gameStep.clickViewCartButton();

        basketStep.getCardGameHearthstone();
    }

    @Description("Add game Call of Duty in basket")
    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkShopFormAddGameCallOfDutyInBasket(UserData userData) {
        accountStep.logOut();

        authorizationFormStep.login(userData.getEmail(),userData.getPassword());

        accountStep.entranceShop();

        shopStep.inputNameOfTheGame("Call of Duty Black Ops 4");
        shopStep.clickButtonOfCertainGameCallOfDutyBlackOps4();

        gameStep.clickAddToCartButton();
        gameStep.clickViewCartButton();

        basketStep.getCardGameCallOfDutyBlackOps4();
    }
}
