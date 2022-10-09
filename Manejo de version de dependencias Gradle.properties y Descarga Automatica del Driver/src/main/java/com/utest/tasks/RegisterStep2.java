package com.utest.tasks;

import com.utest.utils.ConsultExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.utest.userInterfaces.UtestStep2UI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegisterStep2 implements Task {
    ConsultExcel consultExcel = new ConsultExcel();
    String city = consultExcel.consultCell(0, "City");
    String postalCode = consultExcel.consultCell(0, "Postal Code");
    String country = consultExcel.consultCell(0, "Country");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(CITY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                WaitUntil.the(BTN_NEXT_DEVICES, isClickable()).forNoMoreThan(5).seconds(),
                Scroll.to(BTN_NEXT_DEVICES),
                Click.on(BTN_NEXT_DEVICES)
        );
    }

    public static Performable registerStep2() {
        return instrumented(RegisterStep2.class);
    }
}
