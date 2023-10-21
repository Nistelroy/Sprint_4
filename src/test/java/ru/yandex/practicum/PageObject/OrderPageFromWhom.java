package ru.yandex.practicum.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.practicum.ScooterPageElementsLocator;

import java.util.List;

public class OrderPageFromWhom {
    private WebDriver driver;
    private ScooterPageElementsLocator elementsLocator;
    public OrderPageFromWhom(WebDriver driver){
        this.driver = driver;
        elementsLocator = new ScooterPageElementsLocator();
    }
    public void fillAllForm(String name, String lastName,String address,String metro, String phone ){

        fillName(name);
        fillLastName(lastName);
        fillAddress(address);
        fillMetro(metro);
        fillPhone(phone);
        clickNext();

    }

    private void clickNext() {
        driver.findElement(elementsLocator.nextButtonCountForRent).isEnabled();
        driver.findElement(elementsLocator.nextButtonCountForRent).click();
    }

    private void fillPhone(String phone) {
        driver.findElement(elementsLocator.phoneNumberCountForRent).clear();
        driver.findElement(elementsLocator.phoneNumberCountForRent).sendKeys(phone);
    }

    public void fillMetro(String metro) {
        driver.findElement(elementsLocator.metroCountForRent).click();
        List<WebElement> list = driver.findElements(elementsLocator.selectMetroCountForRent);

        for (int i = 0; i < list.size(); i++) {
            if (metro.equals(list.get(i).getText())) {
                list.get(i).click();
                return;
            }
        }
        System.out.println("Метро не найдено");
    }

    public void fillAddress(String address) {
        driver.findElement(elementsLocator.addressCountForRent).clear();
        driver.findElement(elementsLocator.addressCountForRent).sendKeys(address);
    }

    public void fillLastName(String lastName) {
        driver.findElement(elementsLocator.lastNameCountForRent).clear();
        driver.findElement(elementsLocator.lastNameCountForRent).sendKeys(lastName);
    }

    public void fillName(String name) {
        driver.findElement(elementsLocator.nameCountForRent).isDisplayed();
        driver.findElement(elementsLocator.nameCountForRent).clear();
        driver.findElement(elementsLocator.nameCountForRent).sendKeys(name);
    }
}
