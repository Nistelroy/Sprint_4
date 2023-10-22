package ru.yandex.practicum.basic_tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.PageObject.FinalApprovedOrderPage;
import ru.yandex.practicum.PageObject.HomePageScooter;
import ru.yandex.practicum.PageObject.OrderAboutRentPage;
import ru.yandex.practicum.PageObject.OrderPageFromWhom;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class OrderSmokePositiveTest {
    public static final int ONE_DAY = 1;
    public static final int TWO_DAY = 2;
    private WebDriver driver;
    String orderStatus;

    @Before
    public void resultOrder(){
        orderStatus = "Заказ оформлен";
    }

    @Test
    public void OrderScooterTest() {

        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        HomePageScooter homePage = new HomePageScooter(driver);
        homePage.openHomePage();
        homePage.clickHeaderOrderButton();

        OrderPageFromWhom fromWhom = new OrderPageFromWhom(driver);
        String name = "Дмитрий";
        String lastName = "Семечкин";
        String address = "Пр. Васильевых 54";
        String metro = "Сокольники";
        String phone = "99112112313";
        fromWhom.fillAllForm(name,lastName,address,metro,phone);

       OrderAboutRentPage aboutRent = new OrderAboutRentPage(driver);
       String data = "20.12.2023";
       int timeRent = ONE_DAY;
       String color = "чёрный жемчуг";
       aboutRent.fillAllForm(data,timeRent,color);
       String orderStatus = "Заказ оформлен";
       FinalApprovedOrderPage finalPage = new FinalApprovedOrderPage(driver);

       assertThat("Оформление заказа не завешено",finalPage.finishOrder(),containsString(orderStatus));
    }

    @Test
    public void OrderScooterTestTwo() {

        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        HomePageScooter homePage = new HomePageScooter(driver);
        homePage.openHomePage();
        homePage.clickFooterOrderButton();

        OrderPageFromWhom fromWhom = new OrderPageFromWhom(driver);
        String name = "Антонина";
        String lastName = "Чветочкова";
        String address = "Бабушкина 24";
        String metro = "Лубянка";
        String phone = "99119992399";
        fromWhom.fillAllForm(name,lastName,address,metro,phone);

        OrderAboutRentPage aboutRent = new OrderAboutRentPage(driver);
        String data = "21.12.2023";
        int timeRent = TWO_DAY;
        String color = "серая безысходность";
        aboutRent.fillAllForm(data,timeRent,color);

        FinalApprovedOrderPage finalPage = new FinalApprovedOrderPage(driver);

        assertThat("Оформление заказа не завешено",finalPage.finishOrder(),containsString(orderStatus));
    }




    @After
    public void closeDriver(){
          driver.quit();
    }

}
