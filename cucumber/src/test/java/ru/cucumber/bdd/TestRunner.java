package ru.cucumber.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// TODO - usual run as - gradle clean test - from terminal
// TODO - extended runner from terminal !!!

@CucumberOptions(features = {"classpath:test"}, plugin = {"pretty", "html:report"})
public class TestRunner extends AbstractTestNGCucumberTests {}

