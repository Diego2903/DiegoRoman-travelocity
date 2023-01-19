package com.travelocity.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantDias) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe obtener alguna opcion de hospedaje")
    public void viajeObtenerAlgunaOpcionHospedaje() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
