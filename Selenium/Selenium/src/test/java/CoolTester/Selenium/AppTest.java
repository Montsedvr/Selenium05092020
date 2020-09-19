package CoolTester.Selenium;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;



public class AppTest 
{
   
           
    public static void main ( String []args)
 
    {
        System.out.println("Curso Septiembre 05.09.2020");
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//tomando driver em el sistema
        System.setProperty("webdriver.chrome.driver",exePath + "chromedriver.exe");//seteando la propiedad del .exe
        WebDriver driver = new ChromeDriver ();//inicializando el driver
        driver.get ("https://www.google.com");
        
    }
}
