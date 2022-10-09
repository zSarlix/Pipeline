package com.utest.stepdefinitions;

import com.utest.config.SetTheStage;
import com.utest.page.UtestPage;
import com.utest.questions.QuestionFinalButton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;


import static com.utest.tasks.RegisterStep1.registerStep1;
import static com.utest.tasks.RegisterStep2.registerStep2;
import static com.utest.tasks.RegisterStep3.registerStep3;
import static com.utest.tasks.RegisterStep4.registerStep4;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUtestStepDefinitions {
    SetTheStage setTheStage = new SetTheStage();
    UtestPage utestPage;
    String msmButton = "Complete Setup chevron_right";

    @Given("that the {string} accesses the Utest page")
    public void thatTheAccessesTheUtestPage(String actor) {
        setTheStage.setTheStage();
        theActorCalled(actor).wasAbleTo(Open.browserOn(utestPage));
    }

    @When("the user performs the registration process")
    public void theUserPerformsTheRegistrationProcess() {
        theActorInTheSpotlight().attemptsTo(
                registerStep1()
        );
    }

    @Then("registration is successfully asserted with the Complete setup button.")
    public void registrationIsSuccessfullyAssertedWithTheCompleteSetupButton() {



    }
}