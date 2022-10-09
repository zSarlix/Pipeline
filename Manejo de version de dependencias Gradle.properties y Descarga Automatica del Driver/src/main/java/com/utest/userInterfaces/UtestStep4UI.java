package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestStep4UI {
    //STEP 4 PASSWORD DATA

    public static Target PASSWORD = Target.the("Input password").
            locatedBy("//input[@id='password']");
    public static Target COMFIRM_PASSWORD = Target.the("Input confirm password").
            locatedBy("//input[@id='confirmPassword']");
    public static Target CHECK_TERMS = Target.the("Check box Term of use").
            locatedBy("//span[@ng-class='{error: userForm.termOfUse.$error.required}']");
    public static Target CHECK_PRIVACY = Target.the("Check box Privacy and Security").
            locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static Target BTN_COMPLETE = Target.the("Button complete").
            locatedBy("//a[@id='laddaBtn']");

}
