package com.demoqa.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class ValidarAlertas implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Serenity.getWebdriverManager().getWebdriver().findElement(By.id("promptResult")).isDisplayed();
    }
    public static ValidarAlertas questionPrompt () {return new ValidarAlertas();}
}
