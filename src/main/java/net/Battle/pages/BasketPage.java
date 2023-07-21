package net.Battle.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasketPage {

    public SelenideElement gameCardHearthstone = $(By.xpath("//div[@class=\"browsing-card\"]/h2[text()=\" Hearthstone® \"]"));
    public SelenideElement gameCardCallOfDutyBlackOps4 = $(By.xpath("//div[@class=\"browsing-card\"]/h2[text()=\" Call of Duty®: Black Ops 4 \"]"));

    public ElementsCollection gameList = $$(By.xpath("//ul[@class=\"browsing-card-group-layout browsing-card-group-layout--auto browsing-card-group-layout--nested\"]"));
    public SelenideElement removeButton = $(By.id("wishlist.action.remove-simplified"));


}
