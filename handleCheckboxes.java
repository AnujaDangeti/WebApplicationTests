package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class handleCheckboxes {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phppot.com/demo/getting-checkbox-values-in-jquery/");
       //clicking single checkbox
        //driver.findElement(By.id("language1")).click();
       //total number of check boxes
      List<WebElement> Checkboxs= driver.findElements(By.xpath("//input[@type='checkbox' and @name='language']"));
      System.out.println("total number of checkboxs is " +Checkboxs.size());
      //clicking all checkboxes using for loop
        for(int i=0; i<Checkboxs.size();i++)
        {
            Checkboxs.get(i).click();
        }
        //cliking and closing one by one using foreach loop
//        for(WebElement check:Checkboxs)
//        {
//            check.click();
//            Thread.sleep(2000);
//            check.click();
//            Thread.sleep(2000);
//        }
        //clicking all boxes using foreach loop
//        for(WebElement check:Checkboxs) {
//            check.click();
//        }
        //unselect all checkboxs
        for(int i=0; i<Checkboxs.size();i++)
       {
          if(Checkboxs.get(i).isSelected()) //isSelected=It will uncheck already checked boxes
          {
              Checkboxs.get(i).click();
              Thread.sleep(2000);
          }
       }
driver.quit();

    }
}
