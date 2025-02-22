import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingDateMethod extends DatePicker{
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        ImplementingDateMethod obj = new ImplementingDateMethod();
        obj.datefixer(driver,"October 2025","20");
    }
}
