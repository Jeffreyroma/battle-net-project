package net.Battle.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShopPage {

    public SelenideElement searchGameField = $(By.id("search-desktop-input"));
    public SelenideElement buttonOfCertainGameHearthstone = $(By.xpath("//div[@class=\"title meka-font-display meka-font-display--header-7\"]"));
}
