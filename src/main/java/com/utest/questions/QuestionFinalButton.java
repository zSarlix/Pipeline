package com.utest.questions;

import net.serenitybdd.screenplay.Question;


import static com.utest.userInterfaces.UtestStep4UI.BTN_COMPLETE;

public class QuestionFinalButton {
    public static Question<String> questionButton() {
        return actor -> BTN_COMPLETE.resolveFor(actor).getText().trim();
    }
}
