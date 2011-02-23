package com.jos.katas.romannumerals.stepdefinitions;

import com.jos.katas.romannumerals.RomanNumerals;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import static org.junit.Assert.*;

public class RomanNumeralSteps {
	private RomanNumerals rn = new RomanNumerals();
	private int arabic;
	private String roman = "";
	
    @Given("a number in arabic such as (\\d+)")
    public void arabicToRoman(int arabic){;
    	this.arabic = arabic;
    }
    
    @When("^I run the arabic converter$")
    public void iRunTheArabicConverter() {
    	this.roman = rn.convert(this.arabic);
    }
    
    @Then("^I should get the value MCMXCIX$")
    public void iShouldGetTheValueMCMXCIX() {
    	assertTrue((this.roman).equals("MCMXCIX"));
    }
        
    @Given("^a number in roman such as \"([^\"]*)\"$")
    public void aNumberInRomanSuchAsMCMXCIX(String roman) {
    	this.roman = roman;
    }
    
    @When("^I run the roman converter$")
    public void iRunTheRomanConverter() {
    	this.arabic = rn.convert(this.roman);
    }
     
    @Then("^I should get the value 1999$")
    public void iShouldGetTheValue1999() {
    	assertTrue(this.arabic == 1999);
    }

}
