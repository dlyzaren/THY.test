package sayfalar;

import org.openqa.selenium.WebDriver;

public class UcusSec extends Ozellikler{

    public final String sayfayiBekle = ".fs-24";
    public final String economySec = "//div[@class='rangeslidercontent without-canvas']/div[4]//div[@class='price-segment']"; //xpath
    public final String ucusButon = "//div[@class='rangeslidercontent without-canvas']/div[4]//span[@class='check']"; //xpath

    public final String ucusButonTik = "//div[@class='price-col eu open']//span[@class='check']";

    public final String ucusuSec = "//div[@class='rangeslidercontent without-canvas']/div[4]//div[@class='box-footer']"; //xpath

    public final String gozukeneKadar = ".fs-24"; //css bu silinecek

    public final String ecoFlyKAl= "//div[@class='modal fade extra-fly-upgrade-modal overflow-x-hidden show']//a[.=\"EcoFly'da Kal\"]"; //xpath

    public final String devam = ".complete-availability-button"; //css



    public UcusSec(WebDriver driver) {
        super(driver);
    }
}
