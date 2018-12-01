package ru.train.cucumber.managers;

import org.openqa.selenium.WebDriver;
import ru.train.cucumber.pages.GroupsPage;
import ru.train.cucumber.pages.HomePage;

public class PageObjectManager {

    private final WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public GroupsPage getGroupPage() {
        return new GroupsPage(driver);
    }

}
