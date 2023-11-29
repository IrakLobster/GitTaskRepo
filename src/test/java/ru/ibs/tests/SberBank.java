package ru.ibs.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SberBank {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver5.exe");
        //ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setBinary("\"C:\\Users\\Владислав и Маруся\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.sberbank.ru/ru/person");
        String s = driver.getTitle();
        System.out.println("Хедер этой страницы " + s);
        //driver.close();
        driver.getWindowHandle();
        //driver.manage().window().fullscreen();
        /*
        driver.get("http://www.sberbank.ru/ru/person");
        */


    }

}
