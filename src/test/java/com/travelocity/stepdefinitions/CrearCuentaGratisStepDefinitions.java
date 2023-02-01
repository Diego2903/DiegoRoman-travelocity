package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoHospedaje;
import com.travelocity.userinterface.HospedajesEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class HospedajeStepDefinitions {

    @Dado("{actor} esta en {string} con su familia")
    public void destinoActual(Actor actor, String destino) {
        actor.attemptsTo(
            SeleccionarDestinoHospedaje.para(destino)
        );
    }
    @Cuando("quiera reservar por {int} dias para {int} Adultos")
    public void reservaConDiasYAdultos(Integer cantidadDias, Integer cantAdultos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoHospedaje.cantidadDiasYCantidadPersonas(cantidadDias, cantAdultos)
        );
    }

    @Cuando("quiera reservar por {int} dias para {int} adultos agregando auto")
    public void reservaConOpcionDeAuto(){
        OnStage.theActorInTheSpotlight().attemptsTo(
//            AgregarAuto.para
        );
    }
    @Entonces("debe visualizar al menos una opcion de hotel")
    public void debeObtenerAlgunaOpcionDeHospedaje() {
        Ensure.that(HospedajesEncontrados.DIV_HOSPEDAJES_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Entonces("debe visualizar al menos una opcion de paquete")
    public void debeVisualizarAlgunaOpcionDePaquete() {

    }
}
