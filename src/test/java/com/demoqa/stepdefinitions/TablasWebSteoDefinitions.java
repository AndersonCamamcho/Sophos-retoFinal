package com.demoqa.stepdefinitions;

import com.demoqa.questions.ValidarTablasWeb;
import com.demoqa.tasks.AbrirDemoqa;
import com.demoqa.tasks.tablasWeb.TablasWeb;
import com.demoqa.userinterfaces.tablasWeb.AgregarDatosTablasWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;


public class TablasWebSteoDefinitions {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());

    }
    
    @Given("^la persona quiere registrarse$")
    public void AbrirPaginasRequeridas() {
    theActorCalled("anderBot").wasAbleTo(AbrirDemoqa.abrirPagina());

    }
    @When("^llene los campos requeridos$")
    public void lleneLosCamposRequeridos() {
        theActorInTheSpotlight().attemptsTo(TablasWeb.tablasWeb());




    }

    @Then("^quedara registrado de manera exitosa$")
    public void quedaraRegistradoDeManeraExitosa( ) {

        theActorInTheSpotlight().should(seeThat(ValidarTablasWeb.getTex(AgregarDatosTablasWeb.QUESTION_TABLAS_WEB),
                equalTo("Automatizacion")));



    }
}
