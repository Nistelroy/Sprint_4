package ru.yandex.practicum.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.practicum.ScooterPageElementsLocator;

import java.util.List;

public class HomePageScooter {

    private final WebDriver driver;
    private final ScooterPageElementsLocator elementsLocator = new ScooterPageElementsLocator();


    public HomePageScooter(WebDriver driver){
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://qa-scooter.praktikum-services.ru");
    }

    public void scrollToList() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOf(driver.findElement(elementsLocator.footerList)));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(elementsLocator.footerList));
    }

    public void clickToPoint(int numberStringInList) {
       List<WebElement> list = driver.findElements(elementsLocator.footerListPoints);
       list.get(numberStringInList-1).click();
    }

    public String getVisibleTextInListAfterClick() {
        return driver.findElement(elementsLocator.footerListVisibleTextAfterClick).getText();
    }

    public void clickHeaderOrderButton(){
        driver.findElement(elementsLocator.headerOrderButton).click();
    }

    public void clickFooterOrderButton(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOf(driver.findElement(elementsLocator.footerOrderButton)));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(elementsLocator.footerOrderButton));
        driver.findElement(elementsLocator.footerOrderButton).click();
    }
}
