package wow;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {
    public static void main(String args[]) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        Actions act=new Actions(driver);
        //ctrl+a
       act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //ctrl+c and ctl+v
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://toolsqa.com/selenium-webdriver/keyboard-events-in-selenium/");
        WebElement addressToPaste= driver.findElement(By.id("//input[@type='text' and @name='keyword' and @placeholder='Search' and @class='navbar__search--input w-100']"));
        addressToPaste.click();
      //  WebElement addressToPaste=driver.findElement(By.xpath("//input[@type='text' and @name='keyword' and @placeholder='Search' and @class='navbar__search--input w-100']"));
        addressToPaste.sendKeys(Keys.CONTROL);
        addressToPaste.sendKeys("v");
        Thread.sleep(5000);
        driver.quit();
    }
}
