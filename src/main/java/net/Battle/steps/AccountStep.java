package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.AccountPage;

@Log4j2
public class AccountStep {

    AccountPage accountPage = new AccountPage();

    @Step("Log out account")
    public void logOut() {
        log.info("log out account");
        accountPage.accountNavBar.click();
        accountPage.exitButton.click();
    }
}
