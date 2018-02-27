import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CWSPage {
    @Test
    public void testMessageArriving() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String name = "AutoTest "+date;
        String email = "CrysberryAutoTest1@mailinator.com";
        String phone = "123455678900";
        String message = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and " +
                "I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, " +
                "the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, " +
                "but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. " +
                "Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally " +
                "circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes " +
                "laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy " +
                "a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://crysberry.com");
        firefoxDriver.manage().window().maximize();
        firefoxDriver.findElement(By.xpath("//div[@class='toggle-menu']")).click();
        firefoxDriver.findElement(By.xpath("//button[@class='contact-form-button']")).click();
        firefoxDriver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        firefoxDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        firefoxDriver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
        firefoxDriver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(message);

        firefoxDriver.findElement(By.xpath("//button[@class='crys-button']")).click();
        firefoxDriver.quit();
    }
}


