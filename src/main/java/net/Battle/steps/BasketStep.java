package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.BasketPage;

import static com.codeborne.selenide.CollectionCondition.size;

@Log4j2
public class BasketStep {

    BasketPage basketPage = new BasketPage();

    @Step("Get card game hearthstone")
    public Boolean getCardGameHearthstone() {
        log.info("Get card game hearthstone");
        return basketPage.gameCardHearthstone.isDisplayed();
    }

    @Step("Get card game Call of Duty Black Ops 4")
    public Boolean getCardGameCallOfDutyBlackOps4() {
        log.info("Get card game Call of Duty Black Ops 4");
        return basketPage.gameCardCallOfDutyBlackOps4.isDisplayed();
    }

    @Step("Click remove button")
    public void clickRemoveButton() {
        log.info("click remove button");
        basketPage.removeButton.click();
    }

    @Step("Checking for deletion Call Of Duty")
    public void checkDeletionCallOfDuty() {
        log.info("checking for deletion Call Of Duty");
        basketPage.gameList.shouldHave(size(1));
    }
}
