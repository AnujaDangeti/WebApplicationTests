package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoardActions1 {
    public static void main(String[] args) throws InterruptedException {

        // Initialize ChromeDriver
        // Here we assume that the ChromeDriver path has been set in the System Global variables
        WebDriver driver=new ChromeDriver();

        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");

        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");

        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");

        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        Thread.sleep(2000);
        // Copy the Current Address
//        Actions act=new Actions(driver);
//       currentAddress(act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//       currentAddress(act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();


//        currentAddress.sendKeys(Keys.CONTROL);
//        currentAddress.sendKeys("A");
//        currentAddress.sendKeys(Keys.CONTROL);
//        currentAddress.sendKeys("C");
//        Thread.sleep(2000);
//        //Press the TAB Key to Switch Focus to Permanent Address
//        currentAddress.sendKeys(Keys.TAB);
//        Thread.sleep(2000);
//        //Paste the Address in the Permanent Address field
//        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
//        permanentAddress.sendKeys(Keys.CONTROL);
//        permanentAddress.sendKeys("V");
//        Thread.sleep(2000);
//        //Compare Text of current Address and Permanent Address
//     //  assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));

        driver.close();

    }

}
