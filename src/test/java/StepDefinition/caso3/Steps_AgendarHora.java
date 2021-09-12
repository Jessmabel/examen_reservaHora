package StepDefinition.caso3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps_AgendarHora {
	private WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome(){
		System.out.println("Se abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8070/ReservaHora/index.jsp");
	}
	
	@When("ingresar Username {string} y Password {string}")
	public void ingresar_Username_y_Password(String string, String string2) throws InterruptedException{
		System.out.println("Se ingresa el nombre de usuario y contraseña en la pagina");
		driver.findElement(By.id("nombreUsuario")).sendKeys(string);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(string2);
		Thread.sleep(1000);
	}
	
	@Then("inicia sesion y agenda hora ingresando hora {string} y fehca {string}")
	public void inicia_sesion(String string, String string2) throws InterruptedException{
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo agendarHora.feature");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnAgendar")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hora")).sendKeys(string);
		Thread.sleep(1000);
		driver.findElement(By.id("fecha")).sendKeys(string2);
		Thread.sleep(1000);
		driver.findElement(By.id("btnGuardar")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("salir")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
