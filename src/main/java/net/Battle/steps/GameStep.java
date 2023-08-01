package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.GamePage;

@Log4j2
public class GameStep {

    GamePage gamePage = new GamePage();

    @Step("Add game to cart button")
    public void clickAddToCartButton() {
        log.info("Click add to cart button");
        gamePage.addToCartButton.click();
    }

    @Step("View cart button")
    public void clickViewCartButton() {
        log.info("Click view cart button");
        gamePage.viewCartButton.click();
    }
}
