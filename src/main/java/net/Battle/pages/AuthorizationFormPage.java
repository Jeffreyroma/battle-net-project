package net.Battle.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationFormPage {

    public SelenideElement userNameField = $(By.id("accountName"));
    public SelenideElement passwordField = $(By.id("password"));
    public SelenideElement loginButton = $(By.id("submit"));
}
