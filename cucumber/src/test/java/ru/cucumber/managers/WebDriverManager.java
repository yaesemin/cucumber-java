package ru.cucumber.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    WebDriver wd;

    public WebDriver getDriver() {

        wd = new ChromeDriver();
        return wd;

    }

}
