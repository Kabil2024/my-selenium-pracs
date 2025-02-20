import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
    public static void main(String [] args){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
        driver.manage().window().maximize();
        WebElement select = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
        Select se = new Select(select);
        se.selectByVisibleText("Albania");
    }
}
