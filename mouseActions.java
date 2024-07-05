package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mouseActions {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/index.php?route=marketplace/extension&filter_search=mobile%20app");
        //mouse over
        WebElement market=driver.findElement(By.xpath("//a[text()='Marketplaces']"));
        WebElement themes=driver.findElement((By.xpath("//a[text()='Themes']")));
        System.out.println(market.getText());
        Actions act=new Actions(driver);
        act.moveToElement(market).moveToElement(themes).click().build().perform();
        Thread.sleep(2000);
        //right click
        WebElement lang=driver.findElement(By.xpath("//a[text()='Languages']"));
        act.contextClick(lang).perform();
        Thread.sleep(2000);
        //double click
        WebElement payment=driver.findElement(By.xpath("//a[text()='Payment Gateways']"));
        act.doubleClick(payment).perform();
        Thread.sleep(2000);
       // drag and drop with source and target element
//        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
//        Actions act=new Actions(driver);
//        WebElement stock=driver.findElement(By.xpath("//div[@id='box2' and @dragableelement='1']"));
//        WebElement it=driver.findElement(By.xpath("//div[@id='box106']"));
//        act.dragAndDrop(stock,it).perform();
//        Thread.sleep(2000);
       // dragging sliders ( source element is there but targer element is not there)
//        driver.get("https://javascript.info/mouse-drag-and-drop");
//         Actions act=new Actions(driver);
//        WebElement slider=driver.findElement(By.xpath("//img[@id='ball' and @style='position: absolute; z-index: 1000; left: 97px; top: 157px;']"));
//        System.out.println("current location " +slider.getLocation());
//        act.dragAndDropBy(slider,50,100).perform();
//        Thread.sleep(2000);



        driver.quit();

    }
}
