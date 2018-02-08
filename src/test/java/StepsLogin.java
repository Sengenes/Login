import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;


public class StepsLogin{
	protected WebDriver driver;

@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:/WebDrivers/chromedriver.exe");
	driver=new ChromeDriver();
//	driver.get("https://github.com/login");
}
@Given("^un usuario registrado en la pagina$")
public void un_usuario_registrado_en_la_pagina() throws Exception {
	driver.get("https://github.com/login");
    throw new PendingException();
}

@When("^se ingresa \"([^\"]*)\" en campo user$")
public void se_ingresa_en_campo_user(String user) throws Exception {
	WebElement userInput=driver.findElement(By.id("login_field"));
    	userInput.sendKeys(user);
	//PageLogin.userInput.sendKeys(user); //Llama variable a la clase PageLogin, donde se declaró como estática. No funciona.
	/*PageLogin miLogin = new PageLogin(driver);
	miLogin.userInput.sendKeys(user);*/
    throw new PendingException();
    }

@When("^se ingresa \"([^\"]*)\" en campo pass$")
public void se_ingresa_en_campo_pass(String pass) throws Exception {
	WebElement passInput=driver.findElement(By.id("password"));
	passInput.sendKeys(pass);
//PageLogin.passInput.sendKeys(pass);
    throw new PendingException();
}
@When("^se presiona boton de Login$")
public void se_presiona_boton_de_Login() throws Exception {
	WebElement button=driver.findElement(By.xpath("(//input[@name='commit'])[2]"));
	button.click();
	//PageLogin.button.click();
    throw new PendingException();
}
@Then("^se muestra la pantalla de sesion iniciada$")
public void se_muestra_la_pantalla_de_sesion_iniciada() throws Exception {
	assertEquals(driver.getTitle(),"GitHub");
    throw new PendingException();
}

@Given("^un usuario no registrado en la pagina$")
public void un_usuario_no_registrado_en_la_pagina() throws Exception {
	driver.get("https://github.com/login");
    throw new PendingException();
}

@Then("^se muestra mensaje de error$")
public void se_muestra_mensaje_de_error() throws Exception {
	assertEquals(driver.findElement(By.id("js-flash-container")).getText(),"Incorrect username or password.");
    throw new PendingException();
}
@After
public void tearDown() {
	//driver.close();
}
}
