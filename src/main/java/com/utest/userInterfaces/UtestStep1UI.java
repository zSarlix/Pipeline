package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestStep1UI {
    //STEP 1 PERSONAL DATA
    public static Target BTN_JOIN_TODAY = Target.the("Button join today").
            locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

    public static Target FIRST_NAME = Target.the("Input first name").
            locatedBy("//input[@id='firstName']");

    public static Target ERROR_FIRST_NAME = Target.the("Error Input first name").
            locatedBy("//span[@id='firstNameError']");

    public static Target LAST_NAME = Target.the("Input last name").
            locatedBy("//input[@id='lastName']");

    public static Target EMAIL = Target.the("Input Email").
            locatedBy("//input[@id='email']");

    public static Target MONTH = Target.the("Select month").
            locatedBy("//select[@id='birthMonth']");

    public static Target DAY = Target.the("Select day").
            locatedBy("//select[@id='birthDay']");

    public static Target YEAR = Target.the("Select year").
            locatedBy("//select[@id='birthYear']");

    public static Target BTN_NEXT_LOCATION = Target.the("Button Next location").
            locatedBy("//a[@aria-label='Next step - define your location']");


}
