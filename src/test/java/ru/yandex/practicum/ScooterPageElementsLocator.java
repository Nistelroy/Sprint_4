package ru.yandex.practicum;
import org.openqa.selenium.By;

public class ScooterPageElementsLocator {
    //главная страница
    public By headerOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']"); // Кнопка «Войти» вверху
    public By footerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка «Войти» внизу
    public By footerListPoints = By.xpath(".//div[@data-accordion-component='AccordionItem']");//пункты списка
    public By footerList = By.xpath(".//div[@class='Home_FAQ__3uVm4']");//сам список
    public By footerListVisibleTextAfterClick = By.xpath(".//div[not(@hidden)and@data-accordion-component='AccordionItemPanel']");//появляющийся текст
    //первый лист данных для заказа
    public By nameCountForRent = By.xpath(".//input[@placeholder='* Имя']");//поле ввода имени
    public By lastNameCountForRent = By.xpath(".//input[@placeholder='* Фамилия']");//фамилии
    public By addressCountForRent = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");//адреса
    public By metroCountForRent = By.xpath(".//input[@placeholder='* Станция метро']");//станции метро
    public By selectMetroCountForRent = By.xpath(".//li[@class='select-search__row']");//все станции
    public By phoneNumberCountForRent = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");//поле воода телефона
    public By nextButtonCountForRent = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");//кнопка далее
    //второй лист данных для заказа
    public By deliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");//поле ввода даты
    public By timeOfRentPoint = By.xpath(".//span");//срока аренды
    public By timeOfRentList = By.xpath(".//div[@class='Dropdown-option']");//выпадающий список срока аренды
    public By colorBlack = By.id("black");//поле ввода цвета
    public By colorGrey = By.id("grey");
    public By orderNextButton = By.xpath(".//button[(text()='Заказать')and@class='Button_Button__ra12g Button_Middle__1CSJM']");//кнопка подтверждения
    //третий лист заказа
    public By orderFinishButton = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");//кнопка подтверждения
    //Статус заказа
    public By compliantOrderStatus = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[@class='Order_ModalHeader__3FDaJ']");

}
