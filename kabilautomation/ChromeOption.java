import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        //options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"}); //to remove chrome is being controlled by automated
//        options.addArguments("--headless=new");
        ChromeDriver driver1 = new ChromeDriver(options);
//        driver1.get("https://www.flipkart.com/");
//        System.out.println(driver1.getCurrentUrl());
//        if (driver1.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
//            System.out.println("test pass");
//            System.out.println(driver1.getTitle());
//        }else {
//            System.out.println("test fail");
//            System.out.println(driver1.getTitle());
//        }
        driver1.get("https://expired.badssl.com/");


    }
}
