package com.travelocity.stepdefinitions;


import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.tasks.SeleccionarInicioSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinitions {

    @Dado("que {actor} quiera iniciar sesion con su cuenta")
    public void iniciarSesionConCuenta(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class)
        );
    }
    @Cuando("ingresa los valores correctos de {string} y {string}")
    public void ingresarDatos(String correo, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarInicioSesion.correoContrasena(correo, contrasena)
        );
    }
    @Entonces("{actor} debe ser dirigido a la pagina de inicio")
    public void completarFormularioInicioSesion(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class)
        );
    }
}
