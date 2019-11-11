package com.talentech.pom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.talentech.baseclass.baseclass;
import com.talentech.hooks.ReadExcelSheetData;

public class NewtoursHomePage extends baseclass {
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
    public WebElement linkRegister;

    @FindBy(xpath="//input[@name='userName']")
    public WebElement txtUserName;

	public void loadNewtours(){
		System.setProperty("webdriver.chrome.driver", "c:/webdrivers/chromedriver.exe");
		driver= new ChromeDriver();
		PageFactory.initElements(driver, this);
    	driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	}
	
	public void navigateRegister(){
		linkRegister.click();
	}
	
	public void excelReader() throws Exception{
		System.out.println(">>>>>>>>>>>>" + ReadExcelSheetData.getMapData("FirstName"));
	}
	
	@FindBy(xpath="//input[@name='firstName']")
    public WebElement First;
	
	@FindBy(xpath="//input[@name='lastName']")
    public WebElement Last;
	
	@FindBy(xpath="//input[@name='phone']")
    public WebElement Phone;
	
	@FindBy(xpath="//input[@name='userName']")
    public WebElement Email;
	
	@FindBy(xpath="//input[@name='address1']")
    public WebElement Address;

	@FindBy(xpath="//input[@name='city']")
    public WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
    public WebElement State;
	
	@FindBy(xpath="//input[@name='postalCode']")
    public WebElement Postal;
		
	@FindBy(xpath="//input[@name='email']")
    public WebElement User;
	
	@FindBy(xpath="//input[@name='password']")
    public WebElement Password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
    public WebElement Confirm;
	
	@FindBy(xpath="//input[@name='register']")
    public WebElement Register;
	
	public void contactInfo() {
		First.sendKeys("Bob");
		Last.sendKeys("Bob");
		Phone.sendKeys("123456");
		Email.sendKeys("Bob@bob.com");
	}
	
	public void mailingInfo () {
		Address.sendKeys("Bob");
		City.sendKeys("Bob");
		State.sendKeys("Bob");
		Postal.sendKeys("Bob");
		Select Country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		Country.selectByVisibleText("TURKEY");
	}
	
	public void userInfo () {
		User.sendKeys("Bob");
		Password.sendKeys("Bob");
		Confirm.sendKeys("Bob");
	}
	public void submit () {
		Register.click();
	}
	
}
