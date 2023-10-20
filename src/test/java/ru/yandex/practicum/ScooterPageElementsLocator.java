package ru.yandex.practicum;
import org.openqa.selenium.By;

public class ScooterPageElementsLocator {

// Кнопка «Войти» вверху
public By headerOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");

//статус заказа
public By headerStatusOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Header_Link__1TAG7']");

//кнопка «Войти» внизу
public By footerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");

//значёк яндекса
public By logoYandex = By.xpath(".//img[@alt='Yandex']");

//значёк самоката
public By logoScooter = By.xpath(".//img[@alt='Scooter']");

//пункты списка
public By footerOrderButton = By.xpath(".//div[@data-accordion-component='AccordionItem'][1]");
    /*
//имя
public By signInButton = By.className("auth-form__button");

//фамилия
public By signInButton = By.className("auth-form__button");

//адрес
public By signInButton = By.className("auth-form__button");

//станция метро
public By signInButton = By.className("auth-form__button");

//телефон
public By signInButton = By.className("auth-form__button");

//далее
public By signInButton = By.className("auth-form__button");

//дата
public By signInButton = By.className("auth-form__button");

//срок
public By signInButton = By.className("auth-form__button");

//цвет
public By signInButton = By.className("auth-form__button");

//хотите оформить да
public By signInButton = By.className("auth-form__button");

//заказ оформлен
public By signInButton = By.className("auth-form__button");

     */

}
