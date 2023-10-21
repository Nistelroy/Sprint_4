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
public By footerListPoints = By.xpath(".//div[@data-accordion-component='AccordionItem']");
public By footerList = By.xpath(".//div[@class='Home_FAQ__3uVm4']");
public By footerListVisibleTextAfterClick = By.xpath(".//div[not(@hidden)and@data-accordion-component='AccordionItemPanel']");

//имя
public By nameCountForRent = By.xpath(".//input[@placeholder='* Имя']");

//фамилия
public By lastNameCountForRent = By.xpath(".//input[@placeholder='* Фамилия']");

//адрес
public By addressCountForRent = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

//станция метро
public By metroCountForRent = By.xpath(".//input[@placeholder='* Станция метро']");
//все станции
public By selectMetroCountForRent = By.xpath(".//li[@class='select-search__row']");

//телефон
public By phoneNumberCountForRent = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
//далее
public By nextButtonCountForRent = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


//дата
public By deliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

//срок
public By timeOfRentPoint = By.xpath(".//span");

    //срок //срок
public By timeOfRentList = By.xpath(".//div[@class='Dropdown-option']");


//цвет
public By colorBlack = By.id("black");
public By colorGrey = By.id("grey");

//хотите оформить да
public By orderFinishButton = By.xpath(".//button[(text()='Заказать')and@class='Button_Button__ra12g Button_Middle__1CSJM']");

//заказ оформлен
public By compliantOrderStatus = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[1]/text()");



}
