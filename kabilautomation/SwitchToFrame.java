import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://ui.vision/demo/webtest/frames/");
        driver1.switchTo().frame(driver1.findElement(By.xpath("//frame[@src=\"frame_3.html\"]")));
        WebElement frame1 = driver1.findElement(By.xpath("//input[@name=\"mytext3\"]"));
        frame1.sendKeys("hello");
        driver1.switchTo().defaultContent();
        driver1.switchTo().frame(driver1.findElement(By.xpath("//frame[@src=\"frame_2.html\"]")));
        WebElement frame2 = driver1.findElement(By.xpath("//input[@name=\"mytext2\"]"));
        frame2.sendKeys("peace");
        driver1.switchTo().defaultContent();
        driver1.switchTo().frame(driver1.findElement(By.xpath("//frame[@src=\"frame_1.html\"]")));
        WebElement frame3 = driver1.findElement(By.xpath("//input[@name=\"mytext1\"]"));
        frame3.sendKeys("peace");
    }
}
