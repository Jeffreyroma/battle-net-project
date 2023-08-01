package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.AccountPage;
import net.Battle.pages.AuthorizationFormPage;

import static com.codeborne.selenide.Condition.text;

@Log4j2
public class AuthorizationFormStep {

    AuthorizationFormPage authorizationFormPage = new AuthorizationFormPage();

    AccountPage accountPage = new AccountPage();

    @Step("Login account")
    public void login(String email, String password) {
        log.info("login account");
        authorizationFormPage.userNameField.setValue(email);
        authorizationFormPage.passwordField.setValue(password);
        authorizationFormPage.loginButton.click();
    }

    @Step("Getting the text of label")
    public void verifyLogin(String titleName) {
        log.info("getting the text of label");
        accountPage.textLabel.shouldHave(text(titleName));
    }
}
