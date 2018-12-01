package ru.train.cucumber.bdd;

import ru.train.cucumber.managers.ApplicationManger;
import ru.train.cucumber.pages.HomePage;

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
