package stepspack;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class steps {
    public static AndroidDriver d;
    //public Wait<WebDriver> = new WebDriverWait(d,wa)
    @Given("Merchant click sale button")
    public void merchant_click_sale_button() throws MalformedURLException, InterruptedException {
        DesiredCapabilities c= new DesiredCapabilities();
        c.setCapability("platformName","Android");
        c.setCapability("platformVersion","10");
        c.setCapability("udid","0123456789ABCDEF");
        c.setCapability("deviceName","NEW9220");
        c.setCapability("appPackage","com.worldline.bfl");
        c.setCapability("autoGrantPermissions", true);
        c.setCapability("appActivity","com.appz.bajaj.activity.SplashActivity");
        //c.setCapability("autoAcceptAlerts", true);
        //c.setCapability("appActivity","com.appz.bajaj.activity.TransSuccessActivity");

//		c.setCapability("appPackage","com.android.camera2");
//		c.setCapability("appActivity","com.android.camera.CameraActivity");


        c.setCapability("automationName", "uiautomator2");
        URL url = new URL("http://0.0.0.0:4723/");
        // url= new URL(" http://172.25.80.1:4723/");
        d= new AndroidDriver(url,c);

        Thread.sleep(3000);

        WebElement wifi =d.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.worldline.bfl:id/btnWifi\"]"));

        Wait<WebDriver> wait = new WebDriverWait(d, Duration.ofSeconds(5));
        wait.until(d -> wifi.isDisplayed());
        wifi.click();

        WebElement wifidone = d.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.settings:id/done']"));

        wait.until(d -> wifidone.isDisplayed());

        wifidone.click();

        Wait<WebDriver> wait2 = new WebDriverWait(d, Duration.ofSeconds(5));
        WebElement EnterTid= d.findElement(By.xpath("//android.widget.EditText[@resource-id='com.worldline.bfl:id/name_edit_password']"));
        wait2.until(d -> EnterTid.isDisplayed());
        EnterTid.sendKeys("1512148U");
//
        WebElement Tiddone= d.findElement(By.xpath("//android.widget.Button[@resource-id='com.worldline.bfl:id/download']"));
Wait<WebDriver> wait3=new WebDriverWait(d,Duration.ofSeconds(10));
wait3.until(d-> Tiddone.isDisplayed());
Tiddone.click();
Thread.sleep(10000);

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='com.worldline.bfl:id/btnYes']")));
phone.click();

//        WebElement phoneDone=d.findElement(By.xpath("//android.widget.Button[@resource-id='com.worldline.bfl:id/btnYes']"));
        Wait<WebDriver> wait4=new WebDriverWait(d,Duration.ofSeconds(40));
//        wait4.until(d-> phoneDone.isDisplayed());
// phoneDone.click();

        Thread.sleep(10000);
WebElement Salebtn=d.findElement(By.xpath("//android.widget.TextView[@resource-id='com.worldline.bfl:id/tvScan']"));
wait4.until(d -> Salebtn.isDisplayed());
Salebtn.click();





    }

    @When("Merchant Enter {string} and click next")
    public void merchant_enter_and_click_next(String string) {

        Wait<WebDriver> wait = new WebDriverWait(d,Duration.ofSeconds(5));
        WebElement Amount=d.findElement(By.id("com.worldline.bfl:id/edAmount"));
wait.until(d -> Amount.isDisplayed());

WebElement five=d.findElement(By.xpath("//android.widget.TextView[@resource-id='com.worldline.bfl:id/tvFive']"));
wait.until(d -> five.isDisplayed());
five.click();

WebElement doublezero=d.findElement(By.xpath("//android.widget.TextView[@resource-id='com.worldline.bfl:id/tvDoubleZero']"));
wait.until(d -> doublezero.isDisplayed());
doublezero.click();
doublezero.click();
doublezero.click();

WebElement next=d.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.worldline.bfl:id/btnNext\"]"));
wait.until(d -> next.isDisplayed());
next.click();

    }

    @When("Merchant adding {string} and click next")
    public void merchant_adding_and_click_next(String string) {
        Wait<WebDriver> wait= new WebDriverWait(d,Duration.ofSeconds(10));
        WebElement tip1=d.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.worldline.bfl:id/btnTipOne\"]"));
wait.until(d -> tip1.isDisplayed());
tip1.click();

WebElement tipnext=d.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.worldline.bfl:id/btnTipNext\"]"));
wait.until(d -> tipnext.isDisplayed());
tipnext.click();
//System.out.println(d.getPageSource());

    }

    @When("Merchant keeping card for transaction and waiting to complete transaction")
    public void merchant_keeping_card_for_transaction_and_waiting_to_complete_transaction() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);

    }

    @Then("Merchant verifying transaction success message in screen")
    public void merchant_verifying_transaction_success_message_in_screen() {
        Wait<WebDriver> wait= new WebDriverWait(d,Duration.ofSeconds(10));
        WebElement successscreen=d.findElement(By.xpath("//android.widget.TextView[@resource-id='com.worldline.bfl:id/tvAddress']"));
wait.until(d -> successscreen.isDisplayed());
System.out.println(successscreen.getText());

    }

    @Then("Merchant printing the merchant copy")
    public void merchant_printing_the_merchant_copy() {
        Wait<WebDriver> wait= new WebDriverWait(d,Duration.ofSeconds(10));
WebElement merchantcopy=d.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.worldline.bfl:id/ivMerchant']"));
wait.until(d -> merchantcopy.isDisplayed());
merchantcopy.click();
//
    }

    @Then("Merchant printing the customer copy")
    public void merchant_printing_the_customer_copy() {
        Wait<WebDriver> wait= new WebDriverWait(d,Duration.ofSeconds(10));
WebElement customercopy=d.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.worldline.bfl:id/ivCustomerCpy\"]"));
wait.until(d -> customercopy.isDisplayed());
customercopy.click();
    }

    @Then("Merchant click done to get back to home screen")
    public void merchant_click_done_to_get_back_to_home_screen() {
        Wait<WebDriver> wait= new WebDriverWait(d,Duration.ofSeconds(10));
WebElement saledone=d.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.worldline.bfl:id/btnNext\"]"));
wait.until(d -> saledone.isDisplayed());
saledone.click();
    }
}