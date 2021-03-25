package co.com.test.tasks.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.test.userinterface.ReserverHotel.*;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.util.List;

import static co.com.test.userinterface.ReserverHotel.PageHome.*;

public class SearchHotel implements Task {
    //3
    private List<String> data;
    //4
    public SearchHotel(List<String> data) {
        this.data = data;
    }

    @Override //1
    public <T extends Actor> void performAs(T actor) {
        /*Es un metodo obligatorio al momento de implementar la interfaz Task el cual nos permite realizar acceiones de dicha tarea*/
       actor.attemptsTo(Enter.theValue(data.get(0)).into(INPUT_DESTINATION),
               Enter.theValue("12/10/2019").into(INPUT_DATE_ORIGIN),
               Enter.theValue("21/11/2019").into(INPUT_DATE_DESTINATION),
               Click.on(BTN_SEARCH));
    }
    //2
    public static SearchHotel searchHotel(List<String> data){
        return Tasks.instrumented(SearchHotel.class, data);
    }
}
