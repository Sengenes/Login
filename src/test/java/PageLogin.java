import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
//Localización de campos en URL https://github.com/login
	@FindBy(id="login_field")
	@CacheLookup
	public WebElement userInput;

	@FindBy(id="password")
	public WebElement passInput;

	@FindBy(xpath=".//*[@id='login']/form/div[4]/input[3]")
	public WebElement button;

	public PageLogin(WebDriver driver){
		if(!"Sign in to GitHub · GitHub".equals(driver.getTitle()))
			throw new IllegalStateException("Not GitHub login page");
		PageFactory.initElements(driver, this);//Permite la utilizacion de @FindBy en vez de inicializar cada elemento con findElement(By....(""));
	}

}
