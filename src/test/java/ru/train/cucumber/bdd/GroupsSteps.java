package ru.train.cucumber.bdd;


import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import ru.train.cucumber.managers.ApplicationManger;
import ru.train.cucumber.model.GroupData;
import ru.train.cucumber.pages.HomePage;

public class GroupsSteps {

    private final ApplicationManger app;
    private GroupData newGroup;
    private HomePage homePage;

    private int groupsCountOnGroupPage;


    @Before
    public void init() {
        app.init();
    }

    @After
    public void stop() {
        app.stop();
    }


    public GroupsSteps(ApplicationManger app) {
        this.app = app;
    }

    @When("^user go to group page$")
    public void userGoToGroupPage() {
        app.getPageObjectManager().getGroupPage().navigateTo_GroupsPage();
    }

    @When("^user create group with name \"([^\"]*)\", header \"([^\"]*)\", footer \"([^\"]*)\"$")
    public void userCreateGroupWithNameHeaderFooter(String name, String header, String footer) {

        newGroup = new GroupData().withName(name).withHeader(header).withFooter(footer);
        app.getPageObjectManager().getGroupPage().fillGroupForm(newGroup);
        app.getPageObjectManager().getGroupPage().submitCreation();
    }

    @When("^user click on create group button$")
    public void userClickOnCreateGroupButton() {
        app.getPageObjectManager().getGroupPage().createNewGroup();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page() {

        homePage = app.getPageObjectManager().getHomePage();
        homePage.navigateTo_HomePage();

    }

    @Given("^user logon as admin$")
    public void userLogonAsAdmin() {

        homePage.typeLogin("admin");
        homePage.typePassword("secret");
        homePage.clickOnLoginButton();

    }


    @When("^user delete random group$")
    public void userDeleteRandomGroup() {
        app.getPageObjectManager().getGroupPage().deleteRandomGroup();
    }

    @When("^user ensure groups exist and if not create it$")
    public void userEnsureGroupsExistAndIfNotCreateIt() {
        groupsCountOnGroupPage = app.getPageObjectManager().getGroupPage().getGroupsCountOnGroupPage();
        if (groupsCountOnGroupPage == 0) {
            app.getPageObjectManager().getGroupPage().createNewGroup();
            userCreateGroupWithNameHeaderFooter("some", "some", "some");
        }
    }

    @When("^user delete all group if it exist$")
    public void userDeleteAllGroup() {
        if (groupsCountOnGroupPage != 0)
            for (int i = 0; i < groupsCountOnGroupPage; i++) {
                app.getPageObjectManager().getGroupPage().selectGroup(i);
            }
        app.getPageObjectManager().getGroupPage().deleteSelectedGroups();
    }
}
