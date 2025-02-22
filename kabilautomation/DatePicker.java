import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
    }
    void datefixer(WebDriver driver, String my, String date) {
        WebElement input = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        input.click();
        WebElement next = driver.findElement(By.xpath("//button[@aria-label=\"Next Month\"]"));
        String monthfinder = driver.findElement(By.xpath("//div[@class=\"react-datepicker__header\"]/child::div[1]")).getText();
        while (!monthfinder.equals(my)) {
            next.click();
            monthfinder = driver.findElement(By.xpath("//div[@class=\"react-datepicker__header\"]/child::div[1]")).getText();
        }
        WebElement dateee = driver.findElement(By.xpath("//div[text()='" + date + "']"));
        dateee.click();
    }

}
