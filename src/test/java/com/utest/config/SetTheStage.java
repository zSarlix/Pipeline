package com.utest.config;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStage {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
