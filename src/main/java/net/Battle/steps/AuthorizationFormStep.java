package net.Battle.steps;

import net.Battle.pages.AuthorizationFormPage;

public class AuthorizationFormStep {

    AuthorizationFormPage authorizationFormPage = new AuthorizationFormPage();

    public void login(String email, String password) {
        authorizationFormPage.userNameField.setValue(email);
        authorizationFormPage.passwordField.setValue(password);
        authorizationFormPage.loginButton.click();
    }
}
