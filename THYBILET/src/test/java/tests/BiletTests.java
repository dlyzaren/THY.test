package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import sayfalar.AnaSayfa;
import sayfalar.UcusSec;
import sayfalar.YolcuBilgileri;

public class BiletTests {

    static WebDriver driver;
    static  AnaSayfa anaSayfa;

    static UcusSec ucusSec;

    static YolcuBilgileri yolcuBilgileri;


    static int milis= 1500;

    @BeforeClass

    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.turkishairlines.com/tr-tr/");  // 06 ve 07 testleri için kullanılabilir
       //  driver.get("https://www.turkishairlines.com/tr-int/ucak-bileti/rezervasyon/availability-international/?cId=72fd8381-2207-47f2-892f-d5790c3a44ce");  TEST 04 İÇİN
       // driver.get("https://www.turkishairlines.com/tr-int/ucak-bileti/rezervasyon/yolcu-bilgileri/?cId=72fd8381-2207-47f2-892f-d5790c3a44ce");  TEST 05 İÇİN

        anaSayfa = new AnaSayfa(driver);
        ucusSec = new UcusSec(driver);
        yolcuBilgileri = new YolcuBilgileri(driver);


    }

    @AfterClass
    public static void tearDown(){driver.quit();
   }

    @Test
    public void test01() throws InterruptedException {

        anaSayfa.yonKutusuTikli(anaSayfa.tekYonKutusu);

        anaSayfa.tiklaId(anaSayfa.cookies);
        Thread.sleep(milis);


    }
    @Test
    public void test02() throws InterruptedException {

        anaSayfa.yaziSilId(anaSayfa.neredenKutusu);
        Thread.sleep(milis);
        anaSayfa.tiklaId(anaSayfa.neredenKutusu);
        anaSayfa.yaziYazId(anaSayfa.neredenKutusu,"İstanbul");
        Thread.sleep(milis);
        anaSayfa.beklemeXpath(anaSayfa.neredenSec);

        anaSayfa.mouseKaydir(anaSayfa.neredenSec);
        Thread.sleep(milis);

        anaSayfa.yaziYazId(anaSayfa.nereyeKutusu,"Almanya");
        anaSayfa.beklemeXpath(anaSayfa.nereyeSec);
        anaSayfa.mouseKaydir(anaSayfa.nereyeSec);
        Thread.sleep(milis);


        anaSayfa.tiklaXpath(anaSayfa.tarihIleri);
        anaSayfa.kaydirXpath(anaSayfa.tarihIcinKaydir);
        Thread.sleep(milis);
        anaSayfa.tiklaXpath(anaSayfa.tarihBelirle);
        Thread.sleep(milis);
        anaSayfa.kontrolXpath(anaSayfa.neredenText,"İstanbul");
        anaSayfa.kontrolXpath(anaSayfa.nereyeText,"Berlin");
        anaSayfa.kontrolXpath(anaSayfa.gidisText,"May"); //26 ve may i ayrı ayrı almış buyüzden şimdilik sadece may i alıyorum



}
@Test
 public void test03() throws InterruptedException {

    anaSayfa.tiklaXpath(anaSayfa.ucusAra);
    Thread.sleep(milis);
    Thread.sleep(milis);
    anaSayfa.beklemeCss(ucusSec.sayfayiBekle);
    anaSayfa.linkKontrol("https://www.turkishairlines.com/tr-int/ucak-bileti/rezervasyon/availability-international/?cId=a8d81a88-5c1e-4a22-adf2-dd8178a42d9c");


 }

 @Test
    public void test04() throws InterruptedException {

        ucusSec.beklemeCss(ucusSec.gozukeneKadar);
        ucusSec.kaydirXpath(ucusSec.economySec);
        ucusSec.tiklaXpath(ucusSec.ucusButon);
        ucusSec.yonKutusuTikliXpath(ucusSec.ucusButonTik);
        ucusSec.tiklaXpath(ucusSec.ucusuSec);
        ucusSec.gozukeneKadarBekleXpath(ucusSec.ecoFlyKAl);
        ucusSec.tiklaXpath(ucusSec.ecoFlyKAl);

       //bileti tamamla

     ucusSec.tiklaCss(ucusSec.devam); }

     @Test
     public void test05() {
         yolcuBilgileri.tiklaXpath(yolcuBilgileri.bayan);
         yolcuBilgileri.tiklaCss(yolcuBilgileri.isimGir);
         yolcuBilgileri.yaziYazCss(yolcuBilgileri.isimGir, "Esra ");

         yolcuBilgileri.tiklaCss(yolcuBilgileri.soyisimGir);
         yolcuBilgileri.yaziYazCss(yolcuBilgileri.soyisimGir, "A");

         yolcuBilgileri.tiklaCss(yolcuBilgileri.soyisimGir);
         yolcuBilgileri.yaziYazCss(yolcuBilgileri.dogumGir, "26052000");

         yolcuBilgileri.kaydirXpath(yolcuBilgileri.iletisimBilgi);
         yolcuBilgileri.tiklaId(yolcuBilgileri.mail);
         yolcuBilgileri.yaziYazId(yolcuBilgileri.mail, "earac265@gmail.com");

         yolcuBilgileri.tiklaXpath(yolcuBilgileri.alanKodu);
         yolcuBilgileri.kaydirXpath(yolcuBilgileri.turkiyeAlanKodu);

         yolcuBilgileri.tiklaId(yolcuBilgileri.telefon);
         yolcuBilgileri.yaziYazId(yolcuBilgileri.telefon, "1111111111");

         yolcuBilgileri.tiklaXpath(yolcuBilgileri.izin1);
         yolcuBilgileri.tiklaXpath(yolcuBilgileri.izin2);


     }

     @Test
    public void test06() throws InterruptedException {
        Thread.sleep(milis);
         anaSayfa.tiklaId(anaSayfa.cookies);
         anaSayfa.tiklaXpath(anaSayfa.hataDeneme1);
         anaSayfa.kontrolSoftId(anaSayfa.hataKodu1,"Araç kiralama sitesine yöneldirilmesi bekleniyor");







     }
    @Test
    public void test07() throws InterruptedException {
        Thread.sleep(milis);
        anaSayfa.tiklaId(anaSayfa.cookies);
        anaSayfa.tiklaXpath(anaSayfa.hataDeneme2);
        anaSayfa.kontrolSoftId(anaSayfa.hataKodu1,"Koltuk seçimi sitesine yönlendirilmesi bekleniyor");
        anaSayfa.hataKoduYazdir(anaSayfa.hataKodu1);



    }














 }


