package com.demoqa.interactions.alertsInteractions;

import com.demoqa.controllers.UserController;
import com.demoqa.models.UserModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Alert;

public class EscribirNombre implements Task {


    private com.demoqa.userinterfaces.alertsFrameWindows.Alerts alertsFrameWindows;



    @Override
    public <T extends Actor> void performAs(T actor) {
        UserModel userEntity = new UserController().userGenerator();

        actor.attemptsTo(JavaScriptClick.on(alertsFrameWindows.ALERTA_4)
        );
        Alert alert = Serenity.getWebdriverManager().getWebdriver().switchTo().alert();
        alert.sendKeys(userEntity.getPromp_alert());
        alert.accept();

    }
    public static EscribirNombre enviarTexto (){
        return Tasks.instrumented(EscribirNombre.class);
    }
}
