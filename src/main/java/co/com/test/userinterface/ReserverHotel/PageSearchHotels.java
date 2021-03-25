package co.com.test.userinterface.ReserverHotel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageSearchHotels extends PageObject {
    public static final Target BTN_SELECT_THIS_HOTEL = Target.the("Hotel Economy").located(By.xpath("/html/body/app-root/pth-booking/div/pth-loading/ng-component/pth-default-routing/pth-booking-list/div/div[2]/pth-hotel-list/pth-list/div[4]/pth-hotel-item/div/pth-rate-container/div/pth-button-container/div/pth-offer-detail-button/a"));
    public static final Target DIV_HOTELS     = Target.the("div hotels").located(By.xpath("//span[@class='product-rate-final']"));
}
