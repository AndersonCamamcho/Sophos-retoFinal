package com.demoqa.stepdefinitions;

import com.demoqa.questions.ValidarAlertas;
import com.demoqa.tasks.AbrirDemoqa;
import com.demoqa.tasks.alertsFrameWindows.Alerts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class AlertsFrameWindowsStepDefinition {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());}

    @Given("^Ingreso al apartado de alertas$")
    public void ingresoAlApartadoDeAlertas() {
        theActorCalled("anderBot").wasAbleTo(AbrirDemoqa.abrirPagina());

    }

    @When("^interactuo con las alertas$")
    public void interactuoConLasAlertas() {
        theActorInTheSpotlight().attemptsTo(Alerts.alerts());

    }

    @Then("^me muestra sus funciones$")
    public void meMuestraSusFunciones() {

        theActorInTheSpotlight().should(seeThat(ValidarAlertas.questionPrompt(),
                equalTo(true)));






    }



}
