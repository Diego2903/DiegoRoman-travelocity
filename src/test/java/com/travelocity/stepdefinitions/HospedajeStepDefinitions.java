package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoHospedaje;
import com.travelocity.tasks.SeleccionarFechasHospedaje;
import com.travelocity.userinterface.DetalleHospedaje;
import com.travelocity.userinterface.HospedajesEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class HospedajeStepDefinitions {

    @Dado("{actor} esta en {string} y desea realizar una reserva en un hotel de la cuidad")
    public void destinoActual(Actor actor, String destino) {
        actor.attemptsTo(
            SeleccionarDestinoHospedaje.para(destino)
        );
    }

    @Cuando("realice el proceso de reserva por {int} dias desde la fecha actual para {int} Adultos")
    public void reservaConDiasYAdultos(Integer cantidadDias, Integer cantAdultos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarFechasHospedaje.diasYCantAdultos(cantidadDias, cantAdultos)
        );
    }

    @Entonces("debe visualizar al menos una opcion de hotel")
    public void opcionDeHotel(){
        Ensure.that(HospedajesEncontrados.DIV_HOSPEDAJES_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} y desea realizar una reserva de un hotel con auto incluido")
    public void reservaHotelConAutoIncluido(Actor actor, String cuidadHospedaje) {
        actor.attemptsTo(
                SeleccionarDestinoHospedaje.para(cuidadHospedaje)
        );
    }
    @Cuando("realice el proceso de reserva por {int} dias desde la fecha actual para {int} adultos con la opcion de agregar auto")
    public void reservaConOpcionAuto(Integer diasHospedaje, Integer cantAdultos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(DetalleHospedaje.INP_CHECK_AUTO).afterWaitingUntilEnabled(),
                SeleccionarFechasHospedaje.diasYCantAdultos(diasHospedaje, cantAdultos)
        );
    }
    @Entonces("debe visualizar al menos una opcion de hotel con auto incluido")
    public void opcionHotelConAutoIncluido() {
        Ensure.that(HospedajesEncontrados.DIV_HOSPEDAJES_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} desea realizar una reserva de hotel en {string} con opcion de agregar vuelo")
    public void reservaHotelConVueloIncluido(Actor actor, String origenParaVuelo, String destinoHospedaje) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("realice la reserva por {int} dias para {int} adultos con la opcion de agregar un vuelo")
    public void reservaHotelConOpcionAgregarVuelo(Integer diasHospedaje, Integer cantAdultos) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe visualizar al menos una opcion de hospedaje con vuelo incluido")
    public void opcionDeHospedajeConVueloIncluido() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
