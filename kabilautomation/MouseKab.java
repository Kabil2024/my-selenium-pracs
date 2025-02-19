import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKab {
    public static void main(String[] args) {
        // ChromeDriver driver = new ChromeDriver();
        ChromeDriver driver1 = new ChromeDriver();
        Actions actions = new Actions(driver1);
//        driver.get("https://www.flipkart.com/");
//        driver.manage().window().maximize();
//        WebElement hover1 = driver.findElement(By.xpath("//span[text()='Fashion']"));
//        WebElement hover2 = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
//        actions.moveToElement(hover1).moveToElement(hover2).build().perform();
//        driver.quit();
        driver1.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightclick = driver1.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightclick).perform();
        WebElement edit = driver1.findElement(By.xpath("//span[text()='Edit']"));
      Action later =  actions.moveToElement(edit).click().build(); // understand this carefully Actions is a interface and here Action is a datatype we can store the element(created from actions(actions.findele....)and by calling build method is executun is ready and alos we can perform it later by calling the later varible . perform
       // driver1.switchTo().alert().accept();

    }
}
