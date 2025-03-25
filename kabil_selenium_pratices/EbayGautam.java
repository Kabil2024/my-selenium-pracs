import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EbayGautam {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pay.ebay.com/rxo?action=view&sessionid=2387966593011");
        WebElement countryOption = driver.findElement(By.xpath("//select[@autocomplete=\"country\"]"));
        List<WebElement> totalCountry = driver.findElements(By.xpath("//select[@autocomplete=\"country\"]//child::option"));
        System.out.println(totalCountry.size());
        Select select = new Select(countryOption);
        select.selectByIndex(2);

    }
}
