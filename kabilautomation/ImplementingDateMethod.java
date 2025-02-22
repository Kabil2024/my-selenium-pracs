import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingDateMethod{
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        DatePicker obj = new DatePicker();
        obj.datefixer(driver,"October 2025","20");
    }
}
