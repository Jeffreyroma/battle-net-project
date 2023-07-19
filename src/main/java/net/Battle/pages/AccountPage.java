package net.Battle.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {

    public SelenideElement accountNavBar = $(By.xpath("//div[@class=\"Navbar-label Navbar-accountAuthenticated\"]"));
    public SelenideElement exitButton = $(By.xpath("//div[@class=\"Navbar-accountDropdownLinkLabel\"][text()=\"Выход\"]"));

    public SelenideElement shopButton = $(By.xpath("//a[@data-name=\"shop\"]"));


}
