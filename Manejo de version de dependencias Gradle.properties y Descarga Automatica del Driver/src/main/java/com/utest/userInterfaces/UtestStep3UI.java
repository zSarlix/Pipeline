package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestStep3UI {

    //STEP 3 DEVICES DATA

    public static Target BTN_FINAL_STEP = Target.the("Button final step").
            locatedBy("//a[@aria-label='Next - final step']");

    public static Target LIST_MOBILE = Target.the("Select mobile device ").
            locatedBy("//div[@placeholder='Select Brand']");

    public static Target MOBILE = Target.the("Select mobile device ").
            locatedBy("//input[@placeholder='Select Brand']");
    public static Target LIST_MODEL = Target.the("Select model").
            locatedBy("//div[@name='handsetModelId']");
    public static Target MODEL = Target.the("Select model").
            locatedBy("//input[@placeholder='Select a Model']");

    public static Target LIST_SYSTEM = Target.the("Select system").
            locatedBy("(//div[@placeholder='Select OS'])[2]");
    public static Target SYSTEM = Target.the("Select system").
            //locatedBy("//input[contains(@class,'form-control ui-select-search ng-pristine ng-valid ng-empty')]");
                    //locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]");
                    locatedBy("//div[@id='mobile-device']//div[@name='handsetOSId']//input[1]");


}
