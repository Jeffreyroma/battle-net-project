package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.AuthorizationFormPage;

@Log4j2
public class AuthorizationFormStep {

    AuthorizationFormPage authorizationFormPage = new AuthorizationFormPage();

    @Step("Login account")
    public void login(String email, String password) {
        log.info("login account");
        authorizationFormPage.userNameField.setValue(email);
        authorizationFormPage.passwordField.setValue(password);
        authorizationFormPage.loginButton.click();
    }
}
