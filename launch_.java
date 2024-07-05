package wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class launch_ {
public static void main(String args[]) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=15276656626570808941&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2367553");
    driver. switchTo(). newWindow(WindowType. TAB);
    driver.get("https://www.flipkart.com/?ef_id=EAIaIQobChMI55-B3azLhAMVozaDAx1vSgYYEAAYASAAEgKHd_D_BwE:G:s&s_kwcid=AL!739!3!685923345720!!!g!!&cmpid=sem_9790089436_Catchall_New_dsa_MinusProductPage_goog&gad_source=1&gclid=EAIaIQobChMI55-B3azLhAMVozaDAx1vSgYYEAAYASAAEgKHd_D_BwE");
    driver.close();
    System.out.println("Amazon page");

}
}
