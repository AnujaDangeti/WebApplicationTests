package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class drpDownPractice {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        WebElement elements=driver.findElement(By.id("country-list"));
        Select elementsInDrp=new Select(elements);
        elementsInDrp.selectByIndex(3);
        Thread.sleep(2000);
        elementsInDrp.selectByValue("2");
        Thread.sleep(2000);
        elementsInDrp.selectByVisibleText("USA");
        Thread.sleep(2000);
        List<WebElement> elementsInDrpList=elementsInDrp.getOptions();
        System.out.println("Number of elements in dropdownList:" +elementsInDrpList.size());
        for(WebElement c: elementsInDrpList)
        {
            System.out.println(c.getText());
        }




    }
}