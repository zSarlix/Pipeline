package com.utest.tasks;

import com.utest.utils.ConsultExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.utest.userInterfaces.UtestStep2UI.BTN_NEXT_DEVICES;
import static com.utest.userInterfaces.UtestStep4UI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterStep4 implements Task {
    ConsultExcel consultExcel = new ConsultExcel();
    String password = consultExcel.consultCell(0, "Password");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(PASSWORD),
                Enter.theValue(password).into(COMFIRM_PASSWORD),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY),
                Scroll.to(BTN_COMPLETE)
        );
    }
    public static Performable registerStep4() {
        return instrumented(RegisterStep4.class);
    }
}
