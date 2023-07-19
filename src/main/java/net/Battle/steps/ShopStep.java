package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.ShopPage;
import org.openqa.selenium.Keys;

@Log4j2
public class ShopStep {

    ShopPage shopPage = new ShopPage();

    @Step("Input name of the game")
    public void inputNameOfTheGame(String nameOfTheGame) {
        log.info("input name of the game");
        shopPage.searchGameField.setValue(nameOfTheGame);
    }

    @Step("Click button of certain game Hearthstone")
    public void clickButtonOfCertainGameHearthstone() {
        log.info("click button of certain game hearthstone");
        shopPage.buttonOfCertainGameHearthstone.click();
    }


}
