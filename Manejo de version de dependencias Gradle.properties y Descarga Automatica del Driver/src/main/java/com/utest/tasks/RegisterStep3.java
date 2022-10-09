package com.utest.tasks;

import com.utest.utils.ConsultExcel;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;

import java.io.IOError;
import java.io.IOException;
import java.util.logging.Level;

import static com.utest.userInterfaces.UtestStep3UI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegisterStep3 implements Task {
    ConsultExcel consultExcel = new ConsultExcel();
    String mobile = consultExcel.consultCell(0, "Mobile");
    String model = consultExcel.consultCell(0, "Model");
    String system = consultExcel.consultCell(0, "System");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_MOBILE),
                WaitUntil.the(MOBILE, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(mobile).into(MOBILE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(LIST_MODEL),
                WaitUntil.the(MODEL, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(model).into(MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(LIST_SYSTEM),
                WaitUntil.the(SYSTEM, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(system).into(SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(BTN_FINAL_STEP)
        );






    }
    public static Performable registerStep3() {
        return instrumented(RegisterStep3.class);
    }
}
