package com.demoqa.tasks.tablasWeb;


import com.demoqa.models.UserModel;
import com.demoqa.userinterfaces.tablasWeb.AgregarDatosTablasWeb;
import com.demoqa.userinterfaces.tablasWeb.PaginaElementos;
import com.demoqa.controllers.UserController;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class TablasWeb implements Task {







    @Override
    public <T extends Actor> void performAs(T actor) {
        UserModel userEntity = new UserController().userGenerator();

        actor.attemptsTo(
                Scroll.to(PaginaElementos.BOTON_ELEMENTOS),
                Click.on(PaginaElementos.BOTON_ELEMENTOS),
                Scroll.to(AgregarDatosTablasWeb.BOTON_TABLASWEB),
                Click.on(AgregarDatosTablasWeb.BOTON_TABLASWEB),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_1),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_2),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_3),
                Click.on(AgregarDatosTablasWeb.BOTON_REGISTER_FORM),
                //Desde aqui empieza a llenar los campos
                SendKeys.of(userEntity.getFirst_name()).into(AgregarDatosTablasWeb.FIRST_NAME),
                SendKeys.of(userEntity.getLast_name()).into(AgregarDatosTablasWeb.LAST_NAME),
                SendKeys.of(userEntity.getEmail()).into(AgregarDatosTablasWeb.EMAIL),
                SendKeys.of(Integer.toString(userEntity.getAge())).into(AgregarDatosTablasWeb.AGE),
                SendKeys.of(Integer.toString(userEntity.getSalary())).into(AgregarDatosTablasWeb.SALARY),
                SendKeys.of(userEntity.getDepartment()).into(AgregarDatosTablasWeb.DEPARTMENT),
                Click.on(AgregarDatosTablasWeb.SUBMIT)
    );


    }
    public static TablasWeb tablasWeb (){
        return Tasks.instrumented(TablasWeb.class);
    }

}
