package ru.yandex.practicum.page_object;

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
       driver.findElement(elementsLocator.orderFinishButton).click();
       return driver.findElement(elementsLocator.compliantOrderStatus).getText();
    }
}
