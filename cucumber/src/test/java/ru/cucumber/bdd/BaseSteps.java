package ru.cucumber.bdd;

import ru.cucumber.managers.ApplicationManger;
import ru.cucumber.pages.HomePage;

public class BaseSteps {
    HomePage homePage;
    private final ApplicationManger app = new ApplicationManger();

    public BaseSteps() {
    }


/*    @BeforeClass
    public void setUp() {
        app.init();
        System.out.println("!");
    }

    @AfterClass
    public void tearDown() {
        app.stop();
        System.out.println("!");

    }*/
}
