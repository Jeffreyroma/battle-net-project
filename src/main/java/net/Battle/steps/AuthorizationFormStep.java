package net.Battle.steps;

import net.Battle.pages.AuthorizationFormPage;

public class AuthorizationFormStep {

    AuthorizationFormPage authorizationFormPage = new AuthorizationFormPage();

    public void login() {
        authorizationFormPage.userNameField.setValue("romamakarcikov@gmail.com");
        authorizationFormPage.passwordField.setValue("Bastardjeffrey123");
        authorizationFormPage.loginButton.click();
    }
}
