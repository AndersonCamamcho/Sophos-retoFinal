package com.demoqa.interactions.alertsInteractions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class VerAlerta implements Task {


    private com.demoqa.userinterfaces.alertsFrameWindows.Alerts alertsFrameWindows;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(alertsFrameWindows.ALERTA_1));
        Serenity.getWebdriverManager().getWebdriver().switchTo().alert().accept();


    }
    public static VerAlerta aceptarAlertas (){
        return Tasks.instrumented(VerAlerta.class);
    }
}
