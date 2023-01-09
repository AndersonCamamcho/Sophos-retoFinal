package com.demoqa.stepdefinitions;

import com.demoqa.tasks.AbrirDemoqa;
import com.demoqa.tasks.widgets.Widgets;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class WidgetsStepDefinitions {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());}

    @Given("^el usuario quiere configurar fehca$")
    public void elUsuarioQuiereConfigurarFehca(){
    theActorCalled("AnderBot").wasAbleTo(AbrirDemoqa.abrirPagina());

    }

    @When("^escoja las fechas$")
    public void escojaLasFechas() {
    theActorInTheSpotlight().attemptsTo(Widgets.widgets());

    }

    @Then("^Se mostraran las fechas escogidas$")
    public void seMostraranLasFechasEscogidas() {


    }
}
