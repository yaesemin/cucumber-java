package ru.train.cucumber.managers;

import org.openqa.selenium.WebDriver;

public class ApplicationManger {

    WebDriver wd;
    private PageObjectManager pageObjectManager;

    public void init() {

        WebDriverManager wm = new WebDriverManager();
        this.wd = wm.getDriver();
        pageObjectManager = new PageObjectManager(this.wd);
    }

    public WebDriver getDriver() {
        return this.wd;
    }

    public void stop() {
        this.wd.close();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
