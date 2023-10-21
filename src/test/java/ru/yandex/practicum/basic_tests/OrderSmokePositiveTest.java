package ru.yandex.practicum.basic_tests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.PageObject.FinalApprovedOrderPage;
import ru.yandex.practicum.PageObject.HomePageScooter;
import ru.yandex.practicum.PageObject.OrderAboutRentPage;
import ru.yandex.practicum.PageObject.OrderPageFromWhom;

import static org.junit.Assert.assertEquals;

public class OrderSmokePositiveTest {
    private WebDriver driver;

    @Test
    public void OrderScooterTest() {

        driver = new ChromeDriver();
        HomePageScooter homePage = new HomePageScooter(driver);
        homePage.openHomePage();
        homePage.clickHeaderOrderButton();

        OrderPageFromWhom fromWhom = new OrderPageFromWhom(driver);
        String name = "Нидва";
        String lastName = "Ниполтара";
        String address = "Ничетверти";
        String metro = "Сокольники";
        String phone = "12112112313";
        fromWhom.fillAllForm(name,lastName,address,metro,phone);

       OrderAboutRentPage aboutRent = new OrderAboutRentPage(driver);
       String data = "20.12.2023";
       int timeRent = 1;
       String color = "чёрный жемчуг";
       aboutRent.fillAllForm(data,timeRent,color);

       FinalApprovedOrderPage finalPage = new FinalApprovedOrderPage(driver);
       String orderStatus = "Заказ оформлен";
       assertEquals("Заказ не оформлен",orderStatus,finalPage.finishOrder());
    }


    @After
    public void closeDriver(){
      //  driver.quit();
    }

}
