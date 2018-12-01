package ru.train.cucumber.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


// TODO - usual run as - gradle clean test - from terminal
// TODO - extended runner from terminal !!!

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:scenarios"}
        ,plugin = {"pretty", "html:report"}
        ,glue = "ru/train/cucumber/bdd"
                    )
public class TestRunner {}

