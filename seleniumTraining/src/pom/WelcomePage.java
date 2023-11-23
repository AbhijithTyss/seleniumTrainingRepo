package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	// declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(id = "vote-poll-1")
	private WebElement voteButton;
	
	public WebElement getVoteButton() {
		return voteButton;
	}
	//getters
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
