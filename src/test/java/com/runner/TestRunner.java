package com.runner;

//import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = {"stepDefinitions"},
plugin = {"pretty","html:target/cucumber"},
tags=" @tagRegister or @tagLogin or @tagBooking ")
		
public class TestRunner extends AbstractTestNGCucumberTests{



}