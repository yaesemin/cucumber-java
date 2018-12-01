package ru.train.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo_HomePage() {
        driver.get("http://localhost/addressbook");
    }

    public void typeLogin(String login){
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
    }

    public void typePassword(String password){
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
}
