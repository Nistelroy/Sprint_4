package ru.yandex.practicum.PageObject;

import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.ScooterPageElementsLocator;

public class FinalApprovedOrderPage {
    private WebDriver driver;
    private ScooterPageElementsLocator elementsLocator;
    public FinalApprovedOrderPage(WebDriver driver){
        this.driver = driver;
        elementsLocator = new ScooterPageElementsLocator();
    }

    public String finishOrder() {

       return driver.findElement(elementsLocator.compliantOrderStatus).getText();
    }
}
