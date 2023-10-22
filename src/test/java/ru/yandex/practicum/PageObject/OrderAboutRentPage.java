package ru.yandex.practicum.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.practicum.ScooterPageElementsLocator;

import java.util.List;

public class OrderAboutRentPage {

    private WebDriver driver;
    private ScooterPageElementsLocator elementsLocator;

    public OrderAboutRentPage(WebDriver driver){
        this.driver = driver;
        elementsLocator = new ScooterPageElementsLocator();
    }

    public void fillAllForm(String data, int timeRent, String color) {
        fillData(data);
        fillTimeRent(timeRent);
        fillColor(color);
        clickOrder();
    }

    private void clickOrder() {
        driver.findElement(elementsLocator.orderNextButton).isSelected();
        driver.findElement(elementsLocator.orderNextButton).click();
    }

    private void fillColor(String color) {
        if (color.equals("чёрный жемчуг")) {
            driver.findElement(elementsLocator.colorBlack).click();
        } else if (color.equals("серая безысходность")) {
            driver.findElement(elementsLocator.colorGrey).click();
        } else System.out.println("цвет неправильный");
    }

    private void fillTimeRent(int timeRent) {
        driver.findElement(elementsLocator.timeOfRentPoint).click();
        List<WebElement> list = driver.findElements(elementsLocator.timeOfRentList);
        if (timeRent<list.size()){
            list.get(timeRent-1).click();
            return;
        }
        System.out.println("максимальный срок аренды "+list.size()+" суток");
    }


    private void fillData(String data) {
        driver.findElement(elementsLocator.deliveryDate).clear();
        driver.findElement(elementsLocator.deliveryDate).sendKeys(data);
    }
}
