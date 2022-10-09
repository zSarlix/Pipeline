package com.utest.tasks;

import com.utest.exceptions.ExceptionGeneric;
import com.utest.utils.ConsultExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.userInterfaces.UtestStep1UI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class RegisterStep1 implements Task {

    ConsultExcel consultExcel = new ConsultExcel();
    String name = consultExcel.consultCell(0, "First name");
    String lastName = consultExcel.consultCell(0, "Last name");
    String emailAddress = consultExcel.consultCell(0, "Email address");
    String month = consultExcel.consultCell(0, "Month");
    String day = consultExcel.consultCell(0, "Day");
    String year = consultExcel.consultCell(0, "Year");


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_JOIN_TODAY, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue(name).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(emailAddress).into(EMAIL),
                SelectFromOptions.byVisibleText(month).from(MONTH),
                SelectFromOptions.byVisibleText(day).from(DAY),
                SelectFromOptions.byVisibleText(year).from(YEAR),
                Scroll.to(BTN_NEXT_LOCATION),
                Click.on(BTN_NEXT_LOCATION)
        );
        actor.should(seeThat(the(ERROR_FIRST_NAME),isNotVisible()).orComplainWith(ExceptionGeneric.class,
                        "Error in input name," +
                                "No es posible seguir con el formulario")
        );

    }
    public static Performable registerStep1() {
        return instrumented(RegisterStep1.class);
    }
}
