package com.demoqa.tasks.widgets;

import com.demoqa.models.UserModel;
import com.demoqa.controllers.UserController;
import com.demoqa.userinterfaces.widgets.AgregarFechasWidgets;
import com.demoqa.userinterfaces.widgets.PaginaWidgets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class Widgets implements Task {

    private AgregarFechasWidgets agregarFechasWidgets;

    @Override
    public <T extends Actor> void performAs(T actor) {
        UserModel userEntity = new UserController().userGenerator();
        actor.attemptsTo(
                Scroll.to(PaginaWidgets.BOTON_WIDGETS),
                Click.on(PaginaWidgets.BOTON_WIDGETS),
                Scroll.to(AgregarFechasWidgets.BOTON_DATAPICKER),
                Click.on(AgregarFechasWidgets.BOTON_DATAPICKER),
                Enter.theValue(userEntity.getDate()).into(AgregarFechasWidgets.DATE).thenHit(Keys.ENTER),
                Enter.theValue(userEntity.getDateandtime()).into(AgregarFechasWidgets.DATEANDTIME).thenHit(Keys.ENTER)
        );

    }
    public static Widgets widgets (){
        return Tasks.instrumented(Widgets.class);
    }
}
