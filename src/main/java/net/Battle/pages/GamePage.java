package net.Battle.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GamePage {

    public SelenideElement addToCartButton = $(By.id("wishlist.action.add"));
    public SelenideElement viewCartButton = $(By.id("wishlist.action.view"));

}
