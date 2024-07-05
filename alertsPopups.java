package wow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertsPopups {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //alert with ok
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Thread.sleep(2000);
//        Alert alertWindow=driver.switchTo().alert();
//        System.out.println(alertWindow.getText());
//        alertWindow.accept();
//        Thread.sleep(2000);
//        driver.quit();
        //alert with input box along with ok and cancel
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Alert alertWindow = driver.switchTo().alert();
        System.out.println(alertWindow.getText());
        alertWindow.sendKeys("welcome");
        Thread.sleep(2000);
        alertWindow.accept();
        Thread.sleep(2000);
        driver.quit();

        //validation
        String act_text = driver.findElement(By.xpath("//p[@id='result' and @style='color:green']")).getText();
        String exp_text = "You entered: welcome";
        if (act_text.equals(exp_text)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        //driver.quit();
    }
}