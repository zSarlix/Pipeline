package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestStep2UI {

    //STEP 2 LOCATION DATA
    public static Target CITY = Target.the("Input city").
            locatedBy("//input[@id='city']");
    public static Target POSTAL_CODE = Target.the("Input Postal code").
            locatedBy("//input[@id='zip']");
    public static Target COUNTRY = Target.the("Select country").
            locatedBy("//input[@placeholder='Select a country']");
    public static Target BTN_NEXT_DEVICES = Target.the("Button next devices").
            locatedBy("//a[@aria-label='Next step - select your devices']");

    //STEP 3 DEVICES DATA


}
