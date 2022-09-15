package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HU_001_Realizar_LoginPage {
	
	public HU_001_Realizar_LoginPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement campoUsername; 
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	public WebElement campoPassword; 
	
	@FindBy(xpath = "//button[.=\" Login \"]")
	public WebElement buttonLogin; 
	
	@FindBy(xpath = "//img[@alt=\"client brand logo\"]")
	public WebElement validarAutenticacao; 
	
	@FindBy(xpath = "//p[.=\"Invalid credentials\"]")
	public WebElement mensagemInvalidCredentials; 
	
	@FindBy(xpath = "//span[.=\"Required\"]")
	public WebElement mensagemRequiredUsername; 
	
	@FindBy(xpath = "//span[.=\"Required\"]")
	public WebElement mensagemRequiredPsassword; 

}
