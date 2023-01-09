package com.demoqa.tasks;

import com.demoqa.userinterfaces.Demoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirDemoqa implements Task {

    private Demoqa demoqa;

    public static Performable abrirPagina() {
        return Tasks.instrumented(AbrirDemoqa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoqa));
        
    }
}
