package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allBtn);
		slowDown(); 
	}
	
	@Then("Verify drop down options are present in Shop by Department sidebar")
	public void verifyDropDownOptionsArePresentInShopByDepartmentSidebar() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
	   
	}
	
	
	@When("User on Electronics")
	public void userOnElectronics() {
	  Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	  click(factory.homePage().electronics);
	}
	
	@Then("below TV & Video and Video Games are present in department")
	public void belowTVVideoAndVideoGamesArePresentInDepartment() {
	  Assert.assertTrue(isElementDisplayed(factory.homePage().tvVideo));
	  Assert.assertTrue(isElementDisplayed(factory.homePage().videoGames));
	}
	
	@When("User on Computers")
	public void userOnComputers() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		  click(factory.homePage().computers);
	    
	}
	@Then("below Accessories and Networking are present in department")
	public void belowAccessoriesAndNetworkingArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().accessories));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().networking));
	}

	@When("User on Smart Home")
	public void userOnSmartHome() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
		  click(factory.homePage().smartHome);
	 
	}
	@Then("below Smart Home Lightning and Plugs and Outlets are present in department")
	public void belowSmartHomeLightningAndPlugsAndOutletsArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeLightning));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().plugsAndOutlets));
	}
	
	@When("User on Sports")
	public void userOnSports() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		  click(factory.homePage().sports);
	}
	
	@Then("below Athletic Clothing and Exercise & Fitness are present in department")
	public void belowAthleticClothingAndExerciseFitnessArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().athleticClothing));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().exerciseFitness));
	}
	
	@When("User on Automotive")
	public void userOnAutomotive() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		  click(factory.homePage().automative);
	}
	
	@Then("below Automative Parts & Accessories and MotorCycle & Powersports are present in department")
	public void belowAutomativePartsAccessoriesAndMotorCyclePowersportsArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().automativeAccessories));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().motorcycleAndPower));
	}

	
	
	
}
