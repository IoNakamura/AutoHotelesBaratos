package co.com.test.userinterface.ReserverHotel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHotelDetail extends PageObject {
    public static final Target BTN_RESERVER = Target.the("select the hotel").located(By.xpath("/html/body/app-root/div/app-detail/div/div[3]/div/app-detail-room-list/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[3]/div/button"));

}
