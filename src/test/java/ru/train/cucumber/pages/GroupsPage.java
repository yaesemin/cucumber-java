package ru.train.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.train.cucumber.model.GroupData;

public class GroupsPage {

    private final WebDriver driver;

    public GroupsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo_GroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void createNewGroup(){
        driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void submitCreation(){
        driver.findElement(By.name("submit")).click();
    }

    public int getGroupsCountOnGroupPage(){
        return driver.findElements(By.name("selected[]")).size();
    }

    public void deleteRandomGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
        deleteSelectedGroups();
    }

    public void selectGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }
}
