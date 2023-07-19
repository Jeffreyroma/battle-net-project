package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.BasketPage;

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
}
