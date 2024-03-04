package sayfalar;

import org.openqa.selenium.WebDriver;

public class YolcuBilgileri extends Ozellikler{


    public final String bayan = "//div[@class='col-12 col-md-12 col-lg-4 col-xl-5 tk-input-field has-feedback-lg error-msg-fix-algn mb-10-mbl ps-0-mbl ms-0-mbl mb-0 d-flex ps-0']/div[2]//span[@class='check-gender']"; //// xpath
    public final String isimGir = "[placeholder='Adı / İkinci adı (kimlikte yazıldığı gibi)']"; //css

    public final String  soyisimGir = "[placeholder='Soyadı (kimlikte yazıldığı gibi)']"; //css

    public final String dogumGir = "[placeholder='GG/AA/YYYY']"; //css

    public final String iletisimBilgi= "//div[@class='row profile-contact-panel']//div[@class='card-title clearfix']"; //cpath

    public final String mail="email"; //id

    public final String alanKodu = "//span[contains(.,'Seçin')]" ; //xpath

    public final String turkiyeAlanKodu = "//div[@class='dropdown-menu open show']//li[2]//span[.='Türkiye']"; //xpath


    public final String telefon = "phonenumber";

    public final String  izin1 = "//label[@class='form-check small-metro metro-checkbox normal nomargin checkbox-text-partial mb-0 pb-5 d-inline-block whitespace']/span[@class='check ms-0-web elem-icon']";
    public  final String izin2 ="//label[@class='form-check small-metro metro-checkbox normal nomargin checkbox-text-partial mb-0 d-inline-block whitespace']/span[@class='check ms-0-web elem-icon']";


    public YolcuBilgileri(WebDriver driver) {
        super(driver);
    }
}
