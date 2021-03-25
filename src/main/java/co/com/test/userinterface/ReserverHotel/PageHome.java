package co.com.test.userinterface.ReserverHotel;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import sun.print.PSStreamPrinterFactory;
import sun.security.provider.PolicySpiFile;

@DefaultUrl("https://viajes.tiquetesbaratos.com/")
public class PageHome extends PageObject {


    public static final Target INPUT_DESTINATION = Target.the("destination entry").located(By.id("ap_dest_hotel"));
    public static final Target INPUT_DATE_ORIGIN = Target.the("button date origin").located(By.xpath("//input[@id='ap_dest_start']"));
    public static final Target INPUT_DATE_DESTINATION = Target.the("button date origin").located(By.xpath("//input[@id='ap_dest_end']"));
    public static final Target BTN_DAY_ORIGIN = Target.the("day of origin").located(By.xpath("//*[@id=\"ptw-ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[1]/a"));
    public static final Target BTN_DAY_DESTINATION = Target.the("button date destination").located(By.xpath("//*[@id=\"ptw-ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[1]/a"));
    public static final Target BTN_SEARCH = Target.the("button for load the information").located(By.xpath("//*[@id=\"ap_booker_Hotel_form\"]/div/div[6]/input[7]"));

}
