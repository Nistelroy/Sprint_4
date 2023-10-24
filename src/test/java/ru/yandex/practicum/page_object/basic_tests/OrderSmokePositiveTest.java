package ru.yandex.practicum.page_object.basic_tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.page_object.FinalApprovedOrderPage;
import ru.yandex.practicum.page_object.HomePageScooter;
import ru.yandex.practicum.page_object.OrderAboutRentPage;
import ru.yandex.practicum.page_object.OrderPageFromWhom;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class OrderSmokePositiveTest {
    public static final int ONE_DAY = 1;
    public static final int TWO_DAY = 2;
    private WebDriver driver;
    private final String name;
    private final String lastName;
    private final String address;
    private final String metro;
    private final String phone;
    private final String data;
    private final int timeRent;
    private final String color;
    private String orderStatus;

    public OrderSmokePositiveTest(String name, String lastName, String address, String metro, String phone, String data,
                                  int timeRent, String color) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.data = data;
        this.timeRent = timeRent;
        this.color = color;
    }

    @Parameterized.Parameters
    public static Object[][] getTextForList() {
        return new Object[][]{

                {"Дмитрий", "Семечкин", "Пр. Васильевых 54", "Сокольники", "99112112313",
                        "20.12.2023", ONE_DAY, "чёрный жемчуг"},

                {"Антонина", "Чветочкова", "Бабушкина 24", "Лубянка", "99119992399",
                        "21.12.2023", TWO_DAY, "серая безысходность"},

        };
    }

    @Before
    public void resultOrder() {
        orderStatus = "Заказ оформлен";
    }

    @Test
    public void orderScooterTest() {

        //driver = new FirefoxDriver();

        driver = new ChromeDriver();

        HomePageScooter homePage = new HomePageScooter(driver);
        homePage.openHomePage();
        homePage.clickHeaderOrderButton();

        OrderPageFromWhom fromWhom = new OrderPageFromWhom(driver);
        fromWhom.fillAllForm(name, lastName, address, metro, phone);

        OrderAboutRentPage aboutRent = new OrderAboutRentPage(driver);
        aboutRent.fillAllForm(data, timeRent, color);

        FinalApprovedOrderPage finalPage = new FinalApprovedOrderPage(driver);

        assertThat("Оформление заказа не завешено", finalPage.finishOrder(), containsString(orderStatus));
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}
