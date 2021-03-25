package co.com.test.tasks.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageHotelDetail;
import co.com.test.userinterface.ReserverHotel.PageSearchHotels;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;



public class SelectHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(4000);
        actor.attemptsTo(Click.on(PageSearchHotels.BTN_SELECT_THIS_HOTEL));

        /*new InternalSystemClock().pauseFor(4000);
        List<WebElementFacade> hoteles =  PageSearchHotels.DIV_HOTELS.resolveAllFor(actor);
        int valorMenor=100000000;
        int aux=0;
        int fila;
        for (int i=0; i> hoteles.size();i++){
            String precio = hoteles.get(i).getText();
            precio = precio.replace(".","");
            aux = Integer.parseInt(precio.substring(4));
            if(aux<valorMenor){
                valorMenor = aux;
                fila = i;
            }
        }*/
    }

    public static SelectHotel byFilter(){
        return Tasks.instrumented(SelectHotel.class);
    }
}
