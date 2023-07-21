import io.qameta.allure.Description;
import net.Battle.models.UserData;
import net.Battle.steps.*;
import net.Battle.utils.JsonReader;
import org.testng.annotations.Test;

public class BattleTest extends BaseTest {

    AuthorizationFormStep authorizationFormStep = new AuthorizationFormStep();

    AccountStep accountStep = new AccountStep();

    ShopStep shopStep = new ShopStep();

    GameStep gameStep = new GameStep();

    BasketStep basketStep = new BasketStep();

    @Description("Check authorization  user")
    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkAuthorizationFormData(UserData userData) {
        authorizationFormStep.login(userData.getEmail(), userData.getPassword());
        authorizationFormStep.verifyLogin("Обзор учетной записи");

        accountStep.logOut();
    }

    @Description("Add game Hearthstone in basket")
    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkShopFormAddGameHearthstone(UserData userData) {
        authorizationFormStep.login(userData.getEmail(), userData.getPassword());

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

        authorizationFormStep.login(userData.getEmail(), userData.getPassword());

        accountStep.entranceShop();

        shopStep.inputNameOfTheGame("Call of Duty Black Ops 4");
        shopStep.clickButtonOfCertainGameCallOfDutyBlackOps4();

        gameStep.clickAddToCartButton();
        gameStep.clickViewCartButton();

        basketStep.getCardGameCallOfDutyBlackOps4();
    }

    @Description("Remove game Call of Duty Black Ops 4")
    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void removeGameCallOfDutyBlackOps4(UserData userData) {
        accountStep.logOut();

        authorizationFormStep.login(userData.getEmail(), userData.getPassword());

        accountStep.entranceShop();

        shopStep.inputNameOfTheGame("Call of Duty Black Ops 4");
        shopStep.clickButtonOfCertainGameCallOfDutyBlackOps4();

        gameStep.clickViewCartButton();

        basketStep.clickRemoveButton();
        basketStep.checkDeletionCallOfDuty();
    }
}
