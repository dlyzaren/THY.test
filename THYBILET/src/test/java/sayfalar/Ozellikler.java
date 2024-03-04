package sayfalar;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;




public class Ozellikler {

    static int milis = 1500;
    static SoftAssert softAssert;

    WebDriver driver;

    // private WebDriver; bu ne alaka
    public Ozellikler(WebDriver driver) {
        this.driver = driver;

    }

    public void tiklaId(String tusId) {
        driver.findElement(By.id(tusId)).click();

    }

    public void tiklaXpath(String tusId) {
        driver.findElement(By.xpath(tusId)).click();

    }
    public void tiklaCss(String tusId) {
        driver.findElement(By.cssSelector(tusId)).click();

    }

    public void yaziYazId(String elementId, String yazi) {
       WebElement enter = driver.findElement(By.id(elementId));
       enter.sendKeys(yazi);

    }
    public void yaziYazCss(String elementId, String yazi) {
        WebElement enter = driver.findElement(By.cssSelector(elementId));
        enter.sendKeys(yazi);

    }

    public void yaziSilId(String elementId){

        WebElement silinecek = driver.findElement(By.id(elementId));
        silinecek.sendKeys(Keys.CONTROL + "a");
        silinecek.sendKeys(Keys.DELETE);
    }


    public void yonKutusuTikli(String elementId) throws InterruptedException {
        WebElement kontrol = driver.findElement(By.id(elementId));
        kontrol.click();

        Thread.sleep(milis);

       // boolean tiklimi= kontrol.isSelected();
       // System.out.println("Buton durumu " +tiklimi);
        //System.out.println("Checkbox durumu: "  );
        String classAttributeValue = kontrol.getAttribute("class");

        // "activeBtn" sınıfının olup olmadığını kontrol edin
        boolean isActive = classAttributeValue != null && classAttributeValue.contains("activeBtn");

        System.out.println("Button is active: " + isActive);



    }
    public void yonKutusuTikliXpath(String elementId) throws InterruptedException {
        WebElement kontrol = driver.findElement(By.xpath(elementId));
        //kontrol.click();

        Thread.sleep(milis);

        boolean tiklimi = kontrol.isEnabled();
        System.out.println("Checkbox durumu: " + tiklimi);

        Assert.assertTrue(tiklimi);

    }

    public void beklemeId(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }

    public void beklemeXpath(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));


    }

    public void beklemeCss(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));


    }

    public void kaydirXpath(String elementId) {
        WebElement kaydir = driver.findElement(By.xpath(elementId));

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].scrollIntoView();", kaydir);

    }


    public void kaydirId(String elementId) {
        WebElement kaydir = driver.findElement(By.id(elementId));

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].scrollIntoView();", kaydir);

    }

    public void kaydirPix() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0, 200);");
    }

    public void kontrolId(String elementId, String beklenenMesaj) {
        String gelenMesaj = driver.findElement(By.id(elementId)).getText();
        Assertions.assertEquals(beklenenMesaj, gelenMesaj);
        System.out.println("Beklenen mesaj; " + beklenenMesaj + " Gelen mesaj ; " + gelenMesaj);

    }

    public void kontrolXpath(String elementId, String beklenenMesaj) {
        String gelenMesaj = driver.findElement(By.xpath(elementId)).getText();
        Assertions.assertEquals(beklenenMesaj, gelenMesaj);
        System.out.println("Beklenen mesaj; " + beklenenMesaj + " Gelen mesaj ; " + gelenMesaj);

    }
    public void linkKontrol(String beklenenLink) {
        String gelenlink = driver.getCurrentUrl();
        Assertions.assertEquals(beklenenLink,gelenlink);
        System.out.println("Uçuş seçme sayfasındasınız " + gelenlink);



    }

    public void  mouseKaydir(String elementId){

        WebElement sec = driver.findElement(By.xpath(elementId));

        Actions actions = new Actions(driver);
        actions.moveToElement(sec).click().perform();
    }
    public void hataKoduYazdir (String elementId){
      String hata=  driver.findElement(By.id(elementId)).getText();
        System.out.println("Alınan hata kodu " +hata);
    }

    public void kontrolSoftId(String elementId, String beklenenMesaj1 ) {
        softAssert = new SoftAssert();
        String hata = driver.findElement(By.id(elementId)).getText();

        softAssert.assertEquals(hata,beklenenMesaj1);
        softAssert.assertAll();


    }
    public void gozukeneKadarBekleXpath (String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));

    }

}

