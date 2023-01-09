package com.demoqa.tasks.alertsFrameWindows;


import com.demoqa.interactions.alertsInteractions.*;
import com.demoqa.userinterfaces.alertsFrameWindows.PaginaAlertsFrameWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;


public class Alerts implements Task {



    private PaginaAlertsFrameWindows paginaAlertsFrameWindows;
    private com.demoqa.userinterfaces.alertsFrameWindows.Alerts alertsFrameWindows;




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PaginaAlertsFrameWindows.ALERTS_FRAME_WINDOWS),
                Click.on(PaginaAlertsFrameWindows.ALERTS_FRAME_WINDOWS),
                JavaScriptClick.on(alertsFrameWindows.ALERTAS)
        );

        actor.attemptsTo(VerAlerta.aceptarAlertas());
        actor.attemptsTo(EsperarAlerta.esperarAlerta());
        actor.attemptsTo(AceptarAlerta.aceptarAlerta());
        actor.attemptsTo(EscribirNombre.enviarTexto());


    }
    public static Alerts alerts (){
        return Tasks.instrumented(Alerts.class);
    }
}











    //private com.demoqa.tasks.alertsFrameWindows.alerts alerts;



        //driver= new driver.switchTo( ).alert( );
        //driver.findElment();
        //Alert alerts = driver.swithTo.().alert();
        //webElement().alert();




