package sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Ozellikler {
    public final  String tekYonKutusu = "one-way"; //id

    public final  String neredenKutusu = "general-booker-from"; //id

    public final String neredenSec = "//div[.='İstanbul Havalimanı (IST), İstanbulTürkiye']"; //xpath istanbul yazsın

    public final String neredenText = "//span[.='İstanbul']"; //xpath


    public final String nereyeKutusu = "general-booker-to"; //id

    public final String nereyeSec = "//div[.='Berlin Brandenburg Havalimanı (BER), BerlinAlmanya']"; //xpath berlin yazsın

    public final String nereyeText= "//span[.='Berlin']"; //xpath

  //  static String tekYonKutusuTex = "mini-booker-link booker-type-link activeBtn";


    public final String tarihSec = "//div[@id='general-booker-datapicker']//span[@class='date-view date-view-text-cell']";

    public final String tarihIleri = "//div[@id='booker-date-picker']//button[@class='vc-arrow vc-next vc-focus']";


    public final String tarihBelirle = "//div[@class='vc-day id-2024-05-26 day-26 day-from-end-6 weekday-1 weekday-position-7 weekday-ordinal-4 weekday-ordinal-from-end-1 week-4 week-from-end-2 in-month on-right vc-day-box-center-center']/div[@class='vc-day-content vc-focusable vc-focus vc-attr']";

    public final String gidisText = "//span[.='May']"  ; //xpath
   public final String tarihIcinKaydir = "//div[@class='vc-day id-2024-05-26 day-26 day-from-end-6 weekday-1 weekday-position-7 weekday-ordinal-4 weekday-ordinal-from-end-1 week-4 week-from-end-2 in-month on-right vc-day-box-center-center']/div[@class='vc-day-content vc-focusable vc-focus vc-attr']";

   public final String cookies = "cookieWarningRejectId";


   public final String ucusAra = "//a[.='Uçuş ara']" ;//xpath

    public final String hataDeneme1 = "//a[@id='header_rent_a_car']/div[@class='schedule-boxes-content font-weight-700']";

    public final String hataDeneme2 = "//a[@id='header_extra_baggage']/div[@class='schedule-boxes-content font-weight-700']";
    public final String hataKodu1 = "error-information-popup-container"; //id





    public AnaSayfa(WebDriver driver) {

        super(driver);
    }
}
