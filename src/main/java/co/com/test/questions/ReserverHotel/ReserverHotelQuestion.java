package co.com.test.questions.ReserverHotel;

import co.com.test.userinterface.ReserverHotel.PageBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class ReserverHotelQuestion implements Question<String> {
    @Override
        public String answeredBy(Actor actor) {
        return Text.of(PageBuy.LABEL_BUY).viewedBy(actor).asString();
}




}
