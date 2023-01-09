package com.demoqa.interactions.alertsInteractions;

import com.demoqa.exceptions.ExceptionAlerts;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EsperarAlerta implements Task {

    private com.demoqa.userinterfaces.alertsFrameWindows.Alerts alertsFrameWindows;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(alertsFrameWindows.ALERTA_2));
        ExceptionAlerts.EsperaAlert(5);
        Serenity.getWebdriverManager().getWebdriver().switchTo().alert().accept();

    }
    public static EsperarAlerta esperarAlerta(){
        return Tasks.instrumented(EsperarAlerta.class);
    }
}
